package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesIoStats extends StObject {
  
  var devices: js.UndefOr[js.Array[NodesIoStatDevice]] = js.undefined
  
  var total: js.UndefOr[NodesIoStatDevice] = js.undefined
}
object NodesIoStats {
  
  inline def apply(): NodesIoStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesIoStats]
  }
  
  extension [Self <: NodesIoStats](x: Self) {
    
    inline def setDevices(value: js.Array[NodesIoStatDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: NodesIoStatDevice*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setTotal(value: NodesIoStatDevice): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
