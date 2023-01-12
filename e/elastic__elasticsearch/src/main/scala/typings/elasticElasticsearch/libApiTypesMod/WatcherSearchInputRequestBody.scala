package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherSearchInputRequestBody extends StObject {
  
  var query: QueryDslQueryContainer
}
object WatcherSearchInputRequestBody {
  
  inline def apply(query: QueryDslQueryContainer): WatcherSearchInputRequestBody = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherSearchInputRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherSearchInputRequestBody] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
