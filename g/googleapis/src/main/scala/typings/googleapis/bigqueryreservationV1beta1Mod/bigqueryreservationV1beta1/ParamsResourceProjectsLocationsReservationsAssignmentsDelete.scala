package typings.googleapis.bigqueryreservationV1beta1Mod.bigqueryreservationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsReservationsAssignmentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the resource, e.g. `projects/myproject/locations/US/reservations/team1-prod/assignments/123`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsReservationsAssignmentsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsReservationsAssignmentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsReservationsAssignmentsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsReservationsAssignmentsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
