package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderBy extends StObject {
  
  /**
    * If true, sorts by descending order.
    */
  var desc: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Sorts results by a dimension's values.
    */
  var dimension: js.UndefOr[SchemaDimensionOrderBy] = js.undefined
  
  /**
    * Sorts results by a metric's values.
    */
  var metric: js.UndefOr[SchemaMetricOrderBy] = js.undefined
  
  /**
    * Sorts results by a metric's values within a pivot column group.
    */
  var pivot: js.UndefOr[SchemaPivotOrderBy] = js.undefined
}
object SchemaOrderBy {
  
  inline def apply(): SchemaOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderBy]
  }
  
  extension [Self <: SchemaOrderBy](x: Self) {
    
    inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescNull: Self = StObject.set(x, "desc", null)
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setDimension(value: SchemaDimensionOrderBy): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setMetric(value: SchemaMetricOrderBy): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setPivot(value: SchemaPivotOrderBy): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
    
    inline def setPivotUndefined: Self = StObject.set(x, "pivot", js.undefined)
  }
}
