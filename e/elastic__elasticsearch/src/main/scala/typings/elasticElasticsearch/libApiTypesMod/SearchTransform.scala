package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTransform extends StObject {
  
  var request: WatcherSearchInputRequestDefinition
  
  var timeout: Duration
}
object SearchTransform {
  
  inline def apply(request: WatcherSearchInputRequestDefinition, timeout: Duration): SearchTransform = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTransform]
  }
  
  extension [Self <: SearchTransform](x: Self) {
    
    inline def setRequest(value: WatcherSearchInputRequestDefinition): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
