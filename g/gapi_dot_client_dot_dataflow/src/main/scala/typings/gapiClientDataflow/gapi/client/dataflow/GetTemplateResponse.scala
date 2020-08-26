package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTemplateResponse extends js.Object {
  /**
    * The template metadata describing the template name, available
    * parameters, etc.
    */
  var metadata: js.UndefOr[TemplateMetadata] = js.native
  /**
    * The status of the get template request. Any problems with the
    * request will be indicated in the error_details.
    */
  var status: js.UndefOr[Status] = js.native
}

object GetTemplateResponse {
  @scala.inline
  def apply(): GetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateResponse]
  }
  @scala.inline
  implicit class GetTemplateResponseOps[Self <: GetTemplateResponse] (val x: Self) extends AnyVal {
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
    def setMetadata(value: TemplateMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

