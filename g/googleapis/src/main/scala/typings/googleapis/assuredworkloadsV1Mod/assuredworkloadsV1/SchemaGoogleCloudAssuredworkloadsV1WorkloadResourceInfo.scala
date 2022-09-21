package typings.googleapis.assuredworkloadsV1Mod.assuredworkloadsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssuredworkloadsV1WorkloadResourceInfo extends StObject {
  
  /**
    * Resource identifier. For a project this represents project_number.
    */
  var resourceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates the type of resource.
    */
  var resourceType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudAssuredworkloadsV1WorkloadResourceInfo {
  
  inline def apply(): SchemaGoogleCloudAssuredworkloadsV1WorkloadResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssuredworkloadsV1WorkloadResourceInfo]
  }
  
  extension [Self <: SchemaGoogleCloudAssuredworkloadsV1WorkloadResourceInfo](x: Self) {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
