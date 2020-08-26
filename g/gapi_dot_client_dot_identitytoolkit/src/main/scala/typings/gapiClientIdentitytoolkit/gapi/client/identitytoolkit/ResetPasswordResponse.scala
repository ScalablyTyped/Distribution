package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetPasswordResponse extends js.Object {
  /** The user's email. If the out-of-band code is for email recovery, the user's original email. */
  var email: js.UndefOr[String] = js.native
  /** The fixed string "identitytoolkit#ResetPasswordResponse". */
  var kind: js.UndefOr[String] = js.native
  /** If the out-of-band code is for email recovery, the user's new email. */
  var newEmail: js.UndefOr[String] = js.native
  /** The request type. */
  var requestType: js.UndefOr[String] = js.native
}

object ResetPasswordResponse {
  @scala.inline
  def apply(): ResetPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetPasswordResponse]
  }
  @scala.inline
  implicit class ResetPasswordResponseOps[Self <: ResetPasswordResponse] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNewEmail(value: String): Self = this.set("newEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewEmail: Self = this.set("newEmail", js.undefined)
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
  }
  
}

