package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherWatchStatus extends StObject {
  
  var actions: WatcherActions
  
  var execution_state: js.UndefOr[String] = js.undefined
  
  var last_checked: js.UndefOr[DateTime] = js.undefined
  
  var last_met_condition: js.UndefOr[DateTime] = js.undefined
  
  var state: WatcherActivationState
  
  var version: VersionNumber
}
object WatcherWatchStatus {
  
  inline def apply(actions: WatcherActions, state: WatcherActivationState, version: VersionNumber): WatcherWatchStatus = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherWatchStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherWatchStatus] (val x: Self) extends AnyVal {
    
    inline def setActions(value: WatcherActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setExecution_state(value: String): Self = StObject.set(x, "execution_state", value.asInstanceOf[js.Any])
    
    inline def setExecution_stateUndefined: Self = StObject.set(x, "execution_state", js.undefined)
    
    inline def setLast_checked(value: DateTime): Self = StObject.set(x, "last_checked", value.asInstanceOf[js.Any])
    
    inline def setLast_checkedUndefined: Self = StObject.set(x, "last_checked", js.undefined)
    
    inline def setLast_met_condition(value: DateTime): Self = StObject.set(x, "last_met_condition", value.asInstanceOf[js.Any])
    
    inline def setLast_met_conditionUndefined: Self = StObject.set(x, "last_met_condition", js.undefined)
    
    inline def setState(value: WatcherActivationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
