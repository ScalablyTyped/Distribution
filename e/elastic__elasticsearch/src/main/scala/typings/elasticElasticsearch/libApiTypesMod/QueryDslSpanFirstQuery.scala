package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslSpanFirstQuery
  extends StObject
     with QueryDslQueryBase {
  
  var end: integer
  
  var `match`: QueryDslSpanQuery
}
object QueryDslSpanFirstQuery {
  
  inline def apply(end: integer, `match`: QueryDslSpanQuery): QueryDslSpanFirstQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslSpanFirstQuery]
  }
  
  extension [Self <: QueryDslSpanFirstQuery](x: Self) {
    
    inline def setEnd(value: integer): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: QueryDslSpanQuery): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
