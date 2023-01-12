package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslScriptScoreQuery
  extends StObject
     with QueryDslQueryBase {
  
  var min_score: js.UndefOr[float] = js.undefined
  
  var query: QueryDslQueryContainer
  
  var script: Script
}
object QueryDslScriptScoreQuery {
  
  inline def apply(query: QueryDslQueryContainer, script: Script): QueryDslScriptScoreQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslScriptScoreQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslScriptScoreQuery] (val x: Self) extends AnyVal {
    
    inline def setMin_score(value: float): Self = StObject.set(x, "min_score", value.asInstanceOf[js.Any])
    
    inline def setMin_scoreUndefined: Self = StObject.set(x, "min_score", js.undefined)
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
