package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceParams extends js.Object {
  
  var disableMemory: js.UndefOr[Boolean] = js.native
  
  var disableStack: js.UndefOr[Boolean] = js.native
  
  var disableStorage: js.UndefOr[Boolean] = js.native
}
object TraceParams {
  
  @scala.inline
  def apply(): TraceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceParams]
  }
  
  @scala.inline
  implicit class TraceParamsOps[Self <: TraceParams] (val x: Self) extends AnyVal {
    
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
    def setDisableMemory(value: Boolean): Self = this.set("disableMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMemory: Self = this.set("disableMemory", js.undefined)
    
    @scala.inline
    def setDisableStack(value: Boolean): Self = this.set("disableStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStack: Self = this.set("disableStack", js.undefined)
    
    @scala.inline
    def setDisableStorage(value: Boolean): Self = this.set("disableStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStorage: Self = this.set("disableStorage", js.undefined)
  }
}
