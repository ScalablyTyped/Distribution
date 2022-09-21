package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDataexchangesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The full name of the data exchange resource that you want to delete. For example, `projects/myproject/locations/US/dataExchanges/123`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDataexchangesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsDataexchangesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDataexchangesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDataexchangesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
