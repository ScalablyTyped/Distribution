package typings.devtoolsProtocol.mod.Protocol.Security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOverrideCertificateErrorsRequest extends js.Object {
  /**
    * If true, certificate errors will be overridden.
    */
  var `override`: Boolean = js.native
}

object SetOverrideCertificateErrorsRequest {
  @scala.inline
  def apply(`override`: Boolean): SetOverrideCertificateErrorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOverrideCertificateErrorsRequest]
  }
  @scala.inline
  implicit class SetOverrideCertificateErrorsRequestOps[Self <: SetOverrideCertificateErrorsRequest] (val x: Self) extends AnyVal {
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
    def setOverride(value: Boolean): Self = this.set("override", value.asInstanceOf[js.Any])
  }
  
}

