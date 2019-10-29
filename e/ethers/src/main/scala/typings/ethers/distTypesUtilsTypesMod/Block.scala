package typings.ethers.distTypesUtilsTypesMod

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
    val __obj = js.Dynamic.literal(difficulty = difficulty, extraData = extraData, gasLimit = gasLimit, gasUsed = gasUsed, hash = hash, miner = miner, nonce = nonce, number = number, parentHash = parentHash, timestamp = timestamp, transactions = transactions)
  
    __obj.asInstanceOf[Block]
  }
}

