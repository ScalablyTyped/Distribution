package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageWatcherActions extends StObject {
  
  var actions: Record[Name, XpackUsageWatcherActionTotals]
}
object XpackUsageWatcherActions {
  
  inline def apply(actions: Record[Name, XpackUsageWatcherActionTotals]): XpackUsageWatcherActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageWatcherActions]
  }
  
  extension [Self <: XpackUsageWatcherActions](x: Self) {
    
    inline def setActions(value: Record[Name, XpackUsageWatcherActionTotals]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
  }
}
