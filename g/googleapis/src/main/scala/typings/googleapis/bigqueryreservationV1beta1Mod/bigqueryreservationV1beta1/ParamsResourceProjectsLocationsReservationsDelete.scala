package typings.googleapis.bigqueryreservationV1beta1Mod.bigqueryreservationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsReservationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the reservation to retrieve. E.g., `projects/myproject/locations/US/reservations/team1-prod`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsReservationsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsReservationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsReservationsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsReservationsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
