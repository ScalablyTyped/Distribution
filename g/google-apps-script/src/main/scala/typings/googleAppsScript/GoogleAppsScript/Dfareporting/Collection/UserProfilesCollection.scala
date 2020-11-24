package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.UserProfile
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.UserProfileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserProfilesCollection extends js.Object {
  
  // Gets one user profile by ID.
  def get(profileId: String): UserProfile = js.native
  
  // Retrieves list of user profiles for a user.
  def list(): UserProfileList = js.native
}
object UserProfilesCollection {
  
  @scala.inline
  def apply(get: String => UserProfile, list: () => UserProfileList): UserProfilesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list))
    __obj.asInstanceOf[UserProfilesCollection]
  }
  
  @scala.inline
  implicit class UserProfilesCollectionOps[Self <: UserProfilesCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: String => UserProfile): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: () => UserProfileList): Self = this.set("list", js.Any.fromFunction0(value))
  }
}
