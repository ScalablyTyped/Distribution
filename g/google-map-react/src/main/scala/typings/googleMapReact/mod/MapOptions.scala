package typings.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapOptions extends StObject {
  
  // Any options from https://developers.google.com/maps/documentation/javascript/reference/3/#MapOptions
  // excluding 'zoom' and 'center' which get set via props.
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var clickableIcons: js.UndefOr[Boolean] = js.undefined
  
  var controlSize: js.UndefOr[Double] = js.undefined
  
  var disableDefaultUI: js.UndefOr[Boolean] = js.undefined
  
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var draggableCursor: js.UndefOr[String] = js.undefined
  
  var draggingCursor: js.UndefOr[String] = js.undefined
  
  var fullscreenControl: js.UndefOr[Boolean] = js.undefined
  
  var fullscreenControlOptions: js.UndefOr[typings.googleMapReact.anon.Position] = js.undefined
  
  var gestureHandling: js.UndefOr[String] = js.undefined
  
  var heading: js.UndefOr[Double] = js.undefined
  
  var keyboardShortcuts: js.UndefOr[Boolean] = js.undefined
  
  var mapTypeControl: js.UndefOr[Boolean] = js.undefined
  
  var mapTypeControlOptions: js.UndefOr[js.Any] = js.undefined
  
  var mapTypeId: js.UndefOr[String] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var minZoomOverride: js.UndefOr[Boolean] = js.undefined
  
  var noClear: js.UndefOr[Boolean] = js.undefined
  
  var options: js.UndefOr[js.Function1[/* maps */ Maps, Props]] = js.undefined
  
  var panControl: js.UndefOr[Boolean] = js.undefined
  
  var panControlOptions: js.UndefOr[typings.googleMapReact.anon.Position] = js.undefined
  
  var rotateControl: js.UndefOr[Boolean] = js.undefined
  
  var rotateControlOptions: js.UndefOr[typings.googleMapReact.anon.Position] = js.undefined
  
  var scaleControl: js.UndefOr[Boolean] = js.undefined
  
  var scaleControlOptions: js.UndefOr[js.Any] = js.undefined
  
  var scrollwheel: js.UndefOr[Boolean] = js.undefined
  
  var streetView: js.UndefOr[js.Any] = js.undefined
  
  var streetViewControl: js.UndefOr[Boolean] = js.undefined
  
  var streetViewControlOptions: js.UndefOr[typings.googleMapReact.anon.Position] = js.undefined
  
  var styles: js.UndefOr[js.Array[MapTypeStyle]] = js.undefined
  
  var tilt: js.UndefOr[Double] = js.undefined
  
  var zoomControl: js.UndefOr[Boolean] = js.undefined
  
  var zoomControlOptions: js.UndefOr[typings.googleMapReact.anon.Position] = js.undefined
}
object MapOptions {
  
  inline def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  extension [Self <: MapOptions](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setClickableIcons(value: Boolean): Self = StObject.set(x, "clickableIcons", value.asInstanceOf[js.Any])
    
    inline def setClickableIconsUndefined: Self = StObject.set(x, "clickableIcons", js.undefined)
    
    inline def setControlSize(value: Double): Self = StObject.set(x, "controlSize", value.asInstanceOf[js.Any])
    
    inline def setControlSizeUndefined: Self = StObject.set(x, "controlSize", js.undefined)
    
    inline def setDisableDefaultUI(value: Boolean): Self = StObject.set(x, "disableDefaultUI", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultUIUndefined: Self = StObject.set(x, "disableDefaultUI", js.undefined)
    
    inline def setDisableDoubleClickZoom(value: Boolean): Self = StObject.set(x, "disableDoubleClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDisableDoubleClickZoomUndefined: Self = StObject.set(x, "disableDoubleClickZoom", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableCursor(value: String): Self = StObject.set(x, "draggableCursor", value.asInstanceOf[js.Any])
    
    inline def setDraggableCursorUndefined: Self = StObject.set(x, "draggableCursor", js.undefined)
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setDraggingCursor(value: String): Self = StObject.set(x, "draggingCursor", value.asInstanceOf[js.Any])
    
    inline def setDraggingCursorUndefined: Self = StObject.set(x, "draggingCursor", js.undefined)
    
    inline def setFullscreenControl(value: Boolean): Self = StObject.set(x, "fullscreenControl", value.asInstanceOf[js.Any])
    
    inline def setFullscreenControlOptions(value: typings.googleMapReact.anon.Position): Self = StObject.set(x, "fullscreenControlOptions", value.asInstanceOf[js.Any])
    
    inline def setFullscreenControlOptionsUndefined: Self = StObject.set(x, "fullscreenControlOptions", js.undefined)
    
    inline def setFullscreenControlUndefined: Self = StObject.set(x, "fullscreenControl", js.undefined)
    
    inline def setGestureHandling(value: String): Self = StObject.set(x, "gestureHandling", value.asInstanceOf[js.Any])
    
    inline def setGestureHandlingUndefined: Self = StObject.set(x, "gestureHandling", js.undefined)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setKeyboardShortcuts(value: Boolean): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
    
    inline def setKeyboardShortcutsUndefined: Self = StObject.set(x, "keyboardShortcuts", js.undefined)
    
    inline def setMapTypeControl(value: Boolean): Self = StObject.set(x, "mapTypeControl", value.asInstanceOf[js.Any])
    
    inline def setMapTypeControlOptions(value: js.Any): Self = StObject.set(x, "mapTypeControlOptions", value.asInstanceOf[js.Any])
    
    inline def setMapTypeControlOptionsUndefined: Self = StObject.set(x, "mapTypeControlOptions", js.undefined)
    
    inline def setMapTypeControlUndefined: Self = StObject.set(x, "mapTypeControl", js.undefined)
    
    inline def setMapTypeId(value: String): Self = StObject.set(x, "mapTypeId", value.asInstanceOf[js.Any])
    
    inline def setMapTypeIdUndefined: Self = StObject.set(x, "mapTypeId", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomOverride(value: Boolean): Self = StObject.set(x, "minZoomOverride", value.asInstanceOf[js.Any])
    
    inline def setMinZoomOverrideUndefined: Self = StObject.set(x, "minZoomOverride", js.undefined)
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setNoClear(value: Boolean): Self = StObject.set(x, "noClear", value.asInstanceOf[js.Any])
    
    inline def setNoClearUndefined: Self = StObject.set(x, "noClear", js.undefined)
    
    inline def setOptions(value: /* maps */ Maps => Props): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPanControl(value: Boolean): Self = StObject.set(x, "panControl", value.asInstanceOf[js.Any])
    
    inline def setPanControlOptions(value: typings.googleMapReact.anon.Position): Self = StObject.set(x, "panControlOptions", value.asInstanceOf[js.Any])
    
    inline def setPanControlOptionsUndefined: Self = StObject.set(x, "panControlOptions", js.undefined)
    
    inline def setPanControlUndefined: Self = StObject.set(x, "panControl", js.undefined)
    
    inline def setRotateControl(value: Boolean): Self = StObject.set(x, "rotateControl", value.asInstanceOf[js.Any])
    
    inline def setRotateControlOptions(value: typings.googleMapReact.anon.Position): Self = StObject.set(x, "rotateControlOptions", value.asInstanceOf[js.Any])
    
    inline def setRotateControlOptionsUndefined: Self = StObject.set(x, "rotateControlOptions", js.undefined)
    
    inline def setRotateControlUndefined: Self = StObject.set(x, "rotateControl", js.undefined)
    
    inline def setScaleControl(value: Boolean): Self = StObject.set(x, "scaleControl", value.asInstanceOf[js.Any])
    
    inline def setScaleControlOptions(value: js.Any): Self = StObject.set(x, "scaleControlOptions", value.asInstanceOf[js.Any])
    
    inline def setScaleControlOptionsUndefined: Self = StObject.set(x, "scaleControlOptions", js.undefined)
    
    inline def setScaleControlUndefined: Self = StObject.set(x, "scaleControl", js.undefined)
    
    inline def setScrollwheel(value: Boolean): Self = StObject.set(x, "scrollwheel", value.asInstanceOf[js.Any])
    
    inline def setScrollwheelUndefined: Self = StObject.set(x, "scrollwheel", js.undefined)
    
    inline def setStreetView(value: js.Any): Self = StObject.set(x, "streetView", value.asInstanceOf[js.Any])
    
    inline def setStreetViewControl(value: Boolean): Self = StObject.set(x, "streetViewControl", value.asInstanceOf[js.Any])
    
    inline def setStreetViewControlOptions(value: typings.googleMapReact.anon.Position): Self = StObject.set(x, "streetViewControlOptions", value.asInstanceOf[js.Any])
    
    inline def setStreetViewControlOptionsUndefined: Self = StObject.set(x, "streetViewControlOptions", js.undefined)
    
    inline def setStreetViewControlUndefined: Self = StObject.set(x, "streetViewControl", js.undefined)
    
    inline def setStreetViewUndefined: Self = StObject.set(x, "streetView", js.undefined)
    
    inline def setStyles(value: js.Array[MapTypeStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: MapTypeStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
    
    inline def setZoomControl(value: Boolean): Self = StObject.set(x, "zoomControl", value.asInstanceOf[js.Any])
    
    inline def setZoomControlOptions(value: typings.googleMapReact.anon.Position): Self = StObject.set(x, "zoomControlOptions", value.asInstanceOf[js.Any])
    
    inline def setZoomControlOptionsUndefined: Self = StObject.set(x, "zoomControlOptions", js.undefined)
    
    inline def setZoomControlUndefined: Self = StObject.set(x, "zoomControl", js.undefined)
  }
}
