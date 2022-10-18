package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlOutlierDetectionParameters extends StObject {
  
  var compute_feature_influence: js.UndefOr[Boolean] = js.undefined
  
  var feature_influence_threshold: js.UndefOr[double] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var n_neighbors: js.UndefOr[integer] = js.undefined
  
  var outlier_fraction: js.UndefOr[double] = js.undefined
  
  var standardization_enabled: js.UndefOr[Boolean] = js.undefined
}
object MlOutlierDetectionParameters {
  
  inline def apply(): MlOutlierDetectionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlOutlierDetectionParameters]
  }
  
  extension [Self <: MlOutlierDetectionParameters](x: Self) {
    
    inline def setCompute_feature_influence(value: Boolean): Self = StObject.set(x, "compute_feature_influence", value.asInstanceOf[js.Any])
    
    inline def setCompute_feature_influenceUndefined: Self = StObject.set(x, "compute_feature_influence", js.undefined)
    
    inline def setFeature_influence_threshold(value: double): Self = StObject.set(x, "feature_influence_threshold", value.asInstanceOf[js.Any])
    
    inline def setFeature_influence_thresholdUndefined: Self = StObject.set(x, "feature_influence_threshold", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setN_neighbors(value: integer): Self = StObject.set(x, "n_neighbors", value.asInstanceOf[js.Any])
    
    inline def setN_neighborsUndefined: Self = StObject.set(x, "n_neighbors", js.undefined)
    
    inline def setOutlier_fraction(value: double): Self = StObject.set(x, "outlier_fraction", value.asInstanceOf[js.Any])
    
    inline def setOutlier_fractionUndefined: Self = StObject.set(x, "outlier_fraction", js.undefined)
    
    inline def setStandardization_enabled(value: Boolean): Self = StObject.set(x, "standardization_enabled", value.asInstanceOf[js.Any])
    
    inline def setStandardization_enabledUndefined: Self = StObject.set(x, "standardization_enabled", js.undefined)
  }
}
