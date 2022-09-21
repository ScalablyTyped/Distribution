package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1alphaBatchrunpivotreports
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchRunPivotReportsRequest] = js.undefined
}
object ParamsResourceV1alphaBatchrunpivotreports {
  
  inline def apply(): ParamsResourceV1alphaBatchrunpivotreports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1alphaBatchrunpivotreports]
  }
  
  extension [Self <: ParamsResourceV1alphaBatchrunpivotreports](x: Self) {
    
    inline def setRequestBody(value: SchemaBatchRunPivotReportsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
