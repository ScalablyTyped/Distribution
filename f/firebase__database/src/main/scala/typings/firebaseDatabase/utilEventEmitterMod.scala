package typings.firebaseDatabase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilEventEmitterMod {
  
  @JSImport("@firebase/database/dist/src/core/util/EventEmitter", "EventEmitter")
  @js.native
  abstract class EventEmitter protected () extends StObject {
    def this(allowedEvents_ : js.Array[String]) = this()
    
    /* private */ var allowedEvents_ : Any = js.native
    
    /**
      * To be overridden by derived classes in order to fire an initial event when
      * somebody subscribes for data.
      *
      * @returns {Array.<*>} Array of parameters to trigger initial event with.
      */
    def getInitialEvent(eventType: String): js.Array[Any] = js.native
    
    /* private */ var listeners_ : Any = js.native
    
    def off(eventType: String, callback: js.Function1[/* a */ Any, Unit], context: Any): Unit = js.native
    
    def on(eventType: String, callback: js.Function1[/* a */ Any, Unit], context: Any): Unit = js.native
    
    /**
      * To be called by derived classes to trigger events.
      */
    /* protected */ def trigger(eventType: String, varArgs: Any*): Unit = js.native
    
    /* private */ var validateEventType_ : Any = js.native
  }
}
