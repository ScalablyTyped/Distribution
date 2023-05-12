package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MapsEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationProvider extends StObject {
  
  /**
    * Adds a {@link google.maps.MapsEventListener} for an event fired by this
    * location provider. Returns an identifier for this listener that can be
    * used with {@link google.maps.event.removeListener}.
    * @param eventName The name of the event to listen for.
    * @param handler The event handler.
    */
  def addListener(eventName: String, handler: js.Function): MapsEventListener
}
object LocationProvider {
  
  inline def apply(addListener: (String, js.Function) => MapsEventListener): LocationProvider = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener))
    __obj.asInstanceOf[LocationProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationProvider] (val x: Self) extends AnyVal {
    
    inline def setAddListener(value: (String, js.Function) => MapsEventListener): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
  }
}
