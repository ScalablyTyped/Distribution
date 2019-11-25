package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceOperationRequest extends js.Object {
  /** Information about a request to get metadata about a source. */
  var getMetadata: js.UndefOr[SourceGetMetadataRequest] = js.undefined
  /** Information about a request to split a source. */
  var split: js.UndefOr[SourceSplitRequest] = js.undefined
}

object SourceOperationRequest {
  @scala.inline
  def apply(getMetadata: SourceGetMetadataRequest = null, split: SourceSplitRequest = null): SourceOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (getMetadata != null) __obj.updateDynamic("getMetadata")(getMetadata.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOperationRequest]
  }
}

