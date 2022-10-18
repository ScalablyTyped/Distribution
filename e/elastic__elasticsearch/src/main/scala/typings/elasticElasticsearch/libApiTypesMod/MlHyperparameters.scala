package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlHyperparameters extends StObject {
  
  var alpha: js.UndefOr[double] = js.undefined
  
  var downsample_factor: js.UndefOr[double] = js.undefined
  
  var eta: js.UndefOr[double] = js.undefined
  
  var eta_growth_rate_per_tree: js.UndefOr[double] = js.undefined
  
  var feature_bag_fraction: js.UndefOr[double] = js.undefined
  
  var gamma: js.UndefOr[double] = js.undefined
  
  var lambda: js.UndefOr[double] = js.undefined
  
  var max_attempts_to_add_tree: js.UndefOr[integer] = js.undefined
  
  var max_optimization_rounds_per_hyperparameter: js.UndefOr[integer] = js.undefined
  
  var max_trees: js.UndefOr[integer] = js.undefined
  
  var num_folds: js.UndefOr[integer] = js.undefined
  
  var num_splits_per_feature: js.UndefOr[integer] = js.undefined
  
  var soft_tree_depth_limit: js.UndefOr[integer] = js.undefined
  
  var soft_tree_depth_tolerance: js.UndefOr[double] = js.undefined
}
object MlHyperparameters {
  
  inline def apply(): MlHyperparameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlHyperparameters]
  }
  
  extension [Self <: MlHyperparameters](x: Self) {
    
    inline def setAlpha(value: double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setDownsample_factor(value: double): Self = StObject.set(x, "downsample_factor", value.asInstanceOf[js.Any])
    
    inline def setDownsample_factorUndefined: Self = StObject.set(x, "downsample_factor", js.undefined)
    
    inline def setEta(value: double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
    
    inline def setEtaUndefined: Self = StObject.set(x, "eta", js.undefined)
    
    inline def setEta_growth_rate_per_tree(value: double): Self = StObject.set(x, "eta_growth_rate_per_tree", value.asInstanceOf[js.Any])
    
    inline def setEta_growth_rate_per_treeUndefined: Self = StObject.set(x, "eta_growth_rate_per_tree", js.undefined)
    
    inline def setFeature_bag_fraction(value: double): Self = StObject.set(x, "feature_bag_fraction", value.asInstanceOf[js.Any])
    
    inline def setFeature_bag_fractionUndefined: Self = StObject.set(x, "feature_bag_fraction", js.undefined)
    
    inline def setGamma(value: double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
    
    inline def setLambda(value: double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    inline def setMax_attempts_to_add_tree(value: integer): Self = StObject.set(x, "max_attempts_to_add_tree", value.asInstanceOf[js.Any])
    
    inline def setMax_attempts_to_add_treeUndefined: Self = StObject.set(x, "max_attempts_to_add_tree", js.undefined)
    
    inline def setMax_optimization_rounds_per_hyperparameter(value: integer): Self = StObject.set(x, "max_optimization_rounds_per_hyperparameter", value.asInstanceOf[js.Any])
    
    inline def setMax_optimization_rounds_per_hyperparameterUndefined: Self = StObject.set(x, "max_optimization_rounds_per_hyperparameter", js.undefined)
    
    inline def setMax_trees(value: integer): Self = StObject.set(x, "max_trees", value.asInstanceOf[js.Any])
    
    inline def setMax_treesUndefined: Self = StObject.set(x, "max_trees", js.undefined)
    
    inline def setNum_folds(value: integer): Self = StObject.set(x, "num_folds", value.asInstanceOf[js.Any])
    
    inline def setNum_foldsUndefined: Self = StObject.set(x, "num_folds", js.undefined)
    
    inline def setNum_splits_per_feature(value: integer): Self = StObject.set(x, "num_splits_per_feature", value.asInstanceOf[js.Any])
    
    inline def setNum_splits_per_featureUndefined: Self = StObject.set(x, "num_splits_per_feature", js.undefined)
    
    inline def setSoft_tree_depth_limit(value: integer): Self = StObject.set(x, "soft_tree_depth_limit", value.asInstanceOf[js.Any])
    
    inline def setSoft_tree_depth_limitUndefined: Self = StObject.set(x, "soft_tree_depth_limit", js.undefined)
    
    inline def setSoft_tree_depth_tolerance(value: double): Self = StObject.set(x, "soft_tree_depth_tolerance", value.asInstanceOf[js.Any])
    
    inline def setSoft_tree_depth_toleranceUndefined: Self = StObject.set(x, "soft_tree_depth_tolerance", js.undefined)
  }
}
