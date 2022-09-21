package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagersCreateInstancesRequest extends StObject {
  
  /**
    * [Required] List of specifications of per-instance configs.
    */
  var instances: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.undefined
}
object SchemaInstanceGroupManagersCreateInstancesRequest {
  
  inline def apply(): SchemaInstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersCreateInstancesRequest]
  }
  
  extension [Self <: SchemaInstanceGroupManagersCreateInstancesRequest](x: Self) {
    
    inline def setInstances(value: js.Array[SchemaPerInstanceConfig]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: SchemaPerInstanceConfig*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
