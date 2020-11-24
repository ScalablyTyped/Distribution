package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.UniqueDebuggerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableResponse extends js.Object {
  
  /**
    * Unique identifier of the debugger.
    */
  var debuggerId: UniqueDebuggerId = js.native
}
object EnableResponse {
  
  @scala.inline
  def apply(debuggerId: UniqueDebuggerId): EnableResponse = {
    val __obj = js.Dynamic.literal(debuggerId = debuggerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableResponse]
  }
  
  @scala.inline
  implicit class EnableResponseOps[Self <: EnableResponse] (val x: Self) extends AnyVal {
    
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
    def setDebuggerId(value: UniqueDebuggerId): Self = this.set("debuggerId", value.asInstanceOf[js.Any])
  }
}
