package typings.googleAppsScript.GoogleAppsScript.Classroom.Collection

import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfiles.GuardianInvitationsCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfiles.GuardiansCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.UserProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserProfilesCollection extends js.Object {
  
  var GuardianInvitations: js.UndefOr[GuardianInvitationsCollection] = js.native
  
  var Guardians: js.UndefOr[GuardiansCollection] = js.native
  
  // Returns a user profile.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access
  // this user profile, if no profile exists with the requested ID, or for
  // access errors.
  def get(userId: String): UserProfile = js.native
}
object UserProfilesCollection {
  
  @scala.inline
  def apply(get: String => UserProfile): UserProfilesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
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
    def setGuardianInvitations(value: GuardianInvitationsCollection): Self = this.set("GuardianInvitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuardianInvitations: Self = this.set("GuardianInvitations", js.undefined)
    
    @scala.inline
    def setGuardians(value: GuardiansCollection): Self = this.set("Guardians", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuardians: Self = this.set("Guardians", js.undefined)
  }
}
