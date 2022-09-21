package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * An interface representing a map layer containing features of a
  * specific {@link google.maps.FeatureType} whose style can be overridden
  * client-side, or have events attached.
  */
trait FeatureLayer extends StObject {
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * Adds the given listener function to the given event name. Returns an
    * identifier for this listener that can be used with {@link
    * google.maps.event.removeListener}.
    * @param eventName Observed event.
    * @param handler Function to handle events.
    */
  def addListener(eventName: String, handler: js.Function): MapsEventListener
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * The <code>FeatureType</code> associated with this
    * <code>FeatureLayer</code>.
    */
  var featureType: FeatureType
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * Whether this <code>FeatureLayer</code> is available, meaning whether
    * Data-driven styling is available for this map (there is a map ID using
    * vector tiles with this <code>FeatureLayer</code> enabled in the Google
    * Cloud Console map style.) If this is false (or becomes false), styling on
    * this <code>FeatureLayer</code> returns to default and events are not
    * triggered.
    */
  var isAvailable: Boolean
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * The style of <code>Feature</code>s in the <code>FeatureLayer</code>. The
    * style is applied when style is set. If your style function updates, you
    * must set the style property again. A <code>FeatureStyleFunction</code>
    * must return consistent results when it is applied over the map tiles, and
    * should be optimized for performance. If you use a
    * <code>FeatureStyleOptions</code>, all features of that layer will be
    * styled with the same <code>FeatureStyleOptions</code>. Set the style to
    * <code>null</code> to remove the previously set style. If this
    * <code>FeatureLayer</code> is not available, setting style does nothing
    * and logs an error.
    */
  var style: js.UndefOr[FeatureStyleOptions | Null | FeatureStyleFunction] = js.undefined
}
object FeatureLayer {
  
  inline def apply(
    addListener: (String, js.Function) => MapsEventListener,
    featureType: FeatureType,
    isAvailable: Boolean
  ): FeatureLayer = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), featureType = featureType.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayer]
  }
  
  extension [Self <: FeatureLayer](x: Self) {
    
    inline def setAddListener(value: (String, js.Function) => MapsEventListener): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    inline def setFeatureType(value: FeatureType): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: FeatureStyleOptions | FeatureStyleFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction1(value: /* a */ FeatureStyleFunctionOptions => js.UndefOr[FeatureStyleOptions | Null]): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
