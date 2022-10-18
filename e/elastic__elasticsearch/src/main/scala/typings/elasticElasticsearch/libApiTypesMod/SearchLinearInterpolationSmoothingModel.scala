package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchLinearInterpolationSmoothingModel extends StObject {
  
  var bigram_lambda: double
  
  var trigram_lambda: double
  
  var unigram_lambda: double
}
object SearchLinearInterpolationSmoothingModel {
  
  inline def apply(bigram_lambda: double, trigram_lambda: double, unigram_lambda: double): SearchLinearInterpolationSmoothingModel = {
    val __obj = js.Dynamic.literal(bigram_lambda = bigram_lambda.asInstanceOf[js.Any], trigram_lambda = trigram_lambda.asInstanceOf[js.Any], unigram_lambda = unigram_lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLinearInterpolationSmoothingModel]
  }
  
  extension [Self <: SearchLinearInterpolationSmoothingModel](x: Self) {
    
    inline def setBigram_lambda(value: double): Self = StObject.set(x, "bigram_lambda", value.asInstanceOf[js.Any])
    
    inline def setTrigram_lambda(value: double): Self = StObject.set(x, "trigram_lambda", value.asInstanceOf[js.Any])
    
    inline def setUnigram_lambda(value: double): Self = StObject.set(x, "unigram_lambda", value.asInstanceOf[js.Any])
  }
}
