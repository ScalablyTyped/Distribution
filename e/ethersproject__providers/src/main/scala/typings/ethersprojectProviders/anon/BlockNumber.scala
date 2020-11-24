package typings.ethersprojectProviders.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockNumber extends js.Object {
  
  var blockNumber: Double = js.native
  
  var reqTime: Double = js.native
  
  var respTime: Double = js.native
}
object BlockNumber {
  
  @scala.inline
  def apply(blockNumber: Double, reqTime: Double, respTime: Double): BlockNumber = {
    val __obj = js.Dynamic.literal(blockNumber = blockNumber.asInstanceOf[js.Any], reqTime = reqTime.asInstanceOf[js.Any], respTime = respTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockNumber]
  }
  
  @scala.inline
  implicit class BlockNumberOps[Self <: BlockNumber] (val x: Self) extends AnyVal {
    
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
    def setBlockNumber(value: Double): Self = this.set("blockNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqTime(value: Double): Self = this.set("reqTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespTime(value: Double): Self = this.set("respTime", value.asInstanceOf[js.Any])
  }
}
