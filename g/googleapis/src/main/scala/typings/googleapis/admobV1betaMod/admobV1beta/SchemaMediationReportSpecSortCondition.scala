package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMediationReportSpecSortCondition extends StObject {
  
  /**
    * Sort by the specified dimension.
    */
  var dimension: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sort by the specified metric.
    */
  var metric: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sorting order of the dimension or metric.
    */
  var order: js.UndefOr[String | Null] = js.undefined
}
object SchemaMediationReportSpecSortCondition {
  
  inline def apply(): SchemaMediationReportSpecSortCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMediationReportSpecSortCondition]
  }
  
  extension [Self <: SchemaMediationReportSpecSortCondition](x: Self) {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionNull: Self = StObject.set(x, "dimension", null)
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricNull: Self = StObject.set(x, "metric", null)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
