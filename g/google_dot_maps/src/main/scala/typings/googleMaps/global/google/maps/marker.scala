package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.MapsEventListener
import typings.googleMaps.google.maps.marker.AdvancedMarkerViewOptions
import typings.googleMaps.google.maps.marker.PinViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marker {
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * Creates an <code>AdvancedMarkerView</code> with the options specified. If a
    * map is specified, the <code>AdvancedMarkerView</code> is added to the map
    * upon construction. Note that the position must be set for the
    * <code>AdvancedMarkerView</code> to display.
    */
  @JSGlobal("google.maps.marker.AdvancedMarkerView")
  @js.native
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * Creates an <code>AdvancedMarkerView</code> with the options specified. If
    * a map is specified, the <code>AdvancedMarkerView</code> is added to the
    * map upon construction. Note that the position must be set for the
    * <code>AdvancedMarkerView</code> to display.
    */
  open class AdvancedMarkerView ()
    extends StObject
       with typings.googleMaps.google.maps.marker.AdvancedMarkerView {
    def this(options: AdvancedMarkerViewOptions) = this()
    
    /**
      * Adds the given listener function to the given event name.
      */
    /* CompleteClass */
    override def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
  }
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * A <code>PinView</code> represents a DOM element that consists of a shape
    * and a glyph. The shape has the same balloon style as seen in the
    * default {@link google.maps.marker.AdvancedMarkerView}. The glyph is an
    * optional DOM element displayed in the balloon shape. A <code>PinView</code>
    * may have a different aspect ratio depending on its {@link
    * google.maps.marker.PinView.scale}.
    */
  @JSGlobal("google.maps.marker.PinView")
  @js.native
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * A <code>PinView</code> represents a DOM element that consists of a shape
    * and a glyph. The shape has the same balloon style as seen in the
    * default {@link google.maps.marker.AdvancedMarkerView}. The glyph is an
    * optional DOM element displayed in the balloon shape. A
    * <code>PinView</code> may have a different aspect ratio depending on
    * its {@link google.maps.marker.PinView.scale}.
    */
  open class PinView ()
    extends StObject
       with typings.googleMaps.google.maps.marker.PinView {
    def this(options: PinViewOptions) = this()
    
    /**
      * Adds the given listener function to the given event name.
      */
    /* CompleteClass */
    override def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
  }
}
