package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitInt64 extends js.Object {
  /** The high order bits, including the sign: n >> 32. */
  var highBits: js.UndefOr[Double] = js.undefined
  /** The low order bits: n & 0xffffffff. */
  var lowBits: js.UndefOr[Double] = js.undefined
}

object SplitInt64 {
  @scala.inline
  def apply(highBits: Int | Double = null, lowBits: Int | Double = null): SplitInt64 = {
    val __obj = js.Dynamic.literal()
    if (highBits != null) __obj.updateDynamic("highBits")(highBits.asInstanceOf[js.Any])
    if (lowBits != null) __obj.updateDynamic("lowBits")(lowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitInt64]
  }
}

