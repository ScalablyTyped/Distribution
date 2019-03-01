package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallTxDataBase extends js.Object {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var gas: js.UndefOr[scala.Double | java.lang.String | bignumberDotJsLib.bignumberDotJsMod.default] = js.undefined
  var gasPrice: js.UndefOr[scala.Double | java.lang.String | bignumberDotJsLib.bignumberDotJsMod.default] = js.undefined
  var nonce: js.UndefOr[scala.Double] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double | java.lang.String | bignumberDotJsLib.bignumberDotJsMod.default] = js.undefined
}

object CallTxDataBase {
  @scala.inline
  def apply(
    data: java.lang.String = null,
    gas: scala.Double | java.lang.String | bignumberDotJsLib.bignumberDotJsMod.default = null,
    gasPrice: scala.Double | java.lang.String | bignumberDotJsLib.bignumberDotJsMod.default = null,
    nonce: scala.Int | scala.Double = null,
    to: java.lang.String = null,
    value: scala.Double | java.lang.String | bignumberDotJsLib.bignumberDotJsMod.default = null
  ): CallTxDataBase = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (gas != null) __obj.updateDynamic("gas")(gas.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallTxDataBase]
  }
}

