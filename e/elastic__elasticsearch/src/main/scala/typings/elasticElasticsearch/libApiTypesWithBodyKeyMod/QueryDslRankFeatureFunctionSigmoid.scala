package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslRankFeatureFunctionSigmoid extends StObject {
  
  var exponent: float
  
  var pivot: float
}
object QueryDslRankFeatureFunctionSigmoid {
  
  inline def apply(exponent: float, pivot: float): QueryDslRankFeatureFunctionSigmoid = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], pivot = pivot.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslRankFeatureFunctionSigmoid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslRankFeatureFunctionSigmoid] (val x: Self) extends AnyVal {
    
    inline def setExponent(value: float): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    inline def setPivot(value: float): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
  }
}
