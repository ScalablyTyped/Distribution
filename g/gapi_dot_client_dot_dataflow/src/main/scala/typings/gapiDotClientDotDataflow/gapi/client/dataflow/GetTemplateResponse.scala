package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTemplateResponse extends js.Object {
  /**
    * The template metadata describing the template name, available
    * parameters, etc.
    */
  var metadata: js.UndefOr[TemplateMetadata] = js.undefined
  /**
    * The status of the get template request. Any problems with the
    * request will be indicated in the error_details.
    */
  var status: js.UndefOr[Status] = js.undefined
}

object GetTemplateResponse {
  @scala.inline
  def apply(metadata: TemplateMetadata = null, status: Status = null): GetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateResponse]
  }
}

