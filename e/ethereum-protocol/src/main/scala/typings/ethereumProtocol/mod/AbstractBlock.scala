package typings.ethereumProtocol.mod

import typings.bignumberJs.mod.default
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
    number: Double = null.asInstanceOf[Double]
  ): AbstractBlock = {
    val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionsRoot = transactionsRoot.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractBlock]
  }
}

