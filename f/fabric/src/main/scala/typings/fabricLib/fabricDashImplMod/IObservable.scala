package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservable[T] extends js.Object {
  /**
  	 * Stops event observing for a particular event handler. Calling this method
  	 * without arguments removes all handlers for all events
  	 * @param eventName Event name (eg. 'after:render') or object with key/value pairs (eg. {'after:render': handler, 'selection:cleared': handler})
  	 * @param handler Function to be deleted from EventListeners
  	 */
  def off(): T = js.native
  /**
  	 * Stops event observing for a particular event handler. Calling this method
  	 * without arguments removes all handlers for all events
  	 * @param eventName Event name (eg. 'after:render') or object with key/value pairs (eg. {'after:render': handler, 'selection:cleared': handler})
  	 * @param handler Function to be deleted from EventListeners
  	 */
  def off(eventName: java.lang.String): T = js.native
  /**
  	 * Stops event observing for a particular event handler. Calling this method
  	 * without arguments removes all handlers for all events
  	 * @param eventName Event name (eg. 'after:render') or object with key/value pairs (eg. {'after:render': handler, 'selection:cleared': handler})
  	 * @param handler Function to be deleted from EventListeners
  	 */
  def off(eventName: java.lang.String, handler: js.Function1[/* e */ IEvent, scala.Unit]): T = js.native
  /**
  	 * Stops event observing for a particular event handler. Calling this method
  	 * without arguments removes all handlers for all events
  	 * @param eventName Event name (eg. 'after:render') or object with key/value pairs (eg. {'after:render': handler, 'selection:cleared': handler})
  	 * @param handler Function to be deleted from EventListeners
  	 */
  def off(eventName: js.Any): T = js.native
  /**
  	 * Stops event observing for a particular event handler. Calling this method
  	 * without arguments removes all handlers for all events
  	 * @param eventName Event name (eg. 'after:render') or object with key/value pairs (eg. {'after:render': handler, 'selection:cleared': handler})
  	 * @param handler Function to be deleted from EventListeners
  	 */
  def off(eventName: js.Any, handler: js.Function1[/* e */ IEvent, scala.Unit]): T = js.native
  /**
  	 * Observes specified event
  	 * @param eventName Event name (eg. 'after:render')
  	 * @param handler Function that receives a notification when an event of the specified type occurs
  	 */
  def on(eventName: java.lang.String, handler: js.Function1[/* e */ IEvent, scala.Unit]): T = js.native
  /**
  	 * Observes specified event
  	 * @param eventName Object with key/value pairs (eg. {'after:render': handler, 'selection:cleared': handler})
  	 */
  def on(events: ScalablyTyped.runtime.StringDictionary[js.Function1[/* e */ IEvent, scala.Unit]]): T = js.native
  /**
  	 * Fires event with an optional options object
  	 * @param eventName Event name to fire
  	 * @param [options] Options object
  	 */
  def trigger(eventName: java.lang.String): T = js.native
  /**
  	 * Fires event with an optional options object
  	 * @param eventName Event name to fire
  	 * @param [options] Options object
  	 */
  def trigger(eventName: java.lang.String, options: js.Any): T = js.native
}

