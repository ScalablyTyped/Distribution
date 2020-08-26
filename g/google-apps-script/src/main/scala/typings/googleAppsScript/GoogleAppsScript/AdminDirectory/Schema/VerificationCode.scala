package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerificationCode extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var userId: js.UndefOr[String] = js.native
  var verificationCode: js.UndefOr[String] = js.native
}

object VerificationCode {
  @scala.inline
  def apply(): VerificationCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerificationCode]
  }
  @scala.inline
  implicit class VerificationCodeOps[Self <: VerificationCode] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    @scala.inline
    def setVerificationCode(value: String): Self = this.set("verificationCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerificationCode: Self = this.set("verificationCode", js.undefined)
  }
  
}

