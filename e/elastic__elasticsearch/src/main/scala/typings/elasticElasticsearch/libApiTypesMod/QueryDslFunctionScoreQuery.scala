package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslFunctionScoreQuery
  extends StObject
     with QueryDslQueryBase {
  
  var boost_mode: js.UndefOr[QueryDslFunctionBoostMode] = js.undefined
  
  var functions: js.UndefOr[js.Array[QueryDslFunctionScoreContainer]] = js.undefined
  
  var max_boost: js.UndefOr[double] = js.undefined
  
  var min_score: js.UndefOr[double] = js.undefined
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var score_mode: js.UndefOr[QueryDslFunctionScoreMode] = js.undefined
}
object QueryDslFunctionScoreQuery {
  
  inline def apply(): QueryDslFunctionScoreQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslFunctionScoreQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslFunctionScoreQuery] (val x: Self) extends AnyVal {
    
    inline def setBoost_mode(value: QueryDslFunctionBoostMode): Self = StObject.set(x, "boost_mode", value.asInstanceOf[js.Any])
    
    inline def setBoost_modeUndefined: Self = StObject.set(x, "boost_mode", js.undefined)
    
    inline def setFunctions(value: js.Array[QueryDslFunctionScoreContainer]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setFunctionsVarargs(value: QueryDslFunctionScoreContainer*): Self = StObject.set(x, "functions", js.Array(value*))
    
    inline def setMax_boost(value: double): Self = StObject.set(x, "max_boost", value.asInstanceOf[js.Any])
    
    inline def setMax_boostUndefined: Self = StObject.set(x, "max_boost", js.undefined)
    
    inline def setMin_score(value: double): Self = StObject.set(x, "min_score", value.asInstanceOf[js.Any])
    
    inline def setMin_scoreUndefined: Self = StObject.set(x, "min_score", js.undefined)
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setScore_mode(value: QueryDslFunctionScoreMode): Self = StObject.set(x, "score_mode", value.asInstanceOf[js.Any])
    
    inline def setScore_modeUndefined: Self = StObject.set(x, "score_mode", js.undefined)
  }
}
