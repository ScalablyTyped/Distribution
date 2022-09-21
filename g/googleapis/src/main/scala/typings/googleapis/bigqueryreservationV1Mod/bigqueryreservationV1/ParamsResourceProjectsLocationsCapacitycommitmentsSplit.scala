package typings.googleapis.bigqueryreservationV1Mod.bigqueryreservationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCapacitycommitmentsSplit
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name e.g.,: `projects/myproject/locations/US/capacityCommitments/123`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSplitCapacityCommitmentRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCapacitycommitmentsSplit {
  
  inline def apply(): ParamsResourceProjectsLocationsCapacitycommitmentsSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCapacitycommitmentsSplit]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCapacitycommitmentsSplit](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSplitCapacityCommitmentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
