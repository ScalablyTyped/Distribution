package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslSpanOrQuery
  extends StObject
     with QueryDslQueryBase {
  
  var clauses: js.Array[QueryDslSpanQuery]
}
object QueryDslSpanOrQuery {
  
  inline def apply(clauses: js.Array[QueryDslSpanQuery]): QueryDslSpanOrQuery = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslSpanOrQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslSpanOrQuery] (val x: Self) extends AnyVal {
    
    inline def setClauses(value: js.Array[QueryDslSpanQuery]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    inline def setClausesVarargs(value: QueryDslSpanQuery*): Self = StObject.set(x, "clauses", js.Array(value*))
  }
}
