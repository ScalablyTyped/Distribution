package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a SourceOperationRequest, specified in
  * ReportWorkItemStatusRequest.source_operation when the work item is
  * completed.
  */
@js.native
trait Schema$SourceOperationResponse extends js.Object {
  /**
    * A response to a request to get metadata about a source.
    */
  var getMetadata: js.UndefOr[Schema$SourceGetMetadataResponse] = js.native
  /**
    * A response to a request to split a source.
    */
  var split: js.UndefOr[Schema$SourceSplitResponse] = js.native
}

object Schema$SourceOperationResponse {
  @scala.inline
  def apply(getMetadata: Schema$SourceGetMetadataResponse = null, split: Schema$SourceSplitResponse = null): Schema$SourceOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (getMetadata != null) __obj.updateDynamic("getMetadata")(getMetadata.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceOperationResponse]
  }
}

