package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRow extends StObject {
  
  /**
    * List of requested dimension values. In a PivotReport, dimension_values are only listed for dimensions included in a pivot.
    */
  var dimensionValues: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
  
  /**
    * List of requested visible metric values.
    */
  var metricValues: js.UndefOr[js.Array[SchemaMetricValue]] = js.undefined
}
object SchemaRow {
  
  inline def apply(): SchemaRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRow]
  }
  
  extension [Self <: SchemaRow](x: Self) {
    
    inline def setDimensionValues(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    inline def setDimensionValuesVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "dimensionValues", js.Array(value*))
    
    inline def setMetricValues(value: js.Array[SchemaMetricValue]): Self = StObject.set(x, "metricValues", value.asInstanceOf[js.Any])
    
    inline def setMetricValuesUndefined: Self = StObject.set(x, "metricValues", js.undefined)
    
    inline def setMetricValuesVarargs(value: SchemaMetricValue*): Self = StObject.set(x, "metricValues", js.Array(value*))
  }
}
