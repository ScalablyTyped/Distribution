package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslRankFeatureQuery
  extends StObject
     with QueryDslQueryBase {
  
  var field: Field
  
  var linear: js.UndefOr[QueryDslRankFeatureFunctionLinear] = js.undefined
  
  var log: js.UndefOr[QueryDslRankFeatureFunctionLogarithm] = js.undefined
  
  var saturation: js.UndefOr[QueryDslRankFeatureFunctionSaturation] = js.undefined
  
  var sigmoid: js.UndefOr[QueryDslRankFeatureFunctionSigmoid] = js.undefined
}
object QueryDslRankFeatureQuery {
  
  inline def apply(field: Field): QueryDslRankFeatureQuery = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslRankFeatureQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslRankFeatureQuery] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: QueryDslRankFeatureFunctionLinear): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setLinearUndefined: Self = StObject.set(x, "linear", js.undefined)
    
    inline def setLog(value: QueryDslRankFeatureFunctionLogarithm): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setSaturation(value: QueryDslRankFeatureFunctionSaturation): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    
    inline def setSigmoid(value: QueryDslRankFeatureFunctionSigmoid): Self = StObject.set(x, "sigmoid", value.asInstanceOf[js.Any])
    
    inline def setSigmoidUndefined: Self = StObject.set(x, "sigmoid", js.undefined)
  }
}
