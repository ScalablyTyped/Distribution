package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherActivationStatus extends StObject {
  
  var actions: WatcherActions
  
  var state: WatcherActivationState
  
  var version: VersionNumber
}
object WatcherActivationStatus {
  
  inline def apply(actions: WatcherActions, state: WatcherActivationState, version: VersionNumber): WatcherActivationStatus = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherActivationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherActivationStatus] (val x: Self) extends AnyVal {
    
    inline def setActions(value: WatcherActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setState(value: WatcherActivationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
