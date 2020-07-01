package typings.diagnosticChannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpanContext extends js.Object {
  var spanId: String
  var traceFlags: js.UndefOr[String] = js.undefined
  var traceId: String
  var tracestate: js.UndefOr[String] = js.undefined
}

object ISpanContext {
  @scala.inline
  def apply(spanId: String, traceId: String, traceFlags: String = null, tracestate: String = null): ISpanContext = {
    val __obj = js.Dynamic.literal(spanId = spanId.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
    if (traceFlags != null) __obj.updateDynamic("traceFlags")(traceFlags.asInstanceOf[js.Any])
    if (tracestate != null) __obj.updateDynamic("tracestate")(tracestate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpanContext]
  }
}

