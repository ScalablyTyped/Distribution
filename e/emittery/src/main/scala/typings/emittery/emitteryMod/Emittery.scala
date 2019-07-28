package typings.emittery.emitteryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emittery extends js.Object {
  /**
  	 * Clear all event listeners on the instance.
  	 *
  	 * If `eventName` is given, only the listeners for that event are cleared.
  	 */
  def clearListeners(): Unit = js.native
  def clearListeners(eventName: String): Unit = js.native
  /**
  	 * Trigger an event asynchronously, optionally with some data. Listeners
  	 * are called in the order they were added, but execute concurrently.
  	 *
  	 * Returns a promise for when all the event listeners are done. *Done*
  	 * meaning executed if synchronous or resolved when an
  	 * async/promise-returning function. You usually wouldn't want to wait for
  	 * this, but you could for example catch possible errors. If any of the
  	 * listeners throw/reject, the returned promise will be rejected with the
  	 * error, but the other listeners will not be affected.
  	 *
  	 * Returns a promise for when all the event listeners are done.
  	 */
  def emit(eventName: String): js.Promise[Unit] = js.native
  def emit(eventName: String, eventData: js.Any): js.Promise[Unit] = js.native
  /**
  	 * Same as `emit()`, but it waits for each listener to resolve before
  	 * triggering the next one. This can be useful if your events depend on each
  	 * other. Although ideally they should not. Prefer `emit()` whenever
  	 * possible.
  	 *
  	 * If any of the listeners throw/reject, the returned promise will be
  	 * rejected with the error and the remaining listeners will *not* be called.
  	 *
  	 * Returns a promise for when all the event listeners are done.
  	 */
  def emitSerial(eventName: String): js.Promise[Unit] = js.native
  def emitSerial(eventName: String, eventData: js.Any): js.Promise[Unit] = js.native
  /**
  	 * The number of listeners for the `eventName` or all events if not
  	 * specified.
  	 */
  def listenerCount(): Double = js.native
  def listenerCount(eventName: String): Double = js.native
  /**
  	 * Remove an event subscription.
  	 */
  def off(eventName: String, listener: js.Function1[/* eventData */ js.UndefOr[js.Any], _]): Unit = js.native
  /**
  	 * Remove an `onAny` subscription.
  	 */
  def offAny(listener: js.Function2[/* eventName */ String, /* eventData */ js.UndefOr[js.Any], _]): Unit = js.native
  /**
  	 * Subscribe to an event.
  	 *
  	 * Returns an unsubscribe method.
  	 *
  	 * Using the same listener multiple times for the same event will result
  	 * in only one method call per emitted event.
  	 */
  def on(eventName: String, listener: js.Function1[/* eventData */ js.UndefOr[js.Any], _]): UnsubscribeFn = js.native
  /**
  	 * Subscribe to be notified about any event.
  	 *
  	 * Returns a method to unsubscribe.
  	 */
  def onAny(listener: js.Function2[/* eventName */ String, /* eventData */ js.UndefOr[js.Any], _]): UnsubscribeFn = js.native
  /**
  	 * Subscribe to an event only once. It will be unsubscribed after the first
  	 * event.
  	 *
  	 * Returns a promise for the event data when `eventName` is emitted.
  	 */
  def once(eventName: String): js.Promise[_] = js.native
}

