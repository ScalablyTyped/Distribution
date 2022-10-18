package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlAnalysisConfig
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlAnalysisLimits
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlDataDescription
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlModelPlotConfig
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datadescription extends StObject {
  
  var analysis_config: js.UndefOr[MlAnalysisConfig] = js.undefined
  
  var analysis_limits: js.UndefOr[MlAnalysisLimits] = js.undefined
  
  var data_description: js.UndefOr[MlDataDescription] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var job_id: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id] = js.undefined
  
  var model_plot: js.UndefOr[MlModelPlotConfig] = js.undefined
  
  var model_snapshot_id: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id] = js.undefined
  
  var model_snapshot_retention_days: js.UndefOr[long] = js.undefined
  
  var results_index_name: js.UndefOr[IndexName] = js.undefined
}
object Datadescription {
  
  inline def apply(): Datadescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datadescription]
  }
  
  extension [Self <: Datadescription](x: Self) {
    
    inline def setAnalysis_config(value: MlAnalysisConfig): Self = StObject.set(x, "analysis_config", value.asInstanceOf[js.Any])
    
    inline def setAnalysis_configUndefined: Self = StObject.set(x, "analysis_config", js.undefined)
    
    inline def setAnalysis_limits(value: MlAnalysisLimits): Self = StObject.set(x, "analysis_limits", value.asInstanceOf[js.Any])
    
    inline def setAnalysis_limitsUndefined: Self = StObject.set(x, "analysis_limits", js.undefined)
    
    inline def setData_description(value: MlDataDescription): Self = StObject.set(x, "data_description", value.asInstanceOf[js.Any])
    
    inline def setData_descriptionUndefined: Self = StObject.set(x, "data_description", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setJob_id(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    inline def setModel_plot(value: MlModelPlotConfig): Self = StObject.set(x, "model_plot", value.asInstanceOf[js.Any])
    
    inline def setModel_plotUndefined: Self = StObject.set(x, "model_plot", js.undefined)
    
    inline def setModel_snapshot_id(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id): Self = StObject.set(x, "model_snapshot_id", value.asInstanceOf[js.Any])
    
    inline def setModel_snapshot_idUndefined: Self = StObject.set(x, "model_snapshot_id", js.undefined)
    
    inline def setModel_snapshot_retention_days(value: long): Self = StObject.set(x, "model_snapshot_retention_days", value.asInstanceOf[js.Any])
    
    inline def setModel_snapshot_retention_daysUndefined: Self = StObject.set(x, "model_snapshot_retention_days", js.undefined)
    
    inline def setResults_index_name(value: IndexName): Self = StObject.set(x, "results_index_name", value.asInstanceOf[js.Any])
    
    inline def setResults_index_nameUndefined: Self = StObject.set(x, "results_index_name", js.undefined)
  }
}
