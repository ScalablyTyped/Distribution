package typings.googleMaps.google.maps

import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * This object is returned from a mouse event on a <code>FeatureLayer</code>.
  */
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
  
  extension [Self <: FeatureMouseEvent](x: Self) {
    
    inline def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value*))
  }
}
