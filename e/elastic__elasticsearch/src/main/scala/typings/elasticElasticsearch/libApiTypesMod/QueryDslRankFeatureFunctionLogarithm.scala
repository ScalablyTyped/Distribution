package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslRankFeatureFunctionLogarithm extends StObject {
  
  var scaling_factor: float
}
object QueryDslRankFeatureFunctionLogarithm {
  
  inline def apply(scaling_factor: float): QueryDslRankFeatureFunctionLogarithm = {
    val __obj = js.Dynamic.literal(scaling_factor = scaling_factor.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslRankFeatureFunctionLogarithm]
  }
  
  extension [Self <: QueryDslRankFeatureFunctionLogarithm](x: Self) {
    
    inline def setScaling_factor(value: float): Self = StObject.set(x, "scaling_factor", value.asInstanceOf[js.Any])
  }
}
