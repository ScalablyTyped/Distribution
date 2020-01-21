package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionRequest extends js.Object {
  var chainId: js.UndefOr[Double | js.Promise[Double]] = js.undefined
  var data: js.UndefOr[Arrayish | js.Promise[Arrayish]] = js.undefined
  var from: js.UndefOr[String | js.Promise[String]] = js.undefined
  var gasLimit: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.undefined
  var gasPrice: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.undefined
  var nonce: js.UndefOr[Double | String | (js.Promise[Double | String])] = js.undefined
  var to: js.UndefOr[String | js.Promise[String]] = js.undefined
  var value: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.undefined
}

object TransactionRequest {
  @scala.inline
  def apply(
    chainId: Double | js.Promise[Double] = null,
    data: Arrayish | js.Promise[Arrayish] = null,
    from: String | js.Promise[String] = null,
    gasLimit: BigNumberish | js.Promise[BigNumberish] = null,
    gasPrice: BigNumberish | js.Promise[BigNumberish] = null,
    nonce: Double | String | (js.Promise[Double | String]) = null,
    to: String | js.Promise[String] = null,
    value: BigNumberish | js.Promise[BigNumberish] = null
  ): TransactionRequest = {
    val __obj = js.Dynamic.literal()
    if (chainId != null) __obj.updateDynamic("chainId")(chainId.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (gasLimit != null) __obj.updateDynamic("gasLimit")(gasLimit.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRequest]
  }
}

