package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateStatusRequest extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var validationId: js.UndefOr[String] = js.native
}

object ValidateStatusRequest {
  @scala.inline
  def apply(): ValidateStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateStatusRequest]
  }
  @scala.inline
  implicit class ValidateStatusRequestOps[Self <: ValidateStatusRequest] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setValidationId(value: String): Self = this.set("validationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationId: Self = this.set("validationId", js.undefined)
  }
  
}

