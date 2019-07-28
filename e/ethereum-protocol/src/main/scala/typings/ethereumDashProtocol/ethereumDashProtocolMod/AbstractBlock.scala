package typings.ethereumDashProtocol.ethereumDashProtocolMod

import typings.bignumberDotJs.bignumberDotJsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractBlock extends js.Object {
  var difficulty: default
  var extraData: String
  var gasLimit: Double
  var gasUsed: Double
  var hash: String | Null
  var logsBloom: String | Null
  var miner: String
  var nonce: String | Null
  var number: Double | Null
  var parentHash: String
  var sha3Uncles: String
  var size: Double
  var stateRoot: String
  var timestamp: Double
  var totalDifficulty: default
  var transactionsRoot: String
  var uncles: js.Array[String]
}

object AbstractBlock {
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
    transactionsRoot: String,
    uncles: js.Array[String],
    hash: String = null,
    logsBloom: String = null,
    nonce: String = null,
    number: Int | Double = null
  ): AbstractBlock = {
    val __obj = js.Dynamic.literal(difficulty = difficulty, extraData = extraData, gasLimit = gasLimit, gasUsed = gasUsed, miner = miner, parentHash = parentHash, sha3Uncles = sha3Uncles, size = size, stateRoot = stateRoot, timestamp = timestamp, totalDifficulty = totalDifficulty, transactionsRoot = transactionsRoot, uncles = uncles)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (logsBloom != null) __obj.updateDynamic("logsBloom")(logsBloom)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractBlock]
  }
}

