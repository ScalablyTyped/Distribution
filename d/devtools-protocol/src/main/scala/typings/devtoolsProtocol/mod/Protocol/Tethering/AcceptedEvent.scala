package typings.devtoolsProtocol.mod.Protocol.Tethering

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptedEvent extends js.Object {
  
  /**
    * Connection id to be used.
    */
  var connectionId: String = js.native
  
  /**
    * Port number that was successfully bound.
    */
  var port: integer = js.native
}
object AcceptedEvent {
  
  @scala.inline
  def apply(connectionId: String, port: integer): AcceptedEvent = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptedEvent]
  }
  
  @scala.inline
  implicit class AcceptedEventOps[Self <: AcceptedEvent] (val x: Self) extends AnyVal {
    
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
    def setConnectionId(value: String): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: integer): Self = this.set("port", value.asInstanceOf[js.Any])
  }
}
