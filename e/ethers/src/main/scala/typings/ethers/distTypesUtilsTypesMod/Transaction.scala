package typings.ethers.distTypesUtilsTypesMod

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
    v: Int | Double = null
  ): Transaction = {
    val __obj = js.Dynamic.literal(chainId = chainId, data = data, gasLimit = gasLimit, gasPrice = gasPrice, nonce = nonce, value = value)
    if (from != null) __obj.updateDynamic("from")(from)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (r != null) __obj.updateDynamic("r")(r)
    if (s != null) __obj.updateDynamic("s")(s)
    if (to != null) __obj.updateDynamic("to")(to)
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

