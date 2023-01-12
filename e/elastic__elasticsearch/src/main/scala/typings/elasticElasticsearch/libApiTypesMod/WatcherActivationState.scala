package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherActivationState extends StObject {
  
  var active: Boolean
  
  var timestamp: DateTime
}
object WatcherActivationState {
  
  inline def apply(active: Boolean, timestamp: DateTime): WatcherActivationState = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherActivationState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherActivationState] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: DateTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
