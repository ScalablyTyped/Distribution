package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslConstantScoreQuery
  extends StObject
     with QueryDslQueryBase {
  
  var filter: QueryDslQueryContainer
}
object QueryDslConstantScoreQuery {
  
  inline def apply(filter: QueryDslQueryContainer): QueryDslConstantScoreQuery = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslConstantScoreQuery]
  }
  
  extension [Self <: QueryDslConstantScoreQuery](x: Self) {
    
    inline def setFilter(value: QueryDslQueryContainer): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
