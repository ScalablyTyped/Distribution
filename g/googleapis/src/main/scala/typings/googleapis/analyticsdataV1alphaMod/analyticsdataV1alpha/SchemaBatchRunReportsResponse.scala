package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchRunReportsResponse extends StObject {
  
  /**
    * Individual responses. Each response has a separate report request.
    */
  var reports: js.UndefOr[js.Array[SchemaRunReportResponse]] = js.undefined
}
object SchemaBatchRunReportsResponse {
  
  inline def apply(): SchemaBatchRunReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchRunReportsResponse]
  }
  
  extension [Self <: SchemaBatchRunReportsResponse](x: Self) {
    
    inline def setReports(value: js.Array[SchemaRunReportResponse]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setReportsVarargs(value: SchemaRunReportResponse*): Self = StObject.set(x, "reports", js.Array(value*))
  }
}
