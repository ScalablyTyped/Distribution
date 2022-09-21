package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionInstanceGroupManagersSuspendInstancesRequest extends StObject {
  
  /**
    * If this flag is set to true, the Instance Group Manager will proceed to suspend the instances, skipping initialization on them.
    */
  var forceSuspend: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
    */
  var instances: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRegionInstanceGroupManagersSuspendInstancesRequest {
  
  inline def apply(): SchemaRegionInstanceGroupManagersSuspendInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersSuspendInstancesRequest]
  }
  
  extension [Self <: SchemaRegionInstanceGroupManagersSuspendInstancesRequest](x: Self) {
    
    inline def setForceSuspend(value: Boolean): Self = StObject.set(x, "forceSuspend", value.asInstanceOf[js.Any])
    
    inline def setForceSuspendNull: Self = StObject.set(x, "forceSuspend", null)
    
    inline def setForceSuspendUndefined: Self = StObject.set(x, "forceSuspend", js.undefined)
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesNull: Self = StObject.set(x, "instances", null)
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
