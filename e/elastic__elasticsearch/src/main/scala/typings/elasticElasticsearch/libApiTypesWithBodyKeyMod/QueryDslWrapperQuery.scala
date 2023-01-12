package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslWrapperQuery
  extends StObject
     with QueryDslQueryBase {
  
  var query: String
}
object QueryDslWrapperQuery {
  
  inline def apply(query: String): QueryDslWrapperQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslWrapperQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslWrapperQuery] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
