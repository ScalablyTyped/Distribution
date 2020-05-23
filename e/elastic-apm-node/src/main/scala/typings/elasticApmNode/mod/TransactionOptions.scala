package typings.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOptions extends js.Object {
  var childOf: js.UndefOr[Transaction | Span | String] = js.undefined
  var startTime: js.UndefOr[Double] = js.undefined
}

object TransactionOptions {
  @scala.inline
  def apply(childOf: Transaction | Span | String = null, startTime: js.UndefOr[Double] = js.undefined): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (childOf != null) __obj.updateDynamic("childOf")(childOf.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionOptions]
  }
}

