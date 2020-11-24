package typings.fridaGum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends js.Object {
  
  /**
    * Whether to generate an event whenever a basic block is executed.
    *
    * Useful to record a coarse execution trace.
    */
  var block: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to generate events for CALL/BLR instructions.
    */
  var call: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to generate an event whenever a basic block is compiled.
    *
    * Useful for coverage.
    */
  var compile: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to generate events for all instructions.
    *
    * Not recommended as it's potentially a lot of data.
    */
  var exec: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to generate events for RET instructions.
    */
  var ret: js.UndefOr[Boolean] = js.native
}
object Block {
  
  @scala.inline
  def apply(): Block = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setCall(value: Boolean): Self = this.set("call", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCall: Self = this.set("call", js.undefined)
    
    @scala.inline
    def setCompile(value: Boolean): Self = this.set("compile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompile: Self = this.set("compile", js.undefined)
    
    @scala.inline
    def setExec(value: Boolean): Self = this.set("exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    
    @scala.inline
    def setRet(value: Boolean): Self = this.set("ret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRet: Self = this.set("ret", js.undefined)
  }
}
