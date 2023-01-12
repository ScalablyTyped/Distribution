package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRescore extends StObject {
  
  var query: SearchRescoreQuery
  
  var window_size: js.UndefOr[integer] = js.undefined
}
object SearchRescore {
  
  inline def apply(query: SearchRescoreQuery): SearchRescore = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRescore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchRescore] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: SearchRescoreQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setWindow_size(value: integer): Self = StObject.set(x, "window_size", value.asInstanceOf[js.Any])
    
    inline def setWindow_sizeUndefined: Self = StObject.set(x, "window_size", js.undefined)
  }
}
