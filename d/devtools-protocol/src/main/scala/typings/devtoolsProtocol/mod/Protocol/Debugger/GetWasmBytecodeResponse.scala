package typings.devtoolsProtocol.mod.Protocol.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWasmBytecodeResponse extends js.Object {
  
  /**
    * Script source.
    */
  var bytecode: String = js.native
}
object GetWasmBytecodeResponse {
  
  @scala.inline
  def apply(bytecode: String): GetWasmBytecodeResponse = {
    val __obj = js.Dynamic.literal(bytecode = bytecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWasmBytecodeResponse]
  }
  
  @scala.inline
  implicit class GetWasmBytecodeResponseOps[Self <: GetWasmBytecodeResponse] (val x: Self) extends AnyVal {
    
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
    def setBytecode(value: String): Self = this.set("bytecode", value.asInstanceOf[js.Any])
  }
}
