package typings.ethereumDashProtocol.ethereumDashProtocolMod

import typings.bignumberDotJs.bignumberDotJsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallData extends CallTxDataBase {
  var from: js.UndefOr[String] = js.undefined
}

object CallData {
  @scala.inline
  def apply(
    data: String = null,
    from: String = null,
    gas: Double | String | default = null,
    gasPrice: Double | String | default = null,
    nonce: Int | Double = null,
    to: String = null,
    value: Double | String | default = null
  ): CallData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (from != null) __obj.updateDynamic("from")(from)
    if (gas != null) __obj.updateDynamic("gas")(gas.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallData]
  }
}

