package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractBlock extends js.Object {
  var difficulty: bignumberDotJsLib.bignumberDotJsMod.default
  var extraData: java.lang.String
  var gasLimit: scala.Double
  var gasUsed: scala.Double
  var hash: java.lang.String | scala.Null
  var logsBloom: java.lang.String | scala.Null
  var miner: java.lang.String
  var nonce: java.lang.String | scala.Null
  var number: scala.Double | scala.Null
  var parentHash: java.lang.String
  var sha3Uncles: java.lang.String
  var size: scala.Double
  var stateRoot: java.lang.String
  var timestamp: scala.Double
  var totalDifficulty: bignumberDotJsLib.bignumberDotJsMod.default
  var transactionsRoot: java.lang.String
  var uncles: js.Array[java.lang.String]
}

object AbstractBlock {
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
    transactionsRoot: java.lang.String,
    uncles: js.Array[java.lang.String],
    hash: java.lang.String = null,
    logsBloom: java.lang.String = null,
    nonce: java.lang.String = null,
    number: scala.Int | scala.Double = null
  ): AbstractBlock = {
    val __obj = js.Dynamic.literal(difficulty = difficulty, extraData = extraData, gasLimit = gasLimit, gasUsed = gasUsed, miner = miner, parentHash = parentHash, sha3Uncles = sha3Uncles, size = size, stateRoot = stateRoot, timestamp = timestamp, totalDifficulty = totalDifficulty, transactionsRoot = transactionsRoot, uncles = uncles)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (logsBloom != null) __obj.updateDynamic("logsBloom")(logsBloom)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractBlock]
  }
}

