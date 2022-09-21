package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchRunPivotReportsResponse extends StObject {
  
  /**
    * Identifies what kind of resource this message is. This `kind` is always the fixed string "analyticsData#batchRunPivotReports". Useful to distinguish between response types in JSON.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Individual responses. Each response has a separate pivot report request.
    */
  var pivotReports: js.UndefOr[js.Array[SchemaRunPivotReportResponse]] = js.undefined
}
object SchemaBatchRunPivotReportsResponse {
  
  inline def apply(): SchemaBatchRunPivotReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchRunPivotReportsResponse]
  }
  
  extension [Self <: SchemaBatchRunPivotReportsResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPivotReports(value: js.Array[SchemaRunPivotReportResponse]): Self = StObject.set(x, "pivotReports", value.asInstanceOf[js.Any])
    
    inline def setPivotReportsUndefined: Self = StObject.set(x, "pivotReports", js.undefined)
    
    inline def setPivotReportsVarargs(value: SchemaRunPivotReportResponse*): Self = StObject.set(x, "pivotReports", js.Array(value*))
  }
}
