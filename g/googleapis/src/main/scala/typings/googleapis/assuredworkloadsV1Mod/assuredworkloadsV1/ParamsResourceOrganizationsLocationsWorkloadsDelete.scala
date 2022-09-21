package typings.googleapis.assuredworkloadsV1Mod.assuredworkloadsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsLocationsWorkloadsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The etag of the workload. If this is provided, it must match the server's etag.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The `name` field is used to identify the workload. Format: organizations/{org_id\}/locations/{location_id\}/workloads/{workload_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsLocationsWorkloadsDelete {
  
  inline def apply(): ParamsResourceOrganizationsLocationsWorkloadsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsLocationsWorkloadsDelete]
  }
  
  extension [Self <: ParamsResourceOrganizationsLocationsWorkloadsDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
