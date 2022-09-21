package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricOrderBy extends StObject {
  
  /**
    * A metric name in the request to order by.
    */
  var metricName: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetricOrderBy {
  
  inline def apply(): SchemaMetricOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricOrderBy]
  }
  
  extension [Self <: SchemaMetricOrderBy](x: Self) {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameNull: Self = StObject.set(x, "metricName", null)
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
