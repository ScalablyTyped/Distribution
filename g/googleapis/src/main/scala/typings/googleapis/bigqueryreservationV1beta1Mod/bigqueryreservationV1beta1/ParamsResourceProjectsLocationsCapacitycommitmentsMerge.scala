package typings.googleapis.bigqueryreservationV1beta1Mod.bigqueryreservationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCapacitycommitmentsMerge
  extends StObject
     with StandardParameters {
  
  /**
    * Parent resource that identifies admin project and location e.g., `projects/myproject/locations/us`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMergeCapacityCommitmentsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCapacitycommitmentsMerge {
  
  inline def apply(): ParamsResourceProjectsLocationsCapacitycommitmentsMerge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCapacitycommitmentsMerge]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCapacitycommitmentsMerge](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaMergeCapacityCommitmentsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
