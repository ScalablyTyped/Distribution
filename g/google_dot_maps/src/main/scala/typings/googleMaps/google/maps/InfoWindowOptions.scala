package typings.googleMaps.google.maps

import typings.std.Element
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InfoWindowOptions object used to define the properties that can be set on a
  * InfoWindow.
  */
trait InfoWindowOptions extends StObject {
  
  /**
    * AriaLabel to assign to the InfoWindow.
    */
  var ariaLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Content to display in the InfoWindow. This can be an HTML element, a
    * plain-text string, or a string containing HTML. The InfoWindow will be
    * sized according to the content. To set an explicit size for the content,
    * set content to be a HTML element with that size.
    */
  var content: js.UndefOr[String | Null | Element | Text] = js.undefined
  
  /**
    * Disable panning the map to make the InfoWindow fully visible when it
    * opens.
    * @defaultValue <code>false</code>
    */
  var disableAutoPan: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Maximum width of the InfoWindow, regardless of content&#39;s width. This
    * value is only considered if it is set before a call to
    * <code>open()</code>. To change the maximum width when changing content,
    * call <code>close()</code>, <code>setOptions()</code>, and then
    * <code>open()</code>.
    */
  var maxWidth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Minimum width of the InfoWindow, regardless of the content&#39;s width.
    * When using this property, it is strongly recommended to set the
    * <code>minWidth</code> to a value less than the width of the map (in
    * pixels). This value is only considered if it is set before a call to
    * <code>open()</code>. To change the minimum width when changing content,
    * call <code>close()</code>, <code>setOptions()</code>, and then
    * <code>open()</code>.
    */
  var minWidth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The offset, in pixels, of the tip of the info window from the point on
    * the map at whose geographical coordinates the info window is anchored. If
    * an InfoWindow is opened with an anchor, the <code>pixelOffset</code> will
    * be calculated from the anchor&#39;s <code>anchorPoint</code> property.
    */
  var pixelOffset: js.UndefOr[Size | Null] = js.undefined
  
  /**
    * The LatLng at which to display this InfoWindow. If the InfoWindow is
    * opened with an anchor, the anchor&#39;s position will be used instead.
    */
  var position: js.UndefOr[LatLng | Null | LatLngLiteral] = js.undefined
  
  /**
    * All InfoWindows are displayed on the map in order of their zIndex, with
    * higher values displaying in front of InfoWindows with lower values. By
    * default, InfoWindows are displayed according to their latitude, with
    * InfoWindows of lower latitudes appearing in front of InfoWindows at
    * higher latitudes. InfoWindows are always displayed in front of markers.
    */
  var zIndex: js.UndefOr[Double | Null] = js.undefined
}
object InfoWindowOptions {
  
  inline def apply(): InfoWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoWindowOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfoWindowOptions] (val x: Self) extends AnyVal {
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelNull: Self = StObject.set(x, "ariaLabel", null)
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setContent(value: String | Element | Text): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDisableAutoPan(value: Boolean): Self = StObject.set(x, "disableAutoPan", value.asInstanceOf[js.Any])
    
    inline def setDisableAutoPanNull: Self = StObject.set(x, "disableAutoPan", null)
    
    inline def setDisableAutoPanUndefined: Self = StObject.set(x, "disableAutoPan", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthNull: Self = StObject.set(x, "minWidth", null)
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setPixelOffset(value: Size): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetNull: Self = StObject.set(x, "pixelOffset", null)
    
    inline def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
    
    inline def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexNull: Self = StObject.set(x, "zIndex", null)
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
