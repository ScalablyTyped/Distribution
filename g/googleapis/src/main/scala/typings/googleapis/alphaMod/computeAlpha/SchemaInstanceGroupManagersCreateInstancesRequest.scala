package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InstanceGroupManagers.createInstances
  */
@js.native
trait SchemaInstanceGroupManagersCreateInstancesRequest extends StObject {
  
  /**
    * [Required] List of specifications of per-instance configs.
    */
  var instances: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.native
}
object SchemaInstanceGroupManagersCreateInstancesRequest {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersCreateInstancesRequest]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagersCreateInstancesRequestMutableBuilder[Self <: SchemaInstanceGroupManagersCreateInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[SchemaPerInstanceConfig]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: SchemaPerInstanceConfig*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
