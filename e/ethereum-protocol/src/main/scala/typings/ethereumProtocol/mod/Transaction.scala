package typings.ethereumProtocol.mod

import typings.bignumberJs.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  var blockHash: String | Null = js.native
  var blockNumber: Double | Null = js.native
  var from: String = js.native
  var gas: Double = js.native
  var gasPrice: default = js.native
  var hash: String = js.native
  var input: String = js.native
  var nonce: Double = js.native
  var to: String | Null = js.native
  var transactionIndex: Double | Null = js.native
  var value: default = js.native
}

object Transaction {
  @scala.inline
  def apply(
    from: String,
    gas: Double,
    gasPrice: default,
    hash: String,
    input: String,
    nonce: Double,
    value: default
  ): Transaction = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], gas = gas.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setGas(value: Double): Self = this.set("gas", value.asInstanceOf[js.Any])
    @scala.inline
    def setGasPrice(value: default): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: Double): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: default): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockHash(value: String): Self = this.set("blockHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockHashNull: Self = this.set("blockHash", null)
    @scala.inline
    def setBlockNumber(value: Double): Self = this.set("blockNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockNumberNull: Self = this.set("blockNumber", null)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setToNull: Self = this.set("to", null)
    @scala.inline
    def setTransactionIndex(value: Double): Self = this.set("transactionIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionIndexNull: Self = this.set("transactionIndex", null)
  }
  
}

