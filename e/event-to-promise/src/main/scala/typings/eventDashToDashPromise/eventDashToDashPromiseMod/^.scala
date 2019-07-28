package typings.eventDashToDashPromise.eventDashToDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-to-promise", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Wait for one event. The first parameter of the emitted event is used to resolve/reject the promise.
    * 
    * @param emitter  The event emitter you want to watch an event on.
    * @param event    The name of the event you want to watch.
    * @param options  An `Object` controlling advanced options.
    * @return         The returned promise has a `cancel()` method which can be used to remove the event listeners. Note that the promise will never settled if canceled.
    */
  def apply(emitter: EventSource, event: String): js.Promise[_] = js.native
  def apply(emitter: EventSource, event: String, options: EventToPromiseOptions): js.Promise[_] = js.native
  def multi(emitter: EventSource, successEvents: js.Array[String]): js.Promise[_] = js.native
  def multi(emitter: EventSource, successEvents: js.Array[String], errorEvents: js.Array[String]): js.Promise[_] = js.native
}

