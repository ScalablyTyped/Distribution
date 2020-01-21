package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceOperationResponse extends js.Object {
  /** A response to a request to get metadata about a source. */
  var getMetadata: js.UndefOr[SourceGetMetadataResponse] = js.undefined
  /** A response to a request to split a source. */
  var split: js.UndefOr[SourceSplitResponse] = js.undefined
}

object SourceOperationResponse {
  @scala.inline
  def apply(getMetadata: SourceGetMetadataResponse = null, split: SourceSplitResponse = null): SourceOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (getMetadata != null) __obj.updateDynamic("getMetadata")(getMetadata.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOperationResponse]
  }
}

