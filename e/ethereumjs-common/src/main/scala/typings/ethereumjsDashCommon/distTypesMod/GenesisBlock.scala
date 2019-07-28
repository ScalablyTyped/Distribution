package typings.ethereumjsDashCommon.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenesisBlock extends js.Object {
  var difficulty: Double
  var extraData: String
  var gasLimit: Double
  var hash: String
  var nonce: String
  var stateRoot: String
  var timestamp: String | Null
}

object GenesisBlock {
  @scala.inline
  def apply(
    difficulty: Double,
    extraData: String,
    gasLimit: Double,
    hash: String,
    nonce: String,
    stateRoot: String,
    timestamp: String = null
  ): GenesisBlock = {
    val __obj = js.Dynamic.literal(difficulty = difficulty, extraData = extraData, gasLimit = gasLimit, hash = hash, nonce = nonce, stateRoot = stateRoot)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[GenesisBlock]
  }
}

