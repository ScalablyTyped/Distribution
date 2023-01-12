package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslSpanFieldMaskingQuery
  extends StObject
     with QueryDslQueryBase {
  
  var field: Field
  
  var query: QueryDslSpanQuery
}
object QueryDslSpanFieldMaskingQuery {
  
  inline def apply(field: Field, query: QueryDslSpanQuery): QueryDslSpanFieldMaskingQuery = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslSpanFieldMaskingQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslSpanFieldMaskingQuery] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: QueryDslSpanQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
