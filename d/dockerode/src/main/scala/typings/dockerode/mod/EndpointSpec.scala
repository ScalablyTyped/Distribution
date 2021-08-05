package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointSpec extends StObject {
  
  var Mode: js.UndefOr[String] = js.undefined
  
  var Ports: js.UndefOr[js.Array[PortConfig]] = js.undefined
}
object EndpointSpec {
  
  inline def apply(): EndpointSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointSpec]
  }
  
  extension [Self <: EndpointSpec](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setPorts(value: js.Array[PortConfig]): Self = StObject.set(x, "Ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "Ports", js.undefined)
    
    inline def setPortsVarargs(value: PortConfig*): Self = StObject.set(x, "Ports", js.Array(value :_*))
  }
}
