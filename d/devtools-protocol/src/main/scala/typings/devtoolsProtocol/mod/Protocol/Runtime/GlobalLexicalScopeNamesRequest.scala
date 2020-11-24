package typings.devtoolsProtocol.mod.Protocol.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalLexicalScopeNamesRequest extends js.Object {
  
  /**
    * Specifies in which execution context to lookup global scope variables.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.native
}
object GlobalLexicalScopeNamesRequest {
  
  @scala.inline
  def apply(): GlobalLexicalScopeNamesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalLexicalScopeNamesRequest]
  }
  
  @scala.inline
  implicit class GlobalLexicalScopeNamesRequestOps[Self <: GlobalLexicalScopeNamesRequest] (val x: Self) extends AnyVal {
    
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
    def setExecutionContextId(value: ExecutionContextId): Self = this.set("executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionContextId: Self = this.set("executionContextId", js.undefined)
  }
}
