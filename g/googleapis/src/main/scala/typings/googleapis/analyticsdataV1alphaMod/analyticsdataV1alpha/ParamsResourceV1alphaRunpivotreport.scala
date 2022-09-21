package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1alphaRunpivotreport
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRunPivotReportRequest] = js.undefined
}
object ParamsResourceV1alphaRunpivotreport {
  
  inline def apply(): ParamsResourceV1alphaRunpivotreport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1alphaRunpivotreport]
  }
  
  extension [Self <: ParamsResourceV1alphaRunpivotreport](x: Self) {
    
    inline def setRequestBody(value: SchemaRunPivotReportRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
