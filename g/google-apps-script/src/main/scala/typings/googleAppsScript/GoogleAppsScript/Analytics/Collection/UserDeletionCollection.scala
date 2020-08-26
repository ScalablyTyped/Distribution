package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection

import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.UserDeletion.UserDeletionRequestCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDeletionCollection extends js.Object {
  var UserDeletionRequest: js.UndefOr[UserDeletionRequestCollection] = js.native
}

object UserDeletionCollection {
  @scala.inline
  def apply(): UserDeletionCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDeletionCollection]
  }
  @scala.inline
  implicit class UserDeletionCollectionOps[Self <: UserDeletionCollection] (val x: Self) extends AnyVal {
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
    def setUserDeletionRequest(value: UserDeletionRequestCollection): Self = this.set("UserDeletionRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDeletionRequest: Self = this.set("UserDeletionRequest", js.undefined)
  }
  
}

