package typings.domNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationTransition extends StObject {
  
  val finished: js.Promise[Unit]
  
  val from: NavigationHistoryEntry
  
  val navigationType: NavigationTypeString
}
object NavigationTransition {
  
  inline def apply(finished: js.Promise[Unit], from: NavigationHistoryEntry, navigationType: NavigationTypeString): NavigationTransition = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], navigationType = navigationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationTransition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationTransition] (val x: Self) extends AnyVal {
    
    inline def setFinished(value: js.Promise[Unit]): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: NavigationHistoryEntry): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setNavigationType(value: NavigationTypeString): Self = StObject.set(x, "navigationType", value.asInstanceOf[js.Any])
  }
}
