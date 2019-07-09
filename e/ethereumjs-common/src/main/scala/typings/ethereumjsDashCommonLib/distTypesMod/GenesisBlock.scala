package typings
package ethereumjsDashCommonLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenesisBlock extends js.Object {
  var difficulty: scala.Double
  var extraData: java.lang.String
  var gasLimit: scala.Double
  var hash: java.lang.String
  var nonce: java.lang.String
  var stateRoot: java.lang.String
  var timestamp: java.lang.String | scala.Null
}

object GenesisBlock {
  @scala.inline
  def apply(
    difficulty: scala.Double,
    extraData: java.lang.String,
    gasLimit: scala.Double,
    hash: java.lang.String,
    nonce: java.lang.String,
    stateRoot: java.lang.String,
    timestamp: java.lang.String = null
  ): GenesisBlock = {
    val __obj = js.Dynamic.literal(difficulty = difficulty, extraData = extraData, gasLimit = gasLimit, hash = hash, nonce = nonce, stateRoot = stateRoot)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[GenesisBlock]
  }
}

