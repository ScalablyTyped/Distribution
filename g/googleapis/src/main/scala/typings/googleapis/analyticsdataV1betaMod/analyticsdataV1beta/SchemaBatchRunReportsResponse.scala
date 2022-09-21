package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchRunReportsResponse extends StObject {
  
  /**
    * Identifies what kind of resource this message is. This `kind` is always the fixed string "analyticsData#batchRunReports". Useful to distinguish between response types in JSON.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
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
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setReports(value: js.Array[SchemaRunReportResponse]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setReportsVarargs(value: SchemaRunReportResponse*): Self = StObject.set(x, "reports", js.Array(value*))
  }
}
