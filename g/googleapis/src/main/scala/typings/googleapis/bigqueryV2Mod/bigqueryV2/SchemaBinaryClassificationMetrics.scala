package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Evaluation metrics for binary classification models.
  */
@js.native
trait SchemaBinaryClassificationMetrics extends StObject {
  
  /**
    * Aggregate classification metrics.
    */
  var aggregateClassificationMetrics: js.UndefOr[SchemaAggregateClassificationMetrics] = js.native
  
  /**
    * Binary confusion matrix at multiple thresholds.
    */
  var binaryConfusionMatrixList: js.UndefOr[js.Array[SchemaBinaryConfusionMatrix]] = js.native
}
object SchemaBinaryClassificationMetrics {
  
  @scala.inline
  def apply(): SchemaBinaryClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinaryClassificationMetrics]
  }
  
  @scala.inline
  implicit class SchemaBinaryClassificationMetricsMutableBuilder[Self <: SchemaBinaryClassificationMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateClassificationMetrics(value: SchemaAggregateClassificationMetrics): Self = StObject.set(x, "aggregateClassificationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateClassificationMetricsUndefined: Self = StObject.set(x, "aggregateClassificationMetrics", js.undefined)
    
    @scala.inline
    def setBinaryConfusionMatrixList(value: js.Array[SchemaBinaryConfusionMatrix]): Self = StObject.set(x, "binaryConfusionMatrixList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryConfusionMatrixListUndefined: Self = StObject.set(x, "binaryConfusionMatrixList", js.undefined)
    
    @scala.inline
    def setBinaryConfusionMatrixListVarargs(value: SchemaBinaryConfusionMatrix*): Self = StObject.set(x, "binaryConfusionMatrixList", js.Array(value :_*))
  }
}
