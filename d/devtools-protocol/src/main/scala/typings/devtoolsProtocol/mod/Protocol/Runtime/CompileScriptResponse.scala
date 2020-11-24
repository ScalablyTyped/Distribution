package typings.devtoolsProtocol.mod.Protocol.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileScriptResponse extends js.Object {
  
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.native
  
  /**
    * Id of the script.
    */
  var scriptId: js.UndefOr[ScriptId] = js.native
}
object CompileScriptResponse {
  
  @scala.inline
  def apply(): CompileScriptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileScriptResponse]
  }
  
  @scala.inline
  implicit class CompileScriptResponseOps[Self <: CompileScriptResponse] (val x: Self) extends AnyVal {
    
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
    def setExceptionDetails(value: ExceptionDetails): Self = this.set("exceptionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptionDetails: Self = this.set("exceptionDetails", js.undefined)
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptId: Self = this.set("scriptId", js.undefined)
  }
}
