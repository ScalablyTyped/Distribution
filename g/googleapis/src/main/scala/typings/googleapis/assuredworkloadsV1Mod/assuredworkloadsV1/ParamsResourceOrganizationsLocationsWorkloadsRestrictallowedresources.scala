package typings.googleapis.assuredworkloadsV1Mod.assuredworkloadsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsLocationsWorkloadsRestrictallowedresources
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Workload. This is the workloads's relative path in the API, formatted as "organizations/{organization_id\}/locations/{location_id\}/workloads/{workload_id\}". For example, "organizations/123/locations/us-east1/workloads/assured-workload-1".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest] = js.undefined
}
object ParamsResourceOrganizationsLocationsWorkloadsRestrictallowedresources {
  
  inline def apply(): ParamsResourceOrganizationsLocationsWorkloadsRestrictallowedresources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsLocationsWorkloadsRestrictallowedresources]
  }
  
  extension [Self <: ParamsResourceOrganizationsLocationsWorkloadsRestrictallowedresources](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
