package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslDisMaxQuery
  extends StObject
     with QueryDslQueryBase {
  
  var queries: js.Array[QueryDslQueryContainer]
  
  var tie_breaker: js.UndefOr[double] = js.undefined
}
object QueryDslDisMaxQuery {
  
  inline def apply(queries: js.Array[QueryDslQueryContainer]): QueryDslDisMaxQuery = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslDisMaxQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslDisMaxQuery] (val x: Self) extends AnyVal {
    
    inline def setQueries(value: js.Array[QueryDslQueryContainer]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesVarargs(value: QueryDslQueryContainer*): Self = StObject.set(x, "queries", js.Array(value*))
    
    inline def setTie_breaker(value: double): Self = StObject.set(x, "tie_breaker", value.asInstanceOf[js.Any])
    
    inline def setTie_breakerUndefined: Self = StObject.set(x, "tie_breaker", js.undefined)
  }
}
