package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockWithTransactionData extends AbstractBlock {
  var transactions: js.Array[Transaction]
}

object BlockWithTransactionData {
  @scala.inline
  def apply(
    difficulty: bignumberDotJsLib.bignumberDotJsMod.default,
    extraData: java.lang.String,
    gasLimit: scala.Double,
    gasUsed: scala.Double,
    miner: java.lang.String,
    parentHash: java.lang.String,
    sha3Uncles: java.lang.String,
    size: scala.Double,
    stateRoot: java.lang.String,
    timestamp: scala.Double,
    totalDifficulty: bignumberDotJsLib.bignumberDotJsMod.default,
    transactions: js.Array[Transaction],
    transactionsRoot: java.lang.String,
    uncles: js.Array[java.lang.String],
    hash: java.lang.String = null,
    logsBloom: java.lang.String = null,
    nonce: java.lang.String = null,
    number: scala.Int | scala.Double = null
  ): BlockWithTransactionData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("difficulty")(difficulty)
    __obj.updateDynamic("extraData")(extraData)
    __obj.updateDynamic("gasLimit")(gasLimit)
    __obj.updateDynamic("gasUsed")(gasUsed)
    __obj.updateDynamic("miner")(miner)
    __obj.updateDynamic("parentHash")(parentHash)
    __obj.updateDynamic("sha3Uncles")(sha3Uncles)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("stateRoot")(stateRoot)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("totalDifficulty")(totalDifficulty)
    __obj.updateDynamic("transactions")(transactions)
    __obj.updateDynamic("transactionsRoot")(transactionsRoot)
    __obj.updateDynamic("uncles")(uncles)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (logsBloom != null) __obj.updateDynamic("logsBloom")(logsBloom)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockWithTransactionData]
  }
}

