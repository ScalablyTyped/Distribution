package typings.ethereumjsVm.eeiMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunResult extends js.Object {
  
  var logs: js.Any = js.native
  
  var returnValue: js.UndefOr[Buffer] = js.native
  
  /**
    * A map from the accounts that have self-destructed to the addresses to send their funds to
    */
  var selfdestruct: StringDictionary[Buffer] = js.native
}
object RunResult {
  
  @scala.inline
  def apply(logs: js.Any, selfdestruct: StringDictionary[Buffer]): RunResult = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any], selfdestruct = selfdestruct.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResult]
  }
  
  @scala.inline
  implicit class RunResultOps[Self <: RunResult] (val x: Self) extends AnyVal {
    
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
    def setLogs(value: js.Any): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfdestruct(value: StringDictionary[Buffer]): Self = this.set("selfdestruct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Buffer): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnValue: Self = this.set("returnValue", js.undefined)
  }
}
