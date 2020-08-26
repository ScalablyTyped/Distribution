package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateStatusResponse extends js.Object {
  var errors: js.UndefOr[js.Array[ValidateError]] = js.native
  var isMetadataOnly: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object ValidateStatusResponse {
  @scala.inline
  def apply(): ValidateStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateStatusResponse]
  }
  @scala.inline
  implicit class ValidateStatusResponseOps[Self <: ValidateStatusResponse] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: ValidateError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[ValidateError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setIsMetadataOnly(value: Boolean): Self = this.set("isMetadataOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMetadataOnly: Self = this.set("isMetadataOnly", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

