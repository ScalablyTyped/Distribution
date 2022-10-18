package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalysis extends StObject {
  
  var alpha: js.UndefOr[double] = js.undefined
  
  var dependent_variable: String
  
  var downsample_factor: js.UndefOr[double] = js.undefined
  
  var early_stopping_enabled: js.UndefOr[Boolean] = js.undefined
  
  var eta: js.UndefOr[double] = js.undefined
  
  var eta_growth_rate_per_tree: js.UndefOr[double] = js.undefined
  
  var feature_bag_fraction: js.UndefOr[double] = js.undefined
  
  var feature_processors: js.UndefOr[js.Array[MlDataframeAnalysisFeatureProcessor]] = js.undefined
  
  var gamma: js.UndefOr[double] = js.undefined
  
  var lambda: js.UndefOr[double] = js.undefined
  
  var max_optimization_rounds_per_hyperparameter: js.UndefOr[integer] = js.undefined
  
  var max_trees: js.UndefOr[integer] = js.undefined
  
  var maximum_number_trees: js.UndefOr[integer] = js.undefined
  
  var num_top_feature_importance_values: js.UndefOr[integer] = js.undefined
  
  var prediction_field_name: js.UndefOr[Field] = js.undefined
  
  var randomize_seed: js.UndefOr[double] = js.undefined
  
  var soft_tree_depth_limit: js.UndefOr[integer] = js.undefined
  
  var soft_tree_depth_tolerance: js.UndefOr[double] = js.undefined
  
  var training_percent: js.UndefOr[Percentage] = js.undefined
}
object MlDataframeAnalysis {
  
  inline def apply(dependent_variable: String): MlDataframeAnalysis = {
    val __obj = js.Dynamic.literal(dependent_variable = dependent_variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalysis]
  }
  
  extension [Self <: MlDataframeAnalysis](x: Self) {
    
    inline def setAlpha(value: double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setDependent_variable(value: String): Self = StObject.set(x, "dependent_variable", value.asInstanceOf[js.Any])
    
    inline def setDownsample_factor(value: double): Self = StObject.set(x, "downsample_factor", value.asInstanceOf[js.Any])
    
    inline def setDownsample_factorUndefined: Self = StObject.set(x, "downsample_factor", js.undefined)
    
    inline def setEarly_stopping_enabled(value: Boolean): Self = StObject.set(x, "early_stopping_enabled", value.asInstanceOf[js.Any])
    
    inline def setEarly_stopping_enabledUndefined: Self = StObject.set(x, "early_stopping_enabled", js.undefined)
    
    inline def setEta(value: double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
    
    inline def setEtaUndefined: Self = StObject.set(x, "eta", js.undefined)
    
    inline def setEta_growth_rate_per_tree(value: double): Self = StObject.set(x, "eta_growth_rate_per_tree", value.asInstanceOf[js.Any])
    
    inline def setEta_growth_rate_per_treeUndefined: Self = StObject.set(x, "eta_growth_rate_per_tree", js.undefined)
    
    inline def setFeature_bag_fraction(value: double): Self = StObject.set(x, "feature_bag_fraction", value.asInstanceOf[js.Any])
    
    inline def setFeature_bag_fractionUndefined: Self = StObject.set(x, "feature_bag_fraction", js.undefined)
    
    inline def setFeature_processors(value: js.Array[MlDataframeAnalysisFeatureProcessor]): Self = StObject.set(x, "feature_processors", value.asInstanceOf[js.Any])
    
    inline def setFeature_processorsUndefined: Self = StObject.set(x, "feature_processors", js.undefined)
    
    inline def setFeature_processorsVarargs(value: MlDataframeAnalysisFeatureProcessor*): Self = StObject.set(x, "feature_processors", js.Array(value*))
    
    inline def setGamma(value: double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
    
    inline def setLambda(value: double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    inline def setMax_optimization_rounds_per_hyperparameter(value: integer): Self = StObject.set(x, "max_optimization_rounds_per_hyperparameter", value.asInstanceOf[js.Any])
    
    inline def setMax_optimization_rounds_per_hyperparameterUndefined: Self = StObject.set(x, "max_optimization_rounds_per_hyperparameter", js.undefined)
    
    inline def setMax_trees(value: integer): Self = StObject.set(x, "max_trees", value.asInstanceOf[js.Any])
    
    inline def setMax_treesUndefined: Self = StObject.set(x, "max_trees", js.undefined)
    
    inline def setMaximum_number_trees(value: integer): Self = StObject.set(x, "maximum_number_trees", value.asInstanceOf[js.Any])
    
    inline def setMaximum_number_treesUndefined: Self = StObject.set(x, "maximum_number_trees", js.undefined)
    
    inline def setNum_top_feature_importance_values(value: integer): Self = StObject.set(x, "num_top_feature_importance_values", value.asInstanceOf[js.Any])
    
    inline def setNum_top_feature_importance_valuesUndefined: Self = StObject.set(x, "num_top_feature_importance_values", js.undefined)
    
    inline def setPrediction_field_name(value: Field): Self = StObject.set(x, "prediction_field_name", value.asInstanceOf[js.Any])
    
    inline def setPrediction_field_nameUndefined: Self = StObject.set(x, "prediction_field_name", js.undefined)
    
    inline def setRandomize_seed(value: double): Self = StObject.set(x, "randomize_seed", value.asInstanceOf[js.Any])
    
    inline def setRandomize_seedUndefined: Self = StObject.set(x, "randomize_seed", js.undefined)
    
    inline def setSoft_tree_depth_limit(value: integer): Self = StObject.set(x, "soft_tree_depth_limit", value.asInstanceOf[js.Any])
    
    inline def setSoft_tree_depth_limitUndefined: Self = StObject.set(x, "soft_tree_depth_limit", js.undefined)
    
    inline def setSoft_tree_depth_tolerance(value: double): Self = StObject.set(x, "soft_tree_depth_tolerance", value.asInstanceOf[js.Any])
    
    inline def setSoft_tree_depth_toleranceUndefined: Self = StObject.set(x, "soft_tree_depth_tolerance", js.undefined)
    
    inline def setTraining_percent(value: Percentage): Self = StObject.set(x, "training_percent", value.asInstanceOf[js.Any])
    
    inline def setTraining_percentUndefined: Self = StObject.set(x, "training_percent", js.undefined)
  }
}
