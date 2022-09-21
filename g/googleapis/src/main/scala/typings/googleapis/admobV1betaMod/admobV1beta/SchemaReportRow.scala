package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportRow extends StObject {
  
  /**
    * Map of dimension values in a row, with keys as enum name of the dimensions.
    */
  var dimensionValues: js.UndefOr[StringDictionary[SchemaReportRowDimensionValue] | Null] = js.undefined
  
  /**
    * Map of metric values in a row, with keys as enum name of the metrics. If a metric being requested has no value returned, the map will not include it.
    */
  var metricValues: js.UndefOr[StringDictionary[SchemaReportRowMetricValue] | Null] = js.undefined
}
object SchemaReportRow {
  
  inline def apply(): SchemaReportRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportRow]
  }
  
  extension [Self <: SchemaReportRow](x: Self) {
    
    inline def setDimensionValues(value: StringDictionary[SchemaReportRowDimensionValue]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesNull: Self = StObject.set(x, "dimensionValues", null)
    
    inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    inline def setMetricValues(value: StringDictionary[SchemaReportRowMetricValue]): Self = StObject.set(x, "metricValues", value.asInstanceOf[js.Any])
    
    inline def setMetricValuesNull: Self = StObject.set(x, "metricValues", null)
    
    inline def setMetricValuesUndefined: Self = StObject.set(x, "metricValues", js.undefined)
  }
}
