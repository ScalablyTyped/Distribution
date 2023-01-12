package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlJob extends StObject {
  
  var allow_lazy_open: Boolean
  
  var analysis_config: MlAnalysisConfig
  
  var analysis_limits: js.UndefOr[MlAnalysisLimits] = js.undefined
  
  var background_persist_interval: js.UndefOr[Duration] = js.undefined
  
  var blocked: js.UndefOr[MlJobBlocked] = js.undefined
  
  var create_time: js.UndefOr[DateTime] = js.undefined
  
  var custom_settings: js.UndefOr[MlCustomSettings] = js.undefined
  
  var daily_model_snapshot_retention_after_days: js.UndefOr[long] = js.undefined
  
  var data_description: MlDataDescription
  
  var datafeed_config: js.UndefOr[MlDatafeed] = js.undefined
  
  var deleting: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var finished_time: js.UndefOr[DateTime] = js.undefined
  
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  
  var job_id: Id
  
  var job_type: js.UndefOr[String] = js.undefined
  
  var job_version: js.UndefOr[VersionString] = js.undefined
  
  var model_plot_config: js.UndefOr[MlModelPlotConfig] = js.undefined
  
  var model_snapshot_id: js.UndefOr[Id] = js.undefined
  
  var model_snapshot_retention_days: long
  
  var renormalization_window_days: js.UndefOr[long] = js.undefined
  
  var results_index_name: IndexName
  
  var results_retention_days: js.UndefOr[long] = js.undefined
}
object MlJob {
  
  inline def apply(
    allow_lazy_open: Boolean,
    analysis_config: MlAnalysisConfig,
    data_description: MlDataDescription,
    job_id: Id,
    model_snapshot_retention_days: long,
    results_index_name: IndexName
  ): MlJob = {
    val __obj = js.Dynamic.literal(allow_lazy_open = allow_lazy_open.asInstanceOf[js.Any], analysis_config = analysis_config.asInstanceOf[js.Any], data_description = data_description.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], model_snapshot_retention_days = model_snapshot_retention_days.asInstanceOf[js.Any], results_index_name = results_index_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlJob] (val x: Self) extends AnyVal {
    
    inline def setAllow_lazy_open(value: Boolean): Self = StObject.set(x, "allow_lazy_open", value.asInstanceOf[js.Any])
    
    inline def setAnalysis_config(value: MlAnalysisConfig): Self = StObject.set(x, "analysis_config", value.asInstanceOf[js.Any])
    
    inline def setAnalysis_limits(value: MlAnalysisLimits): Self = StObject.set(x, "analysis_limits", value.asInstanceOf[js.Any])
    
    inline def setAnalysis_limitsUndefined: Self = StObject.set(x, "analysis_limits", js.undefined)
    
    inline def setBackground_persist_interval(value: Duration): Self = StObject.set(x, "background_persist_interval", value.asInstanceOf[js.Any])
    
    inline def setBackground_persist_intervalUndefined: Self = StObject.set(x, "background_persist_interval", js.undefined)
    
    inline def setBlocked(value: MlJobBlocked): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    inline def setCreate_time(value: DateTime): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    inline def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    
    inline def setCustom_settings(value: MlCustomSettings): Self = StObject.set(x, "custom_settings", value.asInstanceOf[js.Any])
    
    inline def setCustom_settingsUndefined: Self = StObject.set(x, "custom_settings", js.undefined)
    
    inline def setDaily_model_snapshot_retention_after_days(value: long): Self = StObject.set(x, "daily_model_snapshot_retention_after_days", value.asInstanceOf[js.Any])
    
    inline def setDaily_model_snapshot_retention_after_daysUndefined: Self = StObject.set(x, "daily_model_snapshot_retention_after_days", js.undefined)
    
    inline def setData_description(value: MlDataDescription): Self = StObject.set(x, "data_description", value.asInstanceOf[js.Any])
    
    inline def setDatafeed_config(value: MlDatafeed): Self = StObject.set(x, "datafeed_config", value.asInstanceOf[js.Any])
    
    inline def setDatafeed_configUndefined: Self = StObject.set(x, "datafeed_config", js.undefined)
    
    inline def setDeleting(value: Boolean): Self = StObject.set(x, "deleting", value.asInstanceOf[js.Any])
    
    inline def setDeletingUndefined: Self = StObject.set(x, "deleting", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFinished_time(value: DateTime): Self = StObject.set(x, "finished_time", value.asInstanceOf[js.Any])
    
    inline def setFinished_timeUndefined: Self = StObject.set(x, "finished_time", js.undefined)
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setJob_type(value: String): Self = StObject.set(x, "job_type", value.asInstanceOf[js.Any])
    
    inline def setJob_typeUndefined: Self = StObject.set(x, "job_type", js.undefined)
    
    inline def setJob_version(value: VersionString): Self = StObject.set(x, "job_version", value.asInstanceOf[js.Any])
    
    inline def setJob_versionUndefined: Self = StObject.set(x, "job_version", js.undefined)
    
    inline def setModel_plot_config(value: MlModelPlotConfig): Self = StObject.set(x, "model_plot_config", value.asInstanceOf[js.Any])
    
    inline def setModel_plot_configUndefined: Self = StObject.set(x, "model_plot_config", js.undefined)
    
    inline def setModel_snapshot_id(value: Id): Self = StObject.set(x, "model_snapshot_id", value.asInstanceOf[js.Any])
    
    inline def setModel_snapshot_idUndefined: Self = StObject.set(x, "model_snapshot_id", js.undefined)
    
    inline def setModel_snapshot_retention_days(value: long): Self = StObject.set(x, "model_snapshot_retention_days", value.asInstanceOf[js.Any])
    
    inline def setRenormalization_window_days(value: long): Self = StObject.set(x, "renormalization_window_days", value.asInstanceOf[js.Any])
    
    inline def setRenormalization_window_daysUndefined: Self = StObject.set(x, "renormalization_window_days", js.undefined)
    
    inline def setResults_index_name(value: IndexName): Self = StObject.set(x, "results_index_name", value.asInstanceOf[js.Any])
    
    inline def setResults_retention_days(value: long): Self = StObject.set(x, "results_retention_days", value.asInstanceOf[js.Any])
    
    inline def setResults_retention_daysUndefined: Self = StObject.set(x, "results_retention_days", js.undefined)
  }
}
