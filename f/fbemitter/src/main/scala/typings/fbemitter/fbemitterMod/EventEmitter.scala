package typings.fbemitter.fbemitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fbemitter", "EventEmitter")
@js.native
class EventEmitter () extends js.Object {
  /**
    * Adds a listener to be invoked when events of the specified type are
    * emitted. An optional calling context may be provided. The data arguments
    * emitted will be passed to the listener function.
    */
  def addListener(eventType: String, listener: js.Function): EventSubscription = js.native
  def addListener(eventType: String, listener: js.Function, context: js.Any): EventSubscription = js.native
  /**
    * Emits an event of the given type with the given data. All handlers of that
    * particular type will be notified.
    */
  def emit(eventType: String, data: js.Any*): Unit = js.native
  /**
    * Returns an array of listeners that are currently registered for the given
    * event.
    */
  def listeners(eventType: String): js.Array[js.Function] = js.native
  /**
    * Similar to addListener, except that the listener is removed after it is
    * invoked once.
    */
  def once(eventType: String, listener: js.Function): EventSubscription = js.native
  def once(eventType: String, listener: js.Function, context: js.Any): EventSubscription = js.native
  /**
    * Removes all of the registered listeners, including those registered as
    * listener maps.
    */
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(eventType: String): Unit = js.native
  /**
    * Provides an API that can be called during an eventing cycle to remove the
    * last listener that was invoked. This allows a developer to provide an event
    * object that can remove the listener (or listener map) during the
    * invocation.
    *
    * If it is called when not inside of an emitting cycle it will throw.
    */
  def removeCurrentListener(): Unit = js.native
}

