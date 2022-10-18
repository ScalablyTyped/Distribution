package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalRankEvalQuery extends StObject {
  
  var query: QueryDslQueryContainer
  
  var size: js.UndefOr[integer] = js.undefined
}
object RankEvalRankEvalQuery {
  
  inline def apply(query: QueryDslQueryContainer): RankEvalRankEvalQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankEvalRankEvalQuery]
  }
  
  extension [Self <: RankEvalRankEvalQuery](x: Self) {
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
