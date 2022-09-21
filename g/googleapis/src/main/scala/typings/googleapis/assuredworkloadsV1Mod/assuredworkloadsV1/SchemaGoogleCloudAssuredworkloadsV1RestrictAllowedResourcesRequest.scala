package typings.googleapis.assuredworkloadsV1Mod.assuredworkloadsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest extends StObject {
  
  /**
    * Required. The type of restriction for using gcp products in the Workload environment.
    */
  var restrictionType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest {
  
  inline def apply(): SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest](x: Self) {
    
    inline def setRestrictionType(value: String): Self = StObject.set(x, "restrictionType", value.asInstanceOf[js.Any])
    
    inline def setRestrictionTypeNull: Self = StObject.set(x, "restrictionType", null)
    
    inline def setRestrictionTypeUndefined: Self = StObject.set(x, "restrictionType", js.undefined)
  }
}
