package typings.ethereumjsVm.runCallMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunCallOpts extends js.Object {
  
  var block: js.UndefOr[js.Any] = js.native
  
  var caller: js.UndefOr[Buffer] = js.native
  
  /**
    * This is for CALLCODE where the code to load is different than the code from the to account
    */
  var code: js.UndefOr[Buffer] = js.native
  
  var compiled: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[Buffer] = js.native
  
  var delegatecall: js.UndefOr[Boolean] = js.native
  
  var depth: js.UndefOr[Double] = js.native
  
  var gasLimit: js.UndefOr[Buffer] = js.native
  
  var gasPrice: js.UndefOr[Buffer] = js.native
  
  var origin: js.UndefOr[Buffer] = js.native
  
  var salt: js.UndefOr[Buffer] = js.native
  
  var selfdestruct: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var static: js.UndefOr[Boolean] = js.native
  
  var to: js.UndefOr[Buffer] = js.native
  
  var value: js.UndefOr[Buffer] = js.native
}
object RunCallOpts {
  
  @scala.inline
  def apply(): RunCallOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunCallOpts]
  }
  
  @scala.inline
  implicit class RunCallOptsOps[Self <: RunCallOpts] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: js.Any): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setCaller(value: Buffer): Self = this.set("caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaller: Self = this.set("caller", js.undefined)
    
    @scala.inline
    def setCode(value: Buffer): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setCompiled(value: Boolean): Self = this.set("compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiled: Self = this.set("compiled", js.undefined)
    
    @scala.inline
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDelegatecall(value: Boolean): Self = this.set("delegatecall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegatecall: Self = this.set("delegatecall", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setGasLimit(value: Buffer): Self = this.set("gasLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasLimit: Self = this.set("gasLimit", js.undefined)
    
    @scala.inline
    def setGasPrice(value: Buffer): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasPrice: Self = this.set("gasPrice", js.undefined)
    
    @scala.inline
    def setOrigin(value: Buffer): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setSalt(value: Buffer): Self = this.set("salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
    
    @scala.inline
    def setSelfdestruct(value: StringDictionary[Boolean]): Self = this.set("selfdestruct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfdestruct: Self = this.set("selfdestruct", js.undefined)
    
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    
    @scala.inline
    def setTo(value: Buffer): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setValue(value: Buffer): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
