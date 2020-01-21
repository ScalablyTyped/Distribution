package typings.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpanOptions extends js.Object {
  var childOf: js.UndefOr[Transaction | Span | String] = js.undefined
}

object SpanOptions {
  @scala.inline
  def apply(childOf: Transaction | Span | String = null): SpanOptions = {
    val __obj = js.Dynamic.literal()
    if (childOf != null) __obj.updateDynamic("childOf")(childOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpanOptions]
  }
}

