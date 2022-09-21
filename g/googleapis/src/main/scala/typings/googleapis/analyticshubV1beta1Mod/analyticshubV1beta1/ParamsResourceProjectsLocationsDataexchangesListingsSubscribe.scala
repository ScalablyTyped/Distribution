package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDataexchangesListingsSubscribe
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the listing that you want to subscribe to. e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSubscribeListingRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDataexchangesListingsSubscribe {
  
  inline def apply(): ParamsResourceProjectsLocationsDataexchangesListingsSubscribe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDataexchangesListingsSubscribe]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDataexchangesListingsSubscribe](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSubscribeListingRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
