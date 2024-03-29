package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchRunPivotReportsResponse extends StObject {
  
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
    
    inline def setPivotReports(value: js.Array[SchemaRunPivotReportResponse]): Self = StObject.set(x, "pivotReports", value.asInstanceOf[js.Any])
    
    inline def setPivotReportsUndefined: Self = StObject.set(x, "pivotReports", js.undefined)
    
    inline def setPivotReportsVarargs(value: SchemaRunPivotReportResponse*): Self = StObject.set(x, "pivotReports", js.Array(value*))
  }
}
