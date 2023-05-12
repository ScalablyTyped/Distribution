package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EventManager is responsible for mapping queries to query event emitters.
  * It handles "fan-out". -- Identical queries will re-use the same watch on the
  * backend.
  *
  * PORTING NOTE: On Web, EventManager `onListen` and `onUnlisten` need to be
  * assigned to SyncEngine's `listen()` and `unlisten()` API before usage. This
  * allows users to tree-shake the Watch logic.
  */
trait EventManager extends StObject {
  
  var onListen: js.UndefOr[js.Function1[/* query */ Query2, js.Promise[ViewSnapshot]]] = js.undefined
  
  var onUnlisten: js.UndefOr[js.Function1[/* query */ Query2, js.Promise[Unit]]] = js.undefined
}
object EventManager {
  
  inline def apply(): EventManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventManager] (val x: Self) extends AnyVal {
    
    inline def setOnListen(value: /* query */ Query2 => js.Promise[ViewSnapshot]): Self = StObject.set(x, "onListen", js.Any.fromFunction1(value))
    
    inline def setOnListenUndefined: Self = StObject.set(x, "onListen", js.undefined)
    
    inline def setOnUnlisten(value: /* query */ Query2 => js.Promise[Unit]): Self = StObject.set(x, "onUnlisten", js.Any.fromFunction1(value))
    
    inline def setOnUnlistenUndefined: Self = StObject.set(x, "onUnlisten", js.undefined)
  }
}
