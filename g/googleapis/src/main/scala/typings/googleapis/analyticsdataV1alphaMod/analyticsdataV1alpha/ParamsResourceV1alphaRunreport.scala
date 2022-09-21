package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1alphaRunreport
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRunReportRequest] = js.undefined
}
object ParamsResourceV1alphaRunreport {
  
  inline def apply(): ParamsResourceV1alphaRunreport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1alphaRunreport]
  }
  
  extension [Self <: ParamsResourceV1alphaRunreport](x: Self) {
    
    inline def setRequestBody(value: SchemaRunReportRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
