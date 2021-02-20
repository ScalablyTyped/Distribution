package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageEvent extends StObject {
  
  var data: js.Any = js.native
  
  var ports: js.Array[MessagePortMain] = js.native
}
object MessageEvent {
  
  @scala.inline
  def apply(data: js.Any, ports: js.Array[MessagePortMain]): MessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  @scala.inline
  implicit class MessageEventMutableBuilder[Self <: MessageEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPorts(value: js.Array[MessagePortMain]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsVarargs(value: MessagePortMain*): Self = StObject.set(x, "ports", js.Array(value :_*))
  }
}
