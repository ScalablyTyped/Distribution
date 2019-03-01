package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceGetMetadataRequest extends js.Object {
  /** Specification of the source whose metadata should be computed. */
  var source: js.UndefOr[Source] = js.undefined
}

object SourceGetMetadataRequest {
  @scala.inline
  def apply(source: Source = null): SourceGetMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SourceGetMetadataRequest]
  }
}

