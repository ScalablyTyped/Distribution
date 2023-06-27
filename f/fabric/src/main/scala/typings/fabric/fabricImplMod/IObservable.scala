package typings.fabric.fabricImplMod

import typings.fabric.fabricStrings.mouseColonwheel
import typings.std.Event
import typings.std.MouseEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservable[T] extends StObject {
  
  /**
    * Fires event with an optional options object
    * @param {String} eventName Event name to fire
    * @param {Object} [options] Options object
    * @return {Self} thisArg
    * @chainable
    */
  def fire(eventName: String): T = js.native
  def fire(eventName: String, options: Any): T = js.native
  
  /**
    * Stops event observing for a particular event handler. Calling this method
    * without arguments removes all handlers for all events
    * @param eventName Event name (eg. 'after:render') or object with key/value pairs (eg. {'after:render': handler, 'selection:cleared': handler})
    * @param handler Function to be deleted from EventListeners
    */
  def off(): T = js.native
  def off(eventName: String): T = js.native
  def off(eventName: String, handler: js.Function1[/* e */ IEvent[Event], Unit]): T = js.native
  def off(eventName: Any): T = js.native
  def off(eventName: Any, handler: js.Function1[/* e */ IEvent[Event], Unit]): T = js.native
  def off(eventName: Unit, handler: js.Function1[/* e */ IEvent[Event], Unit]): T = js.native
  
  def on(eventName: String, handler: js.Function1[/* e */ IEvent[Event], Unit]): T = js.native
  /**
    * Observes specified event
    * @param eventName Event name (eg. 'after:render')
    * @param handler Function that receives a notification when an event of the specified type occurs
    */
  def on(eventName: EventName, handler: js.Function1[/* e */ IEvent[MouseEvent], Unit]): T = js.native
  @JSName("on")
  def on_mousewheel(eventName: mouseColonwheel, handler: js.Function1[/* e */ IEvent[WheelEvent], Unit]): T = js.native
}
