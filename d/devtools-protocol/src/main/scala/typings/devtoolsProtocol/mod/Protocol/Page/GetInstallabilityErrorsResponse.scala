package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstallabilityErrorsResponse extends js.Object {
  var installabilityErrors: js.Array[InstallabilityError] = js.native
}

object GetInstallabilityErrorsResponse {
  @scala.inline
  def apply(installabilityErrors: js.Array[InstallabilityError]): GetInstallabilityErrorsResponse = {
    val __obj = js.Dynamic.literal(installabilityErrors = installabilityErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstallabilityErrorsResponse]
  }
  @scala.inline
  implicit class GetInstallabilityErrorsResponseOps[Self <: GetInstallabilityErrorsResponse] (val x: Self) extends AnyVal {
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
    def setInstallabilityErrorsVarargs(value: InstallabilityError*): Self = this.set("installabilityErrors", js.Array(value :_*))
    @scala.inline
    def setInstallabilityErrors(value: js.Array[InstallabilityError]): Self = this.set("installabilityErrors", value.asInstanceOf[js.Any])
  }
  
}

