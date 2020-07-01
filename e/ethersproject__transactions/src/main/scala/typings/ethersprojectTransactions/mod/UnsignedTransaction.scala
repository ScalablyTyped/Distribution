package typings.ethersprojectTransactions.mod

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsignedTransaction extends js.Object {
  var chainId: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[BytesLike] = js.undefined
  var gasLimit: js.UndefOr[BigNumberish] = js.undefined
  var gasPrice: js.UndefOr[BigNumberish] = js.undefined
  var nonce: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[BigNumberish] = js.undefined
}

object UnsignedTransaction {
  @scala.inline
  def apply(
    chainId: js.UndefOr[Double] = js.undefined,
    data: BytesLike = null,
    gasLimit: BigNumberish = null,
    gasPrice: BigNumberish = null,
    nonce: js.UndefOr[Double] = js.undefined,
    to: String = null,
    value: BigNumberish = null
  ): UnsignedTransaction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chainId)) __obj.updateDynamic("chainId")(chainId.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (gasLimit != null) __obj.updateDynamic("gasLimit")(gasLimit.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (!js.isUndefined(nonce)) __obj.updateDynamic("nonce")(nonce.get.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsignedTransaction]
  }
}

