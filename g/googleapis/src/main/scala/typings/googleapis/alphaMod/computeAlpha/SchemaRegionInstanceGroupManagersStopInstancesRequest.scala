package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionInstanceGroupManagersStopInstancesRequest extends StObject {
  
  /**
    * If this flag is set to true, the Instance Group Manager will proceed to stop the instances, skipping initialization on them.
    */
  var forceStop: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The URLs of one or more instances to stop. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
    */
  var instances: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRegionInstanceGroupManagersStopInstancesRequest {
  
  inline def apply(): SchemaRegionInstanceGroupManagersStopInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersStopInstancesRequest]
  }
  
  extension [Self <: SchemaRegionInstanceGroupManagersStopInstancesRequest](x: Self) {
    
    inline def setForceStop(value: Boolean): Self = StObject.set(x, "forceStop", value.asInstanceOf[js.Any])
    
    inline def setForceStopNull: Self = StObject.set(x, "forceStop", null)
    
    inline def setForceStopUndefined: Self = StObject.set(x, "forceStop", js.undefined)
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesNull: Self = StObject.set(x, "instances", null)
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
