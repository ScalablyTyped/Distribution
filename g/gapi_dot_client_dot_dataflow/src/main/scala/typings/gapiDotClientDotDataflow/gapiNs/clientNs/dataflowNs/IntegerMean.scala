package typings.gapiDotClientDotDataflow.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerMean extends js.Object {
  /** The number of values being aggregated. */
  var count: js.UndefOr[SplitInt64] = js.undefined
  /** The sum of all values being aggregated. */
  var sum: js.UndefOr[SplitInt64] = js.undefined
}

object IntegerMean {
  @scala.inline
  def apply(count: SplitInt64 = null, sum: SplitInt64 = null): IntegerMean = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (sum != null) __obj.updateDynamic("sum")(sum)
    __obj.asInstanceOf[IntegerMean]
  }
}

