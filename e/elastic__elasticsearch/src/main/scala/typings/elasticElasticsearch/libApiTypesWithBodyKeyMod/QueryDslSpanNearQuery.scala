package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslSpanNearQuery
  extends StObject
     with QueryDslQueryBase {
  
  var clauses: js.Array[QueryDslSpanQuery]
  
  var in_order: js.UndefOr[Boolean] = js.undefined
  
  var slop: js.UndefOr[integer] = js.undefined
}
object QueryDslSpanNearQuery {
  
  inline def apply(clauses: js.Array[QueryDslSpanQuery]): QueryDslSpanNearQuery = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslSpanNearQuery]
  }
  
  extension [Self <: QueryDslSpanNearQuery](x: Self) {
    
    inline def setClauses(value: js.Array[QueryDslSpanQuery]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    inline def setClausesVarargs(value: QueryDslSpanQuery*): Self = StObject.set(x, "clauses", js.Array(value*))
    
    inline def setIn_order(value: Boolean): Self = StObject.set(x, "in_order", value.asInstanceOf[js.Any])
    
    inline def setIn_orderUndefined: Self = StObject.set(x, "in_order", js.undefined)
    
    inline def setSlop(value: integer): Self = StObject.set(x, "slop", value.asInstanceOf[js.Any])
    
    inline def setSlopUndefined: Self = StObject.set(x, "slop", js.undefined)
  }
}
