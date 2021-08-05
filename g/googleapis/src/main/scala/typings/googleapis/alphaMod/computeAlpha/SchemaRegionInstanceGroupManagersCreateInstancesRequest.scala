package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RegionInstanceGroupManagers.createInstances
  */
trait SchemaRegionInstanceGroupManagersCreateInstancesRequest extends StObject {
  
  /**
    * [Required] List of specifications of per-instance configs.
    */
  var instances: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.undefined
}
object SchemaRegionInstanceGroupManagersCreateInstancesRequest {
  
  inline def apply(): SchemaRegionInstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersCreateInstancesRequest]
  }
  
  extension [Self <: SchemaRegionInstanceGroupManagersCreateInstancesRequest](x: Self) {
    
    inline def setInstances(value: js.Array[SchemaPerInstanceConfig]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: SchemaPerInstanceConfig*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
