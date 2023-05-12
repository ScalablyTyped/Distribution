package typings.googleMaps.google.maps.places

import typings.googleMaps.google.maps.MapsEventListener
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceAutocompleteElement
  extends StObject
     with PlaceAutocompleteElementOptions {
  
  /**
    * Adds the given listener function to the given event name.
    */
  def addListener(eventName: String, handler: js.Function): MapsEventListener
}
object PlaceAutocompleteElement {
  
  inline def apply(addListener: (String, js.Function) => MapsEventListener, inputElement: HTMLInputElement): PlaceAutocompleteElement = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), inputElement = inputElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceAutocompleteElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceAutocompleteElement] (val x: Self) extends AnyVal {
    
    inline def setAddListener(value: (String, js.Function) => MapsEventListener): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
  }
}
