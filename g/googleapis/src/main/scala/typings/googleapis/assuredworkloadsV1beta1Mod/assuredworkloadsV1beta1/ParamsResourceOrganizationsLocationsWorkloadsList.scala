package typings.googleapis.assuredworkloadsV1beta1Mod.assuredworkloadsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsLocationsWorkloadsList
  extends StObject
     with StandardParameters {
  
  /**
    * A custom filter for filtering by properties of a workload. At this time, only filtering by labels is supported.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token returned from previous request. Page token contains context from previous request. Page token needs to be passed in the second and following requests.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Parent Resource to list workloads from. Must be of the form `organizations/{org_id\}/locations/{location\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsLocationsWorkloadsList {
  
  inline def apply(): ParamsResourceOrganizationsLocationsWorkloadsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsLocationsWorkloadsList]
  }
  
  extension [Self <: ParamsResourceOrganizationsLocationsWorkloadsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
