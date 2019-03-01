package typings
package gapiDotClientDotCloudtraceLib.gapiNs.clientNs.cloudtraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchWriteSpansRequest extends js.Object {
  /** A collection of spans. */
  var spans: js.UndefOr[js.Array[Span]] = js.undefined
}

object BatchWriteSpansRequest {
  @scala.inline
  def apply(spans: js.Array[Span] = null): BatchWriteSpansRequest = {
    val __obj = js.Dynamic.literal()
    if (spans != null) __obj.updateDynamic("spans")(spans)
    __obj.asInstanceOf[BatchWriteSpansRequest]
  }
}

