package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservable[T] extends StObject {
  
  /**
    * Stops event observing for a particular event handler. Calling this method
    * without arguments removes all handlers for all events
    * @param eventName Event name (eg. 'after:render') or object with key/value pairs (eg. {'after:render': handler, 'selection:cleared': handler})
    * @param handler Function to be deleted from EventListeners
    */
  def off(): T = js.native
  def off(eventName: js.UndefOr[scala.Nothing], handler: js.Function1[/* e */ IEvent, Unit]): T = js.native
  def off(eventName: String): T = js.native
  def off(eventName: String, handler: js.Function1[/* e */ IEvent, Unit]): T = js.native
  def off(eventName: js.Any): T = js.native
  def off(eventName: js.Any, handler: js.Function1[/* e */ IEvent, Unit]): T = js.native
  
  /**
    * Observes specified event
    * @param eventName Event name (eg. 'after:render')
    * @param handler Function that receives a notification when an event of the specified type occurs
    */
  def on(eventName: String, handler: js.Function1[/* e */ IEvent, Unit]): T = js.native
  /**
    * Observes specified event
    * @param eventName Object with key/value pairs (eg. {'after:render': handler, 'selection:cleared': handler})
    */
  def on(events: StringDictionary[js.Function1[/* e */ IEvent, Unit]]): T = js.native
  
  /**
    * Fires event with an optional options object
    * @param eventName Event name to fire
    * @param [options] Options object
    */
  def trigger(eventName: String): T = js.native
  def trigger(eventName: String, options: js.Any): T = js.native
}
