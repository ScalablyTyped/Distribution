package typings.ethersprojectAbstractProvider.mod

import typings.ethersprojectBignumber.mod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _Block extends js.Object {
  
  var difficulty: Double = js.native
  
  var extraData: String = js.native
  
  var gasLimit: BigNumber = js.native
  
  var gasUsed: BigNumber = js.native
  
  var hash: String = js.native
  
  var miner: String = js.native
  
  var nonce: String = js.native
  
  var number: Double = js.native
  
  var parentHash: String = js.native
  
  var timestamp: Double = js.native
}
object _Block {
  
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
    timestamp: Double
  ): _Block = {
    val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Block]
  }
  
  @scala.inline
  implicit class _BlockOps[Self <: _Block] (val x: Self) extends AnyVal {
    
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
    def setGasLimit(value: BigNumber): Self = this.set("gasLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasUsed(value: BigNumber): Self = this.set("gasUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiner(value: String): Self = this.set("miner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentHash(value: String): Self = this.set("parentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
