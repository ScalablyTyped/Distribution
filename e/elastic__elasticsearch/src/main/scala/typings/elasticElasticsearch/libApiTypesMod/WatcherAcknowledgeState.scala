package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherAcknowledgeState extends StObject {
  
  var state: WatcherAcknowledgementOptions
  
  var timestamp: DateTime
}
object WatcherAcknowledgeState {
  
  inline def apply(state: WatcherAcknowledgementOptions, timestamp: DateTime): WatcherAcknowledgeState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherAcknowledgeState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherAcknowledgeState] (val x: Self) extends AnyVal {
    
    inline def setState(value: WatcherAcknowledgementOptions): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: DateTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
