package typings.ethereumjsCommon.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenesisBlock extends js.Object {
  var difficulty: Double = js.native
  var extraData: String = js.native
  var gasLimit: Double = js.native
  var hash: String = js.native
  var nonce: String = js.native
  var stateRoot: String = js.native
  var timestamp: String | Null = js.native
}

object GenesisBlock {
  @scala.inline
  def apply(
    difficulty: Double,
    extraData: String,
    gasLimit: Double,
    hash: String,
    nonce: String,
    stateRoot: String
  ): GenesisBlock = {
    val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenesisBlock]
  }
  @scala.inline
  implicit class GenesisBlockOps[Self <: GenesisBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDifficulty(value: Double): Self = this.set("difficulty", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraData(value: String): Self = this.set("extraData", value.asInstanceOf[js.Any])
    @scala.inline
    def setGasLimit(value: Double): Self = this.set("gasLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateRoot(value: String): Self = this.set("stateRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestampNull: Self = this.set("timestamp", null)
  }
  
}

