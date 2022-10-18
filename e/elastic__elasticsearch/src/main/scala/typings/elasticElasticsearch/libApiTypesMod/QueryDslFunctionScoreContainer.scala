package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslFunctionScoreContainer extends StObject {
  
  var exp: js.UndefOr[QueryDslDecayFunction] = js.undefined
  
  var field_value_factor: js.UndefOr[QueryDslFieldValueFactorScoreFunction] = js.undefined
  
  var filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var gauss: js.UndefOr[QueryDslDecayFunction] = js.undefined
  
  var linear: js.UndefOr[QueryDslDecayFunction] = js.undefined
  
  var random_score: js.UndefOr[QueryDslRandomScoreFunction] = js.undefined
  
  var script_score: js.UndefOr[QueryDslScriptScoreFunction] = js.undefined
  
  var weight: js.UndefOr[double] = js.undefined
}
object QueryDslFunctionScoreContainer {
  
  inline def apply(): QueryDslFunctionScoreContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslFunctionScoreContainer]
  }
  
  extension [Self <: QueryDslFunctionScoreContainer](x: Self) {
    
    inline def setExp(value: QueryDslDecayFunction): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    inline def setField_value_factor(value: QueryDslFieldValueFactorScoreFunction): Self = StObject.set(x, "field_value_factor", value.asInstanceOf[js.Any])
    
    inline def setField_value_factorUndefined: Self = StObject.set(x, "field_value_factor", js.undefined)
    
    inline def setFilter(value: QueryDslQueryContainer): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGauss(value: QueryDslDecayFunction): Self = StObject.set(x, "gauss", value.asInstanceOf[js.Any])
    
    inline def setGaussUndefined: Self = StObject.set(x, "gauss", js.undefined)
    
    inline def setLinear(value: QueryDslDecayFunction): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setLinearUndefined: Self = StObject.set(x, "linear", js.undefined)
    
    inline def setRandom_score(value: QueryDslRandomScoreFunction): Self = StObject.set(x, "random_score", value.asInstanceOf[js.Any])
    
    inline def setRandom_scoreUndefined: Self = StObject.set(x, "random_score", js.undefined)
    
    inline def setScript_score(value: QueryDslScriptScoreFunction): Self = StObject.set(x, "script_score", value.asInstanceOf[js.Any])
    
    inline def setScript_scoreUndefined: Self = StObject.set(x, "script_score", js.undefined)
    
    inline def setWeight(value: double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
