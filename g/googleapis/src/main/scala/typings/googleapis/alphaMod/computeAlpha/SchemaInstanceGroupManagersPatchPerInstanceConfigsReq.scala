package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InstanceGroupManagers.patchPerInstanceConfigs
  */
trait SchemaInstanceGroupManagersPatchPerInstanceConfigsReq extends StObject {
  
  /**
    * The list of per-instance configs to insert or patch on this managed
    * instance group.
    */
  var perInstanceConfigs: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.undefined
}
object SchemaInstanceGroupManagersPatchPerInstanceConfigsReq {
  
  inline def apply(): SchemaInstanceGroupManagersPatchPerInstanceConfigsReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersPatchPerInstanceConfigsReq]
  }
  
  extension [Self <: SchemaInstanceGroupManagersPatchPerInstanceConfigsReq](x: Self) {
    
    inline def setPerInstanceConfigs(value: js.Array[SchemaPerInstanceConfig]): Self = StObject.set(x, "perInstanceConfigs", value.asInstanceOf[js.Any])
    
    inline def setPerInstanceConfigsUndefined: Self = StObject.set(x, "perInstanceConfigs", js.undefined)
    
    inline def setPerInstanceConfigsVarargs(value: SchemaPerInstanceConfig*): Self = StObject.set(x, "perInstanceConfigs", js.Array(value :_*))
  }
}
