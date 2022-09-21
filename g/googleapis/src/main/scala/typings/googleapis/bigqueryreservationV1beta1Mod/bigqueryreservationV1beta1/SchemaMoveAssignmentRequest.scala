package typings.googleapis.bigqueryreservationV1beta1Mod.bigqueryreservationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMoveAssignmentRequest extends StObject {
  
  /**
    * The new reservation ID, e.g.: `projects/myotherproject/locations/US/reservations/team2-prod`
    */
  var destinationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaMoveAssignmentRequest {
  
  inline def apply(): SchemaMoveAssignmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoveAssignmentRequest]
  }
  
  extension [Self <: SchemaMoveAssignmentRequest](x: Self) {
    
    inline def setDestinationId(value: String): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
    
    inline def setDestinationIdNull: Self = StObject.set(x, "destinationId", null)
    
    inline def setDestinationIdUndefined: Self = StObject.set(x, "destinationId", js.undefined)
  }
}
