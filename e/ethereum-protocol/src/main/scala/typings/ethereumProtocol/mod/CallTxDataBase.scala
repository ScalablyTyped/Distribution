package typings.ethereumProtocol.mod

import typings.bignumberJs.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallTxDataBase extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var gas: js.UndefOr[Double | String | default] = js.undefined
  var gasPrice: js.UndefOr[Double | String | default] = js.undefined
  var nonce: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double | String | default] = js.undefined
}

object CallTxDataBase {
  @scala.inline
  def apply(
    data: String = null,
    gas: Double | String | default = null,
    gasPrice: Double | String | default = null,
    nonce: Int | Double = null,
    to: String = null,
    value: Double | String | default = null
  ): CallTxDataBase = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (gas != null) __obj.updateDynamic("gas")(gas.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallTxDataBase]
  }
}

