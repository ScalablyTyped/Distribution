package typings.ethereumProtocol.mod

import typings.bignumberJs.mod.default
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
    blockNumber: Double = null.asInstanceOf[Double],
    to: String = null,
    transactionIndex: Double = null.asInstanceOf[Double]
  ): Transaction = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], gas = gas.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

