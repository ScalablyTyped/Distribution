package typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for the `BatchWriteSpans` method.
  */
@js.native
trait Schema$BatchWriteSpansRequest extends js.Object {
  /**
    * A list of new spans. The span names must not match existing spans, or the
    * results are undefined.
    */
  var spans: js.UndefOr[js.Array[Schema$Span]] = js.native
}

object Schema$BatchWriteSpansRequest {
  @scala.inline
  def apply(spans: js.Array[Schema$Span] = null): Schema$BatchWriteSpansRequest = {
    val __obj = js.Dynamic.literal()
    if (spans != null) __obj.updateDynamic("spans")(spans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchWriteSpansRequest]
  }
}

