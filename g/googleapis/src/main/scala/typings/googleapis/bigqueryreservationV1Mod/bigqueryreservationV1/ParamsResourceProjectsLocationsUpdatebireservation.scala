package typings.googleapis.bigqueryreservationV1Mod.bigqueryreservationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsUpdatebireservation
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the singleton BI reservation. Reservation names have the form `projects/{project_id\}/locations/{location_id\}/biReservation`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBiReservation] = js.undefined
  
  /**
    * A list of fields to be updated in this request.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsUpdatebireservation {
  
  inline def apply(): ParamsResourceProjectsLocationsUpdatebireservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsUpdatebireservation]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsUpdatebireservation](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaBiReservation): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
