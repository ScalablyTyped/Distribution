package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Evaluation metrics of a model. These are either computed on all training
  * data or just the eval data based on whether eval data was used during
  * training.
  */
trait SchemaEvaluationMetrics extends StObject {
  
  /**
    * Populated for binary classification models.
    */
  var binaryClassificationMetrics: js.UndefOr[SchemaBinaryClassificationMetrics] = js.undefined
  
  /**
    * [Beta] Populated for clustering models.
    */
  var clusteringMetrics: js.UndefOr[SchemaClusteringMetrics] = js.undefined
  
  /**
    * Populated for multi-class classification models.
    */
  var multiClassClassificationMetrics: js.UndefOr[SchemaMultiClassClassificationMetrics] = js.undefined
  
  /**
    * Populated for regression models.
    */
  var regressionMetrics: js.UndefOr[SchemaRegressionMetrics] = js.undefined
}
object SchemaEvaluationMetrics {
  
  @scala.inline
  def apply(): SchemaEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvaluationMetrics]
  }
  
  @scala.inline
  implicit class SchemaEvaluationMetricsMutableBuilder[Self <: SchemaEvaluationMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryClassificationMetrics(value: SchemaBinaryClassificationMetrics): Self = StObject.set(x, "binaryClassificationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryClassificationMetricsUndefined: Self = StObject.set(x, "binaryClassificationMetrics", js.undefined)
    
    @scala.inline
    def setClusteringMetrics(value: SchemaClusteringMetrics): Self = StObject.set(x, "clusteringMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusteringMetricsUndefined: Self = StObject.set(x, "clusteringMetrics", js.undefined)
    
    @scala.inline
    def setMultiClassClassificationMetrics(value: SchemaMultiClassClassificationMetrics): Self = StObject.set(x, "multiClassClassificationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiClassClassificationMetricsUndefined: Self = StObject.set(x, "multiClassClassificationMetrics", js.undefined)
    
    @scala.inline
    def setRegressionMetrics(value: SchemaRegressionMetrics): Self = StObject.set(x, "regressionMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegressionMetricsUndefined: Self = StObject.set(x, "regressionMetrics", js.undefined)
  }
}
