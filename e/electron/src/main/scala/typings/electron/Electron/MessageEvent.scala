package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEvent extends StObject {
  
  var data: Any
  
  var ports: js.Array[MessagePortMain]
}
object MessageEvent {
  
  inline def apply(data: Any, ports: js.Array[MessagePortMain]): MessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  extension [Self <: MessageEvent](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPorts(value: js.Array[MessagePortMain]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsVarargs(value: MessagePortMain*): Self = StObject.set(x, "ports", js.Array(value*))
  }
}
