package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEvaluationMetrics extends StObject {
  
  /**
    * Populated for ARIMA models.
    */
  var arimaForecastingMetrics: js.UndefOr[SchemaArimaForecastingMetrics] = js.undefined
  
  /**
    * Populated for binary classification/classifier models.
    */
  var binaryClassificationMetrics: js.UndefOr[SchemaBinaryClassificationMetrics] = js.undefined
  
  /**
    * Populated for clustering models.
    */
  var clusteringMetrics: js.UndefOr[SchemaClusteringMetrics] = js.undefined
  
  /**
    * Evaluation metrics when the model is a dimensionality reduction model, which currently includes PCA.
    */
  var dimensionalityReductionMetrics: js.UndefOr[SchemaDimensionalityReductionMetrics] = js.undefined
  
  /**
    * Populated for multi-class classification/classifier models.
    */
  var multiClassClassificationMetrics: js.UndefOr[SchemaMultiClassClassificationMetrics] = js.undefined
  
  /**
    * Populated for implicit feedback type matrix factorization models.
    */
  var rankingMetrics: js.UndefOr[SchemaRankingMetrics] = js.undefined
  
  /**
    * Populated for regression models and explicit feedback type matrix factorization models.
    */
  var regressionMetrics: js.UndefOr[SchemaRegressionMetrics] = js.undefined
}
object SchemaEvaluationMetrics {
  
  inline def apply(): SchemaEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvaluationMetrics]
  }
  
  extension [Self <: SchemaEvaluationMetrics](x: Self) {
    
    inline def setArimaForecastingMetrics(value: SchemaArimaForecastingMetrics): Self = StObject.set(x, "arimaForecastingMetrics", value.asInstanceOf[js.Any])
    
    inline def setArimaForecastingMetricsUndefined: Self = StObject.set(x, "arimaForecastingMetrics", js.undefined)
    
    inline def setBinaryClassificationMetrics(value: SchemaBinaryClassificationMetrics): Self = StObject.set(x, "binaryClassificationMetrics", value.asInstanceOf[js.Any])
    
    inline def setBinaryClassificationMetricsUndefined: Self = StObject.set(x, "binaryClassificationMetrics", js.undefined)
    
    inline def setClusteringMetrics(value: SchemaClusteringMetrics): Self = StObject.set(x, "clusteringMetrics", value.asInstanceOf[js.Any])
    
    inline def setClusteringMetricsUndefined: Self = StObject.set(x, "clusteringMetrics", js.undefined)
    
    inline def setDimensionalityReductionMetrics(value: SchemaDimensionalityReductionMetrics): Self = StObject.set(x, "dimensionalityReductionMetrics", value.asInstanceOf[js.Any])
    
    inline def setDimensionalityReductionMetricsUndefined: Self = StObject.set(x, "dimensionalityReductionMetrics", js.undefined)
    
    inline def setMultiClassClassificationMetrics(value: SchemaMultiClassClassificationMetrics): Self = StObject.set(x, "multiClassClassificationMetrics", value.asInstanceOf[js.Any])
    
    inline def setMultiClassClassificationMetricsUndefined: Self = StObject.set(x, "multiClassClassificationMetrics", js.undefined)
    
    inline def setRankingMetrics(value: SchemaRankingMetrics): Self = StObject.set(x, "rankingMetrics", value.asInstanceOf[js.Any])
    
    inline def setRankingMetricsUndefined: Self = StObject.set(x, "rankingMetrics", js.undefined)
    
    inline def setRegressionMetrics(value: SchemaRegressionMetrics): Self = StObject.set(x, "regressionMetrics", value.asInstanceOf[js.Any])
    
    inline def setRegressionMetricsUndefined: Self = StObject.set(x, "regressionMetrics", js.undefined)
  }
}
