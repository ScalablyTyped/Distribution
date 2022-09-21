package typings.googleapis.bigqueryreservationV1beta1Mod.bigqueryreservationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsReservationsAssignmentsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The optional assignment ID. Assignment name will be generated automatically if this field is empty. This field must only contain lower case alphanumeric characters or dashes. Max length is 64 characters.
    */
  var assignmentId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource name of the assignment E.g. `projects/myproject/locations/US/reservations/team1-prod`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAssignment] = js.undefined
}
object ParamsResourceProjectsLocationsReservationsAssignmentsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsReservationsAssignmentsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsReservationsAssignmentsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsReservationsAssignmentsCreate](x: Self) {
    
    inline def setAssignmentId(value: String): Self = StObject.set(x, "assignmentId", value.asInstanceOf[js.Any])
    
    inline def setAssignmentIdUndefined: Self = StObject.set(x, "assignmentId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAssignment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
