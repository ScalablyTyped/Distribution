package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionInstanceGroupManagersDeleteInstancesRequest extends StObject {
  
  /**
    * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
    */
  var instances: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Skip instances which cannot be deleted (instances not belonging to this managed group, already being deleted or being abandoned). If `false`, fail whole flow, if such instance is passed. DEPRECATED: Use skip_instances_on_validation_error instead.
    */
  var skipInapplicableInstances: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies whether the request should proceed despite the inclusion of instances that are not members of the group or that are already in the process of being deleted or abandoned. If this field is set to `false` and such an instance is specified in the request, the operation fails. The operation always fails if the request contains a malformed instance URL or a reference to an instance that exists in a zone or region other than the group's zone or region.
    */
  var skipInstancesOnValidationError: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRegionInstanceGroupManagersDeleteInstancesRequest {
  
  inline def apply(): SchemaRegionInstanceGroupManagersDeleteInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersDeleteInstancesRequest]
  }
  
  extension [Self <: SchemaRegionInstanceGroupManagersDeleteInstancesRequest](x: Self) {
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesNull: Self = StObject.set(x, "instances", null)
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setSkipInapplicableInstances(value: Boolean): Self = StObject.set(x, "skipInapplicableInstances", value.asInstanceOf[js.Any])
    
    inline def setSkipInapplicableInstancesNull: Self = StObject.set(x, "skipInapplicableInstances", null)
    
    inline def setSkipInapplicableInstancesUndefined: Self = StObject.set(x, "skipInapplicableInstances", js.undefined)
    
    inline def setSkipInstancesOnValidationError(value: Boolean): Self = StObject.set(x, "skipInstancesOnValidationError", value.asInstanceOf[js.Any])
    
    inline def setSkipInstancesOnValidationErrorNull: Self = StObject.set(x, "skipInstancesOnValidationError", null)
    
    inline def setSkipInstancesOnValidationErrorUndefined: Self = StObject.set(x, "skipInstancesOnValidationError", js.undefined)
  }
}
