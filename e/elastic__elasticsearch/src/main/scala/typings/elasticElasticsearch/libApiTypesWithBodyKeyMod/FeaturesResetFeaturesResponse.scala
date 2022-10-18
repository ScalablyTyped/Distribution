package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturesResetFeaturesResponse extends StObject {
  
  var features: js.Array[FeaturesFeature]
}
object FeaturesResetFeaturesResponse {
  
  inline def apply(features: js.Array[FeaturesFeature]): FeaturesResetFeaturesResponse = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturesResetFeaturesResponse]
  }
  
  extension [Self <: FeaturesResetFeaturesResponse](x: Self) {
    
    inline def setFeatures(value: js.Array[FeaturesFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: FeaturesFeature*): Self = StObject.set(x, "features", js.Array(value*))
  }
}
