package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherExecutionThreadPool extends StObject {
  
  var max_size: long
  
  var queue_size: long
}
object WatcherExecutionThreadPool {
  
  inline def apply(max_size: long, queue_size: long): WatcherExecutionThreadPool = {
    val __obj = js.Dynamic.literal(max_size = max_size.asInstanceOf[js.Any], queue_size = queue_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherExecutionThreadPool]
  }
  
  extension [Self <: WatcherExecutionThreadPool](x: Self) {
    
    inline def setMax_size(value: long): Self = StObject.set(x, "max_size", value.asInstanceOf[js.Any])
    
    inline def setQueue_size(value: long): Self = StObject.set(x, "queue_size", value.asInstanceOf[js.Any])
  }
}
