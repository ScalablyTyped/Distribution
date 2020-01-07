package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a GetTemplate request.
  */
@js.native
trait Schema$GetTemplateResponse extends js.Object {
  /**
    * The template metadata describing the template name, available parameters,
    * etc.
    */
  var metadata: js.UndefOr[Schema$TemplateMetadata] = js.native
  /**
    * The status of the get template request. Any problems with the request
    * will be indicated in the error_details.
    */
  var status: js.UndefOr[Schema$Status] = js.native
}

object Schema$GetTemplateResponse {
  @scala.inline
  def apply(metadata: Schema$TemplateMetadata = null, status: Schema$Status = null): Schema$GetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetTemplateResponse]
  }
}

