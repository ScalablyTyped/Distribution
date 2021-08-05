package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Evaluation metrics for multi-class classification models.
  */
trait SchemaMultiClassClassificationMetrics extends StObject {
  
  /**
    * Aggregate classification metrics.
    */
  var aggregateClassificationMetrics: js.UndefOr[SchemaAggregateClassificationMetrics] = js.undefined
  
  /**
    * Confusion matrix at different thresholds.
    */
  var confusionMatrixList: js.UndefOr[js.Array[SchemaConfusionMatrix]] = js.undefined
}
object SchemaMultiClassClassificationMetrics {
  
  inline def apply(): SchemaMultiClassClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultiClassClassificationMetrics]
  }
  
  extension [Self <: SchemaMultiClassClassificationMetrics](x: Self) {
    
    inline def setAggregateClassificationMetrics(value: SchemaAggregateClassificationMetrics): Self = StObject.set(x, "aggregateClassificationMetrics", value.asInstanceOf[js.Any])
    
    inline def setAggregateClassificationMetricsUndefined: Self = StObject.set(x, "aggregateClassificationMetrics", js.undefined)
    
    inline def setConfusionMatrixList(value: js.Array[SchemaConfusionMatrix]): Self = StObject.set(x, "confusionMatrixList", value.asInstanceOf[js.Any])
    
    inline def setConfusionMatrixListUndefined: Self = StObject.set(x, "confusionMatrixList", js.undefined)
    
    inline def setConfusionMatrixListVarargs(value: SchemaConfusionMatrix*): Self = StObject.set(x, "confusionMatrixList", js.Array(value :_*))
  }
}
