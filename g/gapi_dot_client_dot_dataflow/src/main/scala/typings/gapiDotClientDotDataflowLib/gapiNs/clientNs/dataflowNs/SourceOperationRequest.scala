package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

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
    if (getMetadata != null) __obj.updateDynamic("getMetadata")(getMetadata)
    if (split != null) __obj.updateDynamic("split")(split)
    __obj.asInstanceOf[SourceOperationRequest]
  }
}

