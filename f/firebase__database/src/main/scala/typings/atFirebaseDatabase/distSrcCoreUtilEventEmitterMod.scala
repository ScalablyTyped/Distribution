package typings.atFirebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/EventEmitter", JSImport.Namespace)
@js.native
object distSrcCoreUtilEventEmitterMod extends js.Object {
  @js.native
  abstract class EventEmitter protected () extends js.Object {
    /**
      * @param {!Array.<string>} allowedEvents_
      */
    def this(allowedEvents_ : js.Array[String]) = this()
    var allowedEvents_ : js.Any = js.native
    var listeners_ : js.Any = js.native
    var validateEventType_ : js.Any = js.native
    /**
      * To be overridden by derived classes in order to fire an initial event when
      * somebody subscribes for data.
      *
      * @param {!string} eventType
      * @return {Array.<*>} Array of parameters to trigger initial event with.
      */
    def getInitialEvent(eventType: String): js.Array[_] = js.native
    def off(eventType: String, callback: js.Function1[/* a */ js.Any, Unit], context: js.Any): Unit = js.native
    def on(eventType: String, callback: js.Function1[/* a */ js.Any, Unit], context: js.Any): Unit = js.native
    /**
      * To be called by derived classes to trigger events.
      * @param {!string} eventType
      * @param {...*} var_args
      */
    /* protected */ def trigger(eventType: String, var_args: js.Any*): Unit = js.native
  }
  
}

