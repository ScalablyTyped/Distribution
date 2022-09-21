package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDataexchangesListingsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the listing. e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDataexchangesListingsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsDataexchangesListingsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDataexchangesListingsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDataexchangesListingsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
