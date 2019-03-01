package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TxDataPayable extends TxData {
  @JSName("value")
  var value_TxDataPayable: js.UndefOr[bignumberDotJsLib.bignumberDotJsMod.default] = js.undefined
}

object TxDataPayable {
  @scala.inline
  def apply(
    from: java.lang.String,
    data: java.lang.String = null,
    gas: scala.Double | java.lang.String | bignumberDotJsLib.bignumberDotJsMod.default = null,
    gasPrice: scala.Double | java.lang.String | bignumberDotJsLib.bignumberDotJsMod.default = null,
    nonce: scala.Int | scala.Double = null,
    to: java.lang.String = null,
    value: bignumberDotJsLib.bignumberDotJsMod.default = null
  ): TxDataPayable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    if (data != null) __obj.updateDynamic("data")(data)
    if (gas != null) __obj.updateDynamic("gas")(gas.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TxDataPayable]
  }
}

