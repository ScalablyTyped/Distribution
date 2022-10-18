package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherSimulatedActions extends StObject {
  
  var actions: js.Array[String]
  
  var all: WatcherSimulatedActions
  
  var use_all: Boolean
}
object WatcherSimulatedActions {
  
  inline def apply(actions: js.Array[String], all: WatcherSimulatedActions, use_all: Boolean): WatcherSimulatedActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], use_all = use_all.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherSimulatedActions]
  }
  
  extension [Self <: WatcherSimulatedActions](x: Self) {
    
    inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setAll(value: WatcherSimulatedActions): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setUse_all(value: Boolean): Self = StObject.set(x, "use_all", value.asInstanceOf[js.Any])
  }
}
