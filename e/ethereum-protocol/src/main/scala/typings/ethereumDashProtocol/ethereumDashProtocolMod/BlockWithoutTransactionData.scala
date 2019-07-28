package typings.ethereumDashProtocol.ethereumDashProtocolMod

import typings.bignumberDotJs.bignumberDotJsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockWithoutTransactionData extends AbstractBlock {
  var transactions: js.Array[String]
}

object BlockWithoutTransactionData {
  @scala.inline
  def apply(
    difficulty: default,
    extraData: String,
    gasLimit: Double,
    gasUsed: Double,
    miner: String,
    parentHash: String,
    sha3Uncles: String,
    size: Double,
    stateRoot: String,
    timestamp: Double,
    totalDifficulty: default,
    transactions: js.Array[String],
    transactionsRoot: String,
    uncles: js.Array[String],
    hash: String = null,
    logsBloom: String = null,
    nonce: String = null,
    number: Int | Double = null
  ): BlockWithoutTransactionData = {
    val __obj = js.Dynamic.literal(difficulty = difficulty, extraData = extraData, gasLimit = gasLimit, gasUsed = gasUsed, miner = miner, parentHash = parentHash, sha3Uncles = sha3Uncles, size = size, stateRoot = stateRoot, timestamp = timestamp, totalDifficulty = totalDifficulty, transactions = transactions, transactionsRoot = transactionsRoot, uncles = uncles)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (logsBloom != null) __obj.updateDynamic("logsBloom")(logsBloom)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockWithoutTransactionData]
  }
}

