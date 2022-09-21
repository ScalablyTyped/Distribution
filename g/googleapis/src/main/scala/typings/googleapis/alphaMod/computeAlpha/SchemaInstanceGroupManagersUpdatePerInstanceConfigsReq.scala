package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagersUpdatePerInstanceConfigsReq extends StObject {
  
  /**
    * The list of per-instance configurations to insert or patch on this managed instance group.
    */
  var perInstanceConfigs: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.undefined
}
object SchemaInstanceGroupManagersUpdatePerInstanceConfigsReq {
  
  inline def apply(): SchemaInstanceGroupManagersUpdatePerInstanceConfigsReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersUpdatePerInstanceConfigsReq]
  }
  
  extension [Self <: SchemaInstanceGroupManagersUpdatePerInstanceConfigsReq](x: Self) {
    
    inline def setPerInstanceConfigs(value: js.Array[SchemaPerInstanceConfig]): Self = StObject.set(x, "perInstanceConfigs", value.asInstanceOf[js.Any])
    
    inline def setPerInstanceConfigsUndefined: Self = StObject.set(x, "perInstanceConfigs", js.undefined)
    
    inline def setPerInstanceConfigsVarargs(value: SchemaPerInstanceConfig*): Self = StObject.set(x, "perInstanceConfigs", js.Array(value*))
  }
}
