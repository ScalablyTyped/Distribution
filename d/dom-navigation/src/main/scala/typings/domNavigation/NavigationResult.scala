package typings.domNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationResult extends StObject {
  
  var committed: js.Promise[NavigationHistoryEntry]
  
  var finished: js.Promise[NavigationHistoryEntry]
}
object NavigationResult {
  
  inline def apply(committed: js.Promise[NavigationHistoryEntry], finished: js.Promise[NavigationHistoryEntry]): NavigationResult = {
    val __obj = js.Dynamic.literal(committed = committed.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationResult] (val x: Self) extends AnyVal {
    
    inline def setCommitted(value: js.Promise[NavigationHistoryEntry]): Self = StObject.set(x, "committed", value.asInstanceOf[js.Any])
    
    inline def setFinished(value: js.Promise[NavigationHistoryEntry]): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
  }
}
