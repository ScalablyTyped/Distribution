package typings.ethersprojectTransactions.mod

import typings.ethersprojectBignumber.mod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var chainId: Double
  var data: String
  var from: js.UndefOr[String] = js.undefined
  var gasLimit: BigNumber
  var gasPrice: BigNumber
  var hash: js.UndefOr[String] = js.undefined
  var nonce: Double
  var r: js.UndefOr[String] = js.undefined
  var s: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
  var v: js.UndefOr[Double] = js.undefined
  var value: BigNumber
}

object Transaction {
  @scala.inline
  def apply(
    chainId: Double,
    data: String,
    gasLimit: BigNumber,
    gasPrice: BigNumber,
    nonce: Double,
    value: BigNumber,
    from: String = null,
    hash: String = null,
    r: String = null,
    s: String = null,
    to: String = null,
    v: js.UndefOr[Double] = js.undefined
  ): Transaction = {
    val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

