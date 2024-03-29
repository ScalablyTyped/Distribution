package typings.googleMaps.google.maps

import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureMouseEvent
  extends StObject
     with MapMouseEvent {
  
  /**
    * The <code>Feature</code>s at this mouse event.
    */
  var features: js.Array[Feature]
}
object FeatureMouseEvent {
  
  inline def apply(
    domEvent: MouseEvent | TouchEvent | PointerEvent | KeyboardEvent | Event,
    features: js.Array[Feature],
    stop: () => Unit
  ): FeatureMouseEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), latLng = null)
    __obj.asInstanceOf[FeatureMouseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureMouseEvent] (val x: Self) extends AnyVal {
    
    inline def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value*))
  }
}
