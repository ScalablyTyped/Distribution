package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsLocationsDataexchangesList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The organization resource path of the projects containing DataExchanges. e.g. `organizations/myorg/locations/US`.
    */
  var organization: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token, returned by a previous call, to request the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsLocationsDataexchangesList {
  
  inline def apply(): ParamsResourceOrganizationsLocationsDataexchangesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsLocationsDataexchangesList]
  }
  
  extension [Self <: ParamsResourceOrganizationsLocationsDataexchangesList](x: Self) {
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
