package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPivotOrderBy extends StObject {
  
  /**
    * In the response to order by, order rows by this column. Must be a metric name from the request.
    */
  var metricName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used to select a dimension name and value pivot. If multiple pivot selections are given, the sort occurs on rows where all pivot selection dimension name and value pairs match the row's dimension name and value pair.
    */
  var pivotSelections: js.UndefOr[js.Array[SchemaPivotSelection]] = js.undefined
}
object SchemaPivotOrderBy {
  
  inline def apply(): SchemaPivotOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotOrderBy]
  }
  
  extension [Self <: SchemaPivotOrderBy](x: Self) {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameNull: Self = StObject.set(x, "metricName", null)
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setPivotSelections(value: js.Array[SchemaPivotSelection]): Self = StObject.set(x, "pivotSelections", value.asInstanceOf[js.Any])
    
    inline def setPivotSelectionsUndefined: Self = StObject.set(x, "pivotSelections", js.undefined)
    
    inline def setPivotSelectionsVarargs(value: SchemaPivotSelection*): Self = StObject.set(x, "pivotSelections", js.Array(value*))
  }
}
