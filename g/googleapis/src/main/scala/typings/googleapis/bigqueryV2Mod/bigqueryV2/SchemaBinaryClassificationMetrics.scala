package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBinaryClassificationMetrics extends StObject {
  
  /**
    * Aggregate classification metrics.
    */
  var aggregateClassificationMetrics: js.UndefOr[SchemaAggregateClassificationMetrics] = js.undefined
  
  /**
    * Binary confusion matrix at multiple thresholds.
    */
  var binaryConfusionMatrixList: js.UndefOr[js.Array[SchemaBinaryConfusionMatrix]] = js.undefined
  
  /**
    * Label representing the negative class.
    */
  var negativeLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Label representing the positive class.
    */
  var positiveLabel: js.UndefOr[String | Null] = js.undefined
}
object SchemaBinaryClassificationMetrics {
  
  inline def apply(): SchemaBinaryClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinaryClassificationMetrics]
  }
  
  extension [Self <: SchemaBinaryClassificationMetrics](x: Self) {
    
    inline def setAggregateClassificationMetrics(value: SchemaAggregateClassificationMetrics): Self = StObject.set(x, "aggregateClassificationMetrics", value.asInstanceOf[js.Any])
    
    inline def setAggregateClassificationMetricsUndefined: Self = StObject.set(x, "aggregateClassificationMetrics", js.undefined)
    
    inline def setBinaryConfusionMatrixList(value: js.Array[SchemaBinaryConfusionMatrix]): Self = StObject.set(x, "binaryConfusionMatrixList", value.asInstanceOf[js.Any])
    
    inline def setBinaryConfusionMatrixListUndefined: Self = StObject.set(x, "binaryConfusionMatrixList", js.undefined)
    
    inline def setBinaryConfusionMatrixListVarargs(value: SchemaBinaryConfusionMatrix*): Self = StObject.set(x, "binaryConfusionMatrixList", js.Array(value*))
    
    inline def setNegativeLabel(value: String): Self = StObject.set(x, "negativeLabel", value.asInstanceOf[js.Any])
    
    inline def setNegativeLabelNull: Self = StObject.set(x, "negativeLabel", null)
    
    inline def setNegativeLabelUndefined: Self = StObject.set(x, "negativeLabel", js.undefined)
    
    inline def setPositiveLabel(value: String): Self = StObject.set(x, "positiveLabel", value.asInstanceOf[js.Any])
    
    inline def setPositiveLabelNull: Self = StObject.set(x, "positiveLabel", null)
    
    inline def setPositiveLabelUndefined: Self = StObject.set(x, "positiveLabel", js.undefined)
  }
}
