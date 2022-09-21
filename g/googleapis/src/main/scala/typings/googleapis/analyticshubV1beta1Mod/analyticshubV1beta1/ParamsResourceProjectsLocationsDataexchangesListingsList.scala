package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDataexchangesListingsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token, returned by a previous call, to request the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource path of the listing. e.g. `projects/myproject/locations/US/dataExchanges/123`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDataexchangesListingsList {
  
  inline def apply(): ParamsResourceProjectsLocationsDataexchangesListingsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDataexchangesListingsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDataexchangesListingsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
