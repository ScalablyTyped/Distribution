package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherQueryWatchesResponse extends StObject {
  
  var count: integer
  
  var watches: js.Array[WatcherQueryWatch]
}
object WatcherQueryWatchesResponse {
  
  inline def apply(count: integer, watches: js.Array[WatcherQueryWatch]): WatcherQueryWatchesResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], watches = watches.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherQueryWatchesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherQueryWatchesResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setWatches(value: js.Array[WatcherQueryWatch]): Self = StObject.set(x, "watches", value.asInstanceOf[js.Any])
    
    inline def setWatchesVarargs(value: WatcherQueryWatch*): Self = StObject.set(x, "watches", js.Array(value*))
  }
}
