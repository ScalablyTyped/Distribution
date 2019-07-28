package typings.ethereumDashProtocol.ethereumDashProtocolMod

import typings.bignumberDotJs.bignumberDotJsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var blockHash: String | Null
  var blockNumber: Double | Null
  var from: String
  var gas: Double
  var gasPrice: default
  var hash: String
  var input: String
  var nonce: Double
  var to: String | Null
  var transactionIndex: Double | Null
  var value: default
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
    value: default,
    blockHash: String = null,
    blockNumber: Int | Double = null,
    to: String = null,
    transactionIndex: Int | Double = null
  ): Transaction = {
    val __obj = js.Dynamic.literal(from = from, gas = gas, gasPrice = gasPrice, hash = hash, input = input, nonce = nonce, value = value)
    if (blockHash != null) __obj.updateDynamic("blockHash")(blockHash)
    if (blockNumber != null) __obj.updateDynamic("blockNumber")(blockNumber.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    if (transactionIndex != null) __obj.updateDynamic("transactionIndex")(transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

