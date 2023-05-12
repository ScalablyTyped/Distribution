package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.MapsEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.event")
@js.native
open class event ()
  extends StObject
     with typings.googleMaps.google.maps.event
/* static members */
object event {
  
  @JSGlobal("google.maps.event")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Cross browser event handler registration. This listener is removed by
    * calling removeListener(handle) for the handle that is returned by this
    * function.
    * @deprecated <code>google.maps.event.addDomListener()</code> is
    *     deprecated, use the standard <a
    *     href="https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener">addEventListener()</a>
    *     method instead. The feature will continue to work and there is no
    *     plan to decommission it.
    */
  inline def addDomListener(instance: js.Object, eventName: String, handler: js.Function): MapsEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addDomListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[MapsEventListener]
  inline def addDomListener(instance: js.Object, eventName: String, handler: js.Function, capture: Boolean): MapsEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addDomListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[MapsEventListener]
  
  /**
    * Wrapper around addDomListener that removes the listener after the first
    * event.
    * @deprecated <code>google.maps.event.addDomListenerOnce()</code> is
    *     deprecated, use the standard <a
    *     href="https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener">addEventListener()</a>
    *     method instead. The feature will continue to work and there is no
    *     plan to decommission it.
    */
  inline def addDomListenerOnce(instance: js.Object, eventName: String, handler: js.Function): MapsEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addDomListenerOnce")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[MapsEventListener]
  inline def addDomListenerOnce(instance: js.Object, eventName: String, handler: js.Function, capture: Boolean): MapsEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addDomListenerOnce")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[MapsEventListener]
  
  /**
    * Adds the given listener function to the given event name for the given
    * object instance. Returns an identifier for this listener that can be used
    * with removeListener().
    */
  inline def addListener(instance: js.Object, eventName: String, handler: js.Function): MapsEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[MapsEventListener]
  
  /**
    * Like addListener, but the handler removes itself after handling the first
    * event.
    */
  inline def addListenerOnce(instance: js.Object, eventName: String, handler: js.Function): MapsEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addListenerOnce")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[MapsEventListener]
  
  /**
    * Removes all listeners for all events for the given instance.
    */
  inline def clearInstanceListeners(instance: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInstanceListeners")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Removes all listeners for the given event for the given instance.
    */
  inline def clearListeners(instance: js.Object, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns if there are listeners for the given event on the given instance.
    * Can be used to to save the computation of expensive event details.
    */
  inline def hasListeners(instance: js.Object, eventName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasListeners")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Removes the given listener, which should have been returned by
    * addListener above. Equivalent to calling <code>listener.remove()</code>.
    */
  inline def removeListener(listener: MapsEventListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Triggers the given event. All arguments after eventName are passed as
    * arguments to the listeners.
    */
  inline def trigger(instance: js.Object, eventName: String, eventArgs: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")((scala.List(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).`++`(eventArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
}
