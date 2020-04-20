package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  var difficulty: Double
  var extraData: String
  var gasLimit: BigNumber
  var gasUsed: BigNumber
  var hash: String
  var miner: String
  var nonce: String
  var number: Double
  var parentHash: String
  var timestamp: Double
  var transactions: js.Array[String]
}

object Block {
  @scala.inline
  def apply(
    difficulty: Double,
    extraData: String,
    gasLimit: BigNumber,
    gasUsed: BigNumber,
    hash: String,
    miner: String,
    nonce: String,
    number: Double,
    parentHash: String,
    timestamp: Double,
    transactions: js.Array[String]
  ): Block = {
    val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

