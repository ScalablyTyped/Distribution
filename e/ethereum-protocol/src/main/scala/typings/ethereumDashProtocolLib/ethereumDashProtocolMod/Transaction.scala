package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var blockHash: java.lang.String | scala.Null
  var blockNumber: scala.Double | scala.Null
  var from: java.lang.String
  var gas: scala.Double
  var gasPrice: bignumberDotJsLib.bignumberDotJsMod.default
  var hash: java.lang.String
  var input: java.lang.String
  var nonce: scala.Double
  var to: java.lang.String | scala.Null
  var transactionIndex: scala.Double | scala.Null
  var value: bignumberDotJsLib.bignumberDotJsMod.default
}

object Transaction {
  @scala.inline
  def apply(
    from: java.lang.String,
    gas: scala.Double,
    gasPrice: bignumberDotJsLib.bignumberDotJsMod.default,
    hash: java.lang.String,
    input: java.lang.String,
    nonce: scala.Double,
    value: bignumberDotJsLib.bignumberDotJsMod.default,
    blockHash: java.lang.String = null,
    blockNumber: scala.Int | scala.Double = null,
    to: java.lang.String = null,
    transactionIndex: scala.Int | scala.Double = null
  ): Transaction = {
    val __obj = js.Dynamic.literal(from = from, gas = gas, gasPrice = gasPrice, hash = hash, input = input, nonce = nonce, value = value)
    if (blockHash != null) __obj.updateDynamic("blockHash")(blockHash)
    if (blockNumber != null) __obj.updateDynamic("blockNumber")(blockNumber.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    if (transactionIndex != null) __obj.updateDynamic("transactionIndex")(transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

