package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlUpdateJobRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_lazy_open: js.UndefOr[Boolean] = js.undefined
  
  var analysis_limits: js.UndefOr[MlAnalysisMemoryLimit] = js.undefined
  
  var background_persist_interval: js.UndefOr[Duration] = js.undefined
  
  var categorization_filters: js.UndefOr[js.Array[String]] = js.undefined
  
  var custom_settings: js.UndefOr[Record[String, Any]] = js.undefined
  
  var daily_model_snapshot_retention_after_days: js.UndefOr[long] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var detectors: js.UndefOr[js.Array[MlDetector]] = js.undefined
  
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  
  var job_id: Id
  
  var model_plot_config: js.UndefOr[MlModelPlotConfig] = js.undefined
  
  var model_snapshot_retention_days: js.UndefOr[long] = js.undefined
  
  var per_partition_categorization: js.UndefOr[MlPerPartitionCategorization] = js.undefined
  
  var renormalization_window_days: js.UndefOr[long] = js.undefined
  
  var results_retention_days: js.UndefOr[long] = js.undefined
}
object MlUpdateJobRequest {
  
  inline def apply(job_id: Id): MlUpdateJobRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateJobRequest]
  }
  
  extension [Self <: MlUpdateJobRequest](x: Self) {
    
    inline def setAllow_lazy_open(value: Boolean): Self = StObject.set(x, "allow_lazy_open", value.asInstanceOf[js.Any])
    
    inline def setAllow_lazy_openUndefined: Self = StObject.set(x, "allow_lazy_open", js.undefined)
    
    inline def setAnalysis_limits(value: MlAnalysisMemoryLimit): Self = StObject.set(x, "analysis_limits", value.asInstanceOf[js.Any])
    
    inline def setAnalysis_limitsUndefined: Self = StObject.set(x, "analysis_limits", js.undefined)
    
    inline def setBackground_persist_interval(value: Duration): Self = StObject.set(x, "background_persist_interval", value.asInstanceOf[js.Any])
    
    inline def setBackground_persist_intervalUndefined: Self = StObject.set(x, "background_persist_interval", js.undefined)
    
    inline def setCategorization_filters(value: js.Array[String]): Self = StObject.set(x, "categorization_filters", value.asInstanceOf[js.Any])
    
    inline def setCategorization_filtersUndefined: Self = StObject.set(x, "categorization_filters", js.undefined)
    
    inline def setCategorization_filtersVarargs(value: String*): Self = StObject.set(x, "categorization_filters", js.Array(value*))
    
    inline def setCustom_settings(value: Record[String, Any]): Self = StObject.set(x, "custom_settings", value.asInstanceOf[js.Any])
    
    inline def setCustom_settingsUndefined: Self = StObject.set(x, "custom_settings", js.undefined)
    
    inline def setDaily_model_snapshot_retention_after_days(value: long): Self = StObject.set(x, "daily_model_snapshot_retention_after_days", value.asInstanceOf[js.Any])
    
    inline def setDaily_model_snapshot_retention_after_daysUndefined: Self = StObject.set(x, "daily_model_snapshot_retention_after_days", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetectors(value: js.Array[MlDetector]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setDetectorsUndefined: Self = StObject.set(x, "detectors", js.undefined)
    
    inline def setDetectorsVarargs(value: MlDetector*): Self = StObject.set(x, "detectors", js.Array(value*))
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setModel_plot_config(value: MlModelPlotConfig): Self = StObject.set(x, "model_plot_config", value.asInstanceOf[js.Any])
    
    inline def setModel_plot_configUndefined: Self = StObject.set(x, "model_plot_config", js.undefined)
    
    inline def setModel_snapshot_retention_days(value: long): Self = StObject.set(x, "model_snapshot_retention_days", value.asInstanceOf[js.Any])
    
    inline def setModel_snapshot_retention_daysUndefined: Self = StObject.set(x, "model_snapshot_retention_days", js.undefined)
    
    inline def setPer_partition_categorization(value: MlPerPartitionCategorization): Self = StObject.set(x, "per_partition_categorization", value.asInstanceOf[js.Any])
    
    inline def setPer_partition_categorizationUndefined: Self = StObject.set(x, "per_partition_categorization", js.undefined)
    
    inline def setRenormalization_window_days(value: long): Self = StObject.set(x, "renormalization_window_days", value.asInstanceOf[js.Any])
    
    inline def setRenormalization_window_daysUndefined: Self = StObject.set(x, "renormalization_window_days", js.undefined)
    
    inline def setResults_retention_days(value: long): Self = StObject.set(x, "results_retention_days", value.asInstanceOf[js.Any])
    
    inline def setResults_retention_daysUndefined: Self = StObject.set(x, "results_retention_days", js.undefined)
  }
}
