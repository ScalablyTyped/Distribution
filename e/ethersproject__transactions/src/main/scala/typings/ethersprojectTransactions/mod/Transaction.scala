package typings.ethersprojectTransactions.mod

import typings.ethersprojectBignumber.mod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  var chainId: Double = js.native
  var data: String = js.native
  var from: js.UndefOr[String] = js.native
  var gasLimit: BigNumber = js.native
  var gasPrice: BigNumber = js.native
  var hash: js.UndefOr[String] = js.native
  var nonce: Double = js.native
  var r: js.UndefOr[String] = js.native
  var s: js.UndefOr[String] = js.native
  var to: js.UndefOr[String] = js.native
  var v: js.UndefOr[Double] = js.native
  var value: BigNumber = js.native
}

object Transaction {
  @scala.inline
  def apply(
    chainId: Double,
    data: String,
    gasLimit: BigNumber,
    gasPrice: BigNumber,
    nonce: Double,
    value: BigNumber
  ): Transaction = {
    val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChainId(value: Double): Self = this.set("chainId", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setGasLimit(value: BigNumber): Self = this.set("gasLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setGasPrice(value: BigNumber): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: Double): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: BigNumber): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setR(value: String): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
  
}

