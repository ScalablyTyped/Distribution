package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagersResumeInstancesRequest extends StObject {
  
  /**
    * The URLs of one or more instances to resume. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
    */
  var instances: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaInstanceGroupManagersResumeInstancesRequest {
  
  inline def apply(): SchemaInstanceGroupManagersResumeInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersResumeInstancesRequest]
  }
  
  extension [Self <: SchemaInstanceGroupManagersResumeInstancesRequest](x: Self) {
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesNull: Self = StObject.set(x, "instances", null)
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
