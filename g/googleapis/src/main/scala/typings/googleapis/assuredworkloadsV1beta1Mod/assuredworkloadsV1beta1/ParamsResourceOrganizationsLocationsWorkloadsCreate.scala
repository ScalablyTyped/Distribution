package typings.googleapis.assuredworkloadsV1beta1Mod.assuredworkloadsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsLocationsWorkloadsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. A identifier associated with the workload and underlying projects which allows for the break down of billing costs for a workload. The value provided for the identifier will add a label to the workload and contained projects with the identifier as the value.
    */
  var externalId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the new Workload's parent. Must be of the form `organizations/{org_id\}/locations/{location_id\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudAssuredworkloadsV1beta1Workload] = js.undefined
}
object ParamsResourceOrganizationsLocationsWorkloadsCreate {
  
  inline def apply(): ParamsResourceOrganizationsLocationsWorkloadsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsLocationsWorkloadsCreate]
  }
  
  extension [Self <: ParamsResourceOrganizationsLocationsWorkloadsCreate](x: Self) {
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudAssuredworkloadsV1beta1Workload): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
