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
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersCreateInstancesRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersCreateInstancesRequestMutableBuilder[Self <: SchemaRegionInstanceGroupManagersCreateInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[SchemaPerInstanceConfig]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: SchemaPerInstanceConfig*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
