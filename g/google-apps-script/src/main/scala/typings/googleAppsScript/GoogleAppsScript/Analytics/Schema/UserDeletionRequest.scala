package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDeletionRequest extends js.Object {
  var deletionRequestTime: js.UndefOr[String] = js.native
  var firebaseProjectId: js.UndefOr[String] = js.native
  var id: js.UndefOr[UserDeletionRequestId] = js.native
  var kind: js.UndefOr[String] = js.native
  var webPropertyId: js.UndefOr[String] = js.native
}

object UserDeletionRequest {
  @scala.inline
  def apply(): UserDeletionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDeletionRequest]
  }
  @scala.inline
  implicit class UserDeletionRequestOps[Self <: UserDeletionRequest] (val x: Self) extends AnyVal {
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
    def setDeletionRequestTime(value: String): Self = this.set("deletionRequestTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionRequestTime: Self = this.set("deletionRequestTime", js.undefined)
    @scala.inline
    def setFirebaseProjectId(value: String): Self = this.set("firebaseProjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirebaseProjectId: Self = this.set("firebaseProjectId", js.undefined)
    @scala.inline
    def setId(value: UserDeletionRequestId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
  
}

