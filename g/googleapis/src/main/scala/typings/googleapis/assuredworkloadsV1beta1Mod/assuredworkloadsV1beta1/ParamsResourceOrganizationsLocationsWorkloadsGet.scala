package typings.googleapis.assuredworkloadsV1beta1Mod.assuredworkloadsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsLocationsWorkloadsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Workload to fetch. This is the workloads's relative path in the API, formatted as "organizations/{organization_id\}/locations/{location_id\}/workloads/{workload_id\}". For example, "organizations/123/locations/us-east1/workloads/assured-workload-1".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsLocationsWorkloadsGet {
  
  inline def apply(): ParamsResourceOrganizationsLocationsWorkloadsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsLocationsWorkloadsGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsLocationsWorkloadsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
