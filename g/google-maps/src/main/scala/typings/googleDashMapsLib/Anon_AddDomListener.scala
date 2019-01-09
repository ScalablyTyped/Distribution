package typings
package googleDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddDomListener
  extends org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.event] {
  /**
    * Cross browser event handler registration. This listener is removed by
    * calling removeListener(handle) for the handle that is returned by this
    * function.
    */
  def addDomListener(instance: js.Object, eventName: java.lang.String, handler: js.Function): googlemapsLib.googleNs.mapsNs.MapsEventListener = js.native
  def addDomListener(instance: js.Object, eventName: java.lang.String, handler: js.Function, capture: scala.Boolean): googlemapsLib.googleNs.mapsNs.MapsEventListener = js.native
  /**
    * Wrapper around addDomListener that removes the listener after the first
    * event.
    */
  def addDomListenerOnce(instance: js.Object, eventName: java.lang.String, handler: js.Function): googlemapsLib.googleNs.mapsNs.MapsEventListener = js.native
  def addDomListenerOnce(instance: js.Object, eventName: java.lang.String, handler: js.Function, capture: scala.Boolean): googlemapsLib.googleNs.mapsNs.MapsEventListener = js.native
  /**
    * Adds the given listener function to the given event name for the given
    * object instance. Returns an identifier for this listener that can be used
    * with removeListener().
    */
  def addListener(instance: js.Object, eventName: java.lang.String, handler: js.Function): googlemapsLib.googleNs.mapsNs.MapsEventListener = js.native
  /**
    * Like addListener, but the handler removes itself after handling the first
    * event.
    */
  def addListenerOnce(instance: js.Object, eventName: java.lang.String, handler: js.Function): googlemapsLib.googleNs.mapsNs.MapsEventListener = js.native
  /**
    * Removes all listeners for all events for the given instance.
    */
  def clearInstanceListeners(instance: js.Object): scala.Unit = js.native
  /**
    * Removes all listeners for the given event for the given instance.
    */
  def clearListeners(instance: js.Object, eventName: java.lang.String): scala.Unit = js.native
  /**
    * Removes the given listener, which should have been returned by
    * addListener above. Equivalent to calling listener.remove().
    */
  def removeListener(listener: googlemapsLib.googleNs.mapsNs.MapsEventListener): scala.Unit = js.native
  /**
    * Triggers the given event. All arguments after eventName are passed as
    * arguments to the listeners.
    */
  def trigger(instance: js.Any, eventName: java.lang.String, args: js.Any*): scala.Unit = js.native
}

