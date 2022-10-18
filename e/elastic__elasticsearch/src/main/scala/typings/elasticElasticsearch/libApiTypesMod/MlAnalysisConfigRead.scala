package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlAnalysisConfigRead extends StObject {
  
  var bucket_span: Duration
  
  var categorization_analyzer: js.UndefOr[MlCategorizationAnalyzer] = js.undefined
  
  var categorization_field_name: js.UndefOr[Field] = js.undefined
  
  var categorization_filters: js.UndefOr[js.Array[String]] = js.undefined
  
  var detectors: js.Array[MlDetectorRead]
  
  var influencers: js.Array[Field]
  
  var latency: js.UndefOr[Duration] = js.undefined
  
  var model_prune_window: js.UndefOr[Duration] = js.undefined
  
  var multivariate_by_fields: js.UndefOr[Boolean] = js.undefined
  
  var per_partition_categorization: js.UndefOr[MlPerPartitionCategorization] = js.undefined
  
  var summary_count_field_name: js.UndefOr[Field] = js.undefined
}
object MlAnalysisConfigRead {
  
  inline def apply(bucket_span: Duration, detectors: js.Array[MlDetectorRead], influencers: js.Array[Field]): MlAnalysisConfigRead = {
    val __obj = js.Dynamic.literal(bucket_span = bucket_span.asInstanceOf[js.Any], detectors = detectors.asInstanceOf[js.Any], influencers = influencers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlAnalysisConfigRead]
  }
  
  extension [Self <: MlAnalysisConfigRead](x: Self) {
    
    inline def setBucket_span(value: Duration): Self = StObject.set(x, "bucket_span", value.asInstanceOf[js.Any])
    
    inline def setCategorization_analyzer(value: MlCategorizationAnalyzer): Self = StObject.set(x, "categorization_analyzer", value.asInstanceOf[js.Any])
    
    inline def setCategorization_analyzerUndefined: Self = StObject.set(x, "categorization_analyzer", js.undefined)
    
    inline def setCategorization_field_name(value: Field): Self = StObject.set(x, "categorization_field_name", value.asInstanceOf[js.Any])
    
    inline def setCategorization_field_nameUndefined: Self = StObject.set(x, "categorization_field_name", js.undefined)
    
    inline def setCategorization_filters(value: js.Array[String]): Self = StObject.set(x, "categorization_filters", value.asInstanceOf[js.Any])
    
    inline def setCategorization_filtersUndefined: Self = StObject.set(x, "categorization_filters", js.undefined)
    
    inline def setCategorization_filtersVarargs(value: String*): Self = StObject.set(x, "categorization_filters", js.Array(value*))
    
    inline def setDetectors(value: js.Array[MlDetectorRead]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setDetectorsVarargs(value: MlDetectorRead*): Self = StObject.set(x, "detectors", js.Array(value*))
    
    inline def setInfluencers(value: js.Array[Field]): Self = StObject.set(x, "influencers", value.asInstanceOf[js.Any])
    
    inline def setInfluencersVarargs(value: Field*): Self = StObject.set(x, "influencers", js.Array(value*))
    
    inline def setLatency(value: Duration): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    inline def setModel_prune_window(value: Duration): Self = StObject.set(x, "model_prune_window", value.asInstanceOf[js.Any])
    
    inline def setModel_prune_windowUndefined: Self = StObject.set(x, "model_prune_window", js.undefined)
    
    inline def setMultivariate_by_fields(value: Boolean): Self = StObject.set(x, "multivariate_by_fields", value.asInstanceOf[js.Any])
    
    inline def setMultivariate_by_fieldsUndefined: Self = StObject.set(x, "multivariate_by_fields", js.undefined)
    
    inline def setPer_partition_categorization(value: MlPerPartitionCategorization): Self = StObject.set(x, "per_partition_categorization", value.asInstanceOf[js.Any])
    
    inline def setPer_partition_categorizationUndefined: Self = StObject.set(x, "per_partition_categorization", js.undefined)
    
    inline def setSummary_count_field_name(value: Field): Self = StObject.set(x, "summary_count_field_name", value.asInstanceOf[js.Any])
    
    inline def setSummary_count_field_nameUndefined: Self = StObject.set(x, "summary_count_field_name", js.undefined)
  }
}
