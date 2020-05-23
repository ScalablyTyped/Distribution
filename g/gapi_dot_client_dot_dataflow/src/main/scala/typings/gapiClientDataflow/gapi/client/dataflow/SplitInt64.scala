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
  def apply(highBits: js.UndefOr[Double] = js.undefined, lowBits: js.UndefOr[Double] = js.undefined): SplitInt64 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highBits)) __obj.updateDynamic("highBits")(highBits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lowBits)) __obj.updateDynamic("lowBits")(lowBits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitInt64]
  }
}

