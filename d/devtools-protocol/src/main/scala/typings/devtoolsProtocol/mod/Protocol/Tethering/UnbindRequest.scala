package typings.devtoolsProtocol.mod.Protocol.Tethering

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnbindRequest extends js.Object {
  
  /**
    * Port number to unbind.
    */
  var port: integer = js.native
}
object UnbindRequest {
  
  @scala.inline
  def apply(port: integer): UnbindRequest = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnbindRequest]
  }
  
  @scala.inline
  implicit class UnbindRequestOps[Self <: UnbindRequest] (val x: Self) extends AnyVal {
    
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
    def setPort(value: integer): Self = this.set("port", value.asInstanceOf[js.Any])
  }
}
