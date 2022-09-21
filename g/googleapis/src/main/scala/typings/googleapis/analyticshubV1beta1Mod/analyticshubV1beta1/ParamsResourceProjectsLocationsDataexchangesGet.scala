package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDataexchangesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the data exchange. e.g. `projects/myproject/locations/US/dataExchanges/123`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDataexchangesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsDataexchangesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDataexchangesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDataexchangesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
