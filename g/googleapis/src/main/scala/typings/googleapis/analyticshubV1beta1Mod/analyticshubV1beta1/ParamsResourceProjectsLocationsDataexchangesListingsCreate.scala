package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDataexchangesListingsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the listing to create. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Max length: 100 bytes.
    */
  var listingId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource path of the listing. e.g. `projects/myproject/locations/US/dataExchanges/123`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaListing] = js.undefined
}
object ParamsResourceProjectsLocationsDataexchangesListingsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDataexchangesListingsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDataexchangesListingsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDataexchangesListingsCreate](x: Self) {
    
    inline def setListingId(value: String): Self = StObject.set(x, "listingId", value.asInstanceOf[js.Any])
    
    inline def setListingIdUndefined: Self = StObject.set(x, "listingId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaListing): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
