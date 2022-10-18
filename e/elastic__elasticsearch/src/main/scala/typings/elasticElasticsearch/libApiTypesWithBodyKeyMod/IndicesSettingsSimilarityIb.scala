package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.IB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSettingsSimilarityIb extends StObject {
  
  var distribution: IBDistribution
  
  var lambda: IBLambda
  
  var normalization: Normalization
  
  var `type`: IB
}
object IndicesSettingsSimilarityIb {
  
  inline def apply(distribution: IBDistribution, lambda: IBLambda, normalization: Normalization): IndicesSettingsSimilarityIb = {
    val __obj = js.Dynamic.literal(distribution = distribution.asInstanceOf[js.Any], lambda = lambda.asInstanceOf[js.Any], normalization = normalization.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IB")
    __obj.asInstanceOf[IndicesSettingsSimilarityIb]
  }
  
  extension [Self <: IndicesSettingsSimilarityIb](x: Self) {
    
    inline def setDistribution(value: IBDistribution): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setLambda(value: IBLambda): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setNormalization(value: Normalization): Self = StObject.set(x, "normalization", value.asInstanceOf[js.Any])
    
    inline def setType(value: IB): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
