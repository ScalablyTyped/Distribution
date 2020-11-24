package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.UserDeletion

import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.UserDeletionRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDeletionRequestCollection extends js.Object {
  
  // Insert or update a user deletion requests.
  def upsert(resource: UserDeletionRequest): UserDeletionRequest = js.native
}
object UserDeletionRequestCollection {
  
  @scala.inline
  def apply(upsert: UserDeletionRequest => UserDeletionRequest): UserDeletionRequestCollection = {
    val __obj = js.Dynamic.literal(upsert = js.Any.fromFunction1(upsert))
    __obj.asInstanceOf[UserDeletionRequestCollection]
  }
  
  @scala.inline
  implicit class UserDeletionRequestCollectionOps[Self <: UserDeletionRequestCollection] (val x: Self) extends AnyVal {
    
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
    def setUpsert(value: UserDeletionRequest => UserDeletionRequest): Self = this.set("upsert", js.Any.fromFunction1(value))
  }
}
