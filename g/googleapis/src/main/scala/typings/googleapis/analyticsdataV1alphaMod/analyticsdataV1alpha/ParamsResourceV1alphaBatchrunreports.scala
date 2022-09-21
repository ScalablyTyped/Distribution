package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1alphaBatchrunreports
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchRunReportsRequest] = js.undefined
}
object ParamsResourceV1alphaBatchrunreports {
  
  inline def apply(): ParamsResourceV1alphaBatchrunreports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1alphaBatchrunreports]
  }
  
  extension [Self <: ParamsResourceV1alphaBatchrunreports](x: Self) {
    
    inline def setRequestBody(value: SchemaBatchRunReportsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
