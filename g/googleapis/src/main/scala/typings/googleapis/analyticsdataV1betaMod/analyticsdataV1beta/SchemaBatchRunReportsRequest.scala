package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchRunReportsRequest extends StObject {
  
  /**
    * Individual requests. Each request has a separate report response. Each batch request is allowed up to 5 requests.
    */
  var requests: js.UndefOr[js.Array[SchemaRunReportRequest]] = js.undefined
}
object SchemaBatchRunReportsRequest {
  
  inline def apply(): SchemaBatchRunReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchRunReportsRequest]
  }
  
  extension [Self <: SchemaBatchRunReportsRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaRunReportRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaRunReportRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
