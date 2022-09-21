package typings.googleapis.bigqueryreservationV1Mod.bigqueryreservationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGetbireservation
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the requested reservation, for example: `projects/{project_id\}/locations/{location_id\}/biReservation`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGetbireservation {
  
  inline def apply(): ParamsResourceProjectsLocationsGetbireservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGetbireservation]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGetbireservation](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
