package typings.fhirKitClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartAuthMetadata extends js.Object {
  var authorizeUrl: js.UndefOr[String] = js.native
  var manageUrl: js.UndefOr[String] = js.native
  var registerUrl: js.UndefOr[String] = js.native
  var tokenUrl: js.UndefOr[String] = js.native
}

object SmartAuthMetadata {
  @scala.inline
  def apply(): SmartAuthMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartAuthMetadata]
  }
  @scala.inline
  implicit class SmartAuthMetadataOps[Self <: SmartAuthMetadata] (val x: Self) extends AnyVal {
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
    def setAuthorizeUrl(value: String): Self = this.set("authorizeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizeUrl: Self = this.set("authorizeUrl", js.undefined)
    @scala.inline
    def setManageUrl(value: String): Self = this.set("manageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManageUrl: Self = this.set("manageUrl", js.undefined)
    @scala.inline
    def setRegisterUrl(value: String): Self = this.set("registerUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisterUrl: Self = this.set("registerUrl", js.undefined)
    @scala.inline
    def setTokenUrl(value: String): Self = this.set("tokenUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenUrl: Self = this.set("tokenUrl", js.undefined)
  }
  
}

