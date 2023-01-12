package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturesGetFeaturesResponse extends StObject {
  
  var features: js.Array[FeaturesFeature]
}
object FeaturesGetFeaturesResponse {
  
  inline def apply(features: js.Array[FeaturesFeature]): FeaturesGetFeaturesResponse = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturesGetFeaturesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturesGetFeaturesResponse] (val x: Self) extends AnyVal {
    
    inline def setFeatures(value: js.Array[FeaturesFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: FeaturesFeature*): Self = StObject.set(x, "features", js.Array(value*))
  }
}
