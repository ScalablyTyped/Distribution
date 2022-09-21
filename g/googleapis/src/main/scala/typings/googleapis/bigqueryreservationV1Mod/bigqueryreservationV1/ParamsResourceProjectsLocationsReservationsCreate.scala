package typings.googleapis.bigqueryreservationV1Mod.bigqueryreservationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsReservationsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Project, location. E.g., `projects/myproject/locations/US`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReservation] = js.undefined
  
  /**
    * The reservation ID. It must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
    */
  var reservationId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsReservationsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsReservationsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsReservationsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsReservationsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaReservation): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setReservationId(value: String): Self = StObject.set(x, "reservationId", value.asInstanceOf[js.Any])
    
    inline def setReservationIdUndefined: Self = StObject.set(x, "reservationId", js.undefined)
  }
}
