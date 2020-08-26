package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCompanyResponse extends js.Object {
  /** The company. */
  var company: js.UndefOr[Company] = js.native
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.native
}

object GetCompanyResponse {
  @scala.inline
  def apply(): GetCompanyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompanyResponse]
  }
  @scala.inline
  implicit class GetCompanyResponseOps[Self <: GetCompanyResponse] (val x: Self) extends AnyVal {
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
    def setCompany(value: Company): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    @scala.inline
    def setResponseMetadata(value: ResponseMetadata): Self = this.set("responseMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMetadata: Self = this.set("responseMetadata", js.undefined)
  }
  
}

