package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlInfoAnomalyDetectors extends StObject {
  
  var categorization_analyzer: MlCategorizationAnalyzer
  
  var categorization_examples_limit: integer
  
  var daily_model_snapshot_retention_after_days: integer
  
  var model_memory_limit: String
  
  var model_snapshot_retention_days: integer
}
object MlInfoAnomalyDetectors {
  
  inline def apply(
    categorization_analyzer: MlCategorizationAnalyzer,
    categorization_examples_limit: integer,
    daily_model_snapshot_retention_after_days: integer,
    model_memory_limit: String,
    model_snapshot_retention_days: integer
  ): MlInfoAnomalyDetectors = {
    val __obj = js.Dynamic.literal(categorization_analyzer = categorization_analyzer.asInstanceOf[js.Any], categorization_examples_limit = categorization_examples_limit.asInstanceOf[js.Any], daily_model_snapshot_retention_after_days = daily_model_snapshot_retention_after_days.asInstanceOf[js.Any], model_memory_limit = model_memory_limit.asInstanceOf[js.Any], model_snapshot_retention_days = model_snapshot_retention_days.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlInfoAnomalyDetectors]
  }
  
  extension [Self <: MlInfoAnomalyDetectors](x: Self) {
    
    inline def setCategorization_analyzer(value: MlCategorizationAnalyzer): Self = StObject.set(x, "categorization_analyzer", value.asInstanceOf[js.Any])
    
    inline def setCategorization_examples_limit(value: integer): Self = StObject.set(x, "categorization_examples_limit", value.asInstanceOf[js.Any])
    
    inline def setDaily_model_snapshot_retention_after_days(value: integer): Self = StObject.set(x, "daily_model_snapshot_retention_after_days", value.asInstanceOf[js.Any])
    
    inline def setModel_memory_limit(value: String): Self = StObject.set(x, "model_memory_limit", value.asInstanceOf[js.Any])
    
    inline def setModel_snapshot_retention_days(value: integer): Self = StObject.set(x, "model_snapshot_retention_days", value.asInstanceOf[js.Any])
  }
}
