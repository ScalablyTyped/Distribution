package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitInt64 extends js.Object {
  /** The high order bits, including the sign: n >> 32. */
  var highBits: js.UndefOr[scala.Double] = js.undefined
  /** The low order bits: n & 0xffffffff. */
  var lowBits: js.UndefOr[scala.Double] = js.undefined
}

object SplitInt64 {
  @scala.inline
  def apply(highBits: scala.Int | scala.Double = null, lowBits: scala.Int | scala.Double = null): SplitInt64 = {
    val __obj = js.Dynamic.literal()
    if (highBits != null) __obj.updateDynamic("highBits")(highBits.asInstanceOf[js.Any])
    if (lowBits != null) __obj.updateDynamic("lowBits")(lowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitInt64]
  }
}

