package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MapOptions object used to define the properties that can be set on a Map.
  */
trait MapOptions extends StObject {
  
  /**
    * Color used for the background of the Map div. This color will be visible
    * when tiles have not yet loaded as the user pans. This option can only be
    * set when the map is initialized.
    */
  var backgroundColor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The initial Map center.
    */
  var center: js.UndefOr[LatLng | Null | LatLngLiteral] = js.undefined
  
  /**
    * When <code>false</code>, map icons are not clickable. A map icon
    * represents a point of interest, also known as a POI.
    * @defaultValue <code>true</code>
    */
  var clickableIcons: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Size in pixels of the controls appearing on the map. This value must be
    * supplied directly when creating the Map, updating this value later may
    * bring the controls into an <code>undefined</code> state. Only governs the
    * controls made by the Maps API itself. Does not scale developer created
    * custom controls.
    */
  var controlSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Enables/disables all default UI buttons. May be overridden individually.
    * Does not disable the keyboard controls, which are separately controlled
    * by the {@link google.maps.MapOptions.keyboardShortcuts} option. Does not
    * disable gesture controls, which are separately controlled by the {@link
    * google.maps.MapOptions.gestureHandling} option.
    */
  var disableDefaultUI: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enables/disables zoom and center on double click. Enabled by default.
    * <p><strong>Note</strong>: This property is <strong>not
    * recommended</strong>. To disable zooming on double click, you can use the
    * <code>gestureHandling</code> property, and set it to <code>"none"</code>.
    */
  var disableDoubleClickZoom: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If <code>false</code>, prevents the map from being dragged. Dragging is
    * enabled by default.
    * @deprecated Deprecated in 2017. To disable dragging on the map, you can
    *     use the <code>gestureHandling</code> property, and set it to
    *     <code>"none"</code>.
    */
  var draggable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name or url of the cursor to display when mousing over a draggable
    * map. This property uses the css <code>cursor</code> attribute to change
    * the icon. As with the css property, you must specify at least one
    * fallback cursor that is not a URL. For example: <code>draggableCursor:
    * 'url(<a
    * href="http://www.example.com/icon.png">http://www.example.com/icon.png</a>),
    * auto;'</code>.
    */
  var draggableCursor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name or url of the cursor to display when the map is being dragged.
    * This property uses the css <code>cursor</code> attribute to change the
    * icon. As with the css property, you must specify at least one fallback
    * cursor that is not a URL. For example: <code>draggingCursor: 'url(<a
    * href="http://www.example.com/icon.png">http://www.example.com/icon.png</a>),
    * auto;'</code>.
    */
  var draggingCursor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The enabled/disabled state of the Fullscreen control.
    */
  var fullscreenControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The display options for the Fullscreen control.
    */
  var fullscreenControlOptions: js.UndefOr[FullscreenControlOptions | Null] = js.undefined
  
  /**
    * This setting controls how the API handles gestures on the map. Allowed
    * values: <ul> <li> <code>"cooperative"</code>: Scroll events and
    * one-finger touch gestures scroll the page, and do not zoom or pan the
    * map. Two-finger touch gestures pan and zoom the map. Scroll events with a
    * ctrl key or ⌘ key pressed zoom the map.<br> In this mode the map
    * <em>cooperates</em> with the page. <li> <code>"greedy"</code>: All touch
    * gestures and scroll events pan or zoom the map. <li> <code>"none"</code>:
    * The map cannot be panned or zoomed by user gestures. <li>
    * <code>"auto"</code>: (default) Gesture handling is either cooperative or
    * greedy, depending on whether the page is scrollable or in an iframe.
    * </ul>
    */
  var gestureHandling: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The heading for aerial imagery in degrees measured clockwise from
    * cardinal direction North. Headings are snapped to the nearest available
    * angle for which imagery is available.
    */
  var heading: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether the map should allow fractional zoom levels. Listen to
    * <code>isfractionalzoomenabled_changed</code> to know when the default has
    * been set.
    * @defaultValue <code>true</code> for vector maps and <code>false</code>
    * for raster maps
    */
  var isFractionalZoomEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If <code>false</code>, prevents the map from being controlled by the
    * keyboard. Keyboard shortcuts are enabled by default.
    */
  var keyboardShortcuts: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The <a
    * href="https://developers.google.com/maps/documentation/get-map-id">Map
    * ID</a> of the map. This parameter cannot be set or changed after a map is
    * instantiated.
    */
  var mapId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The initial enabled/disabled state of the Map type control.
    */
  var mapTypeControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The initial display options for the Map type control.
    */
  var mapTypeControlOptions: js.UndefOr[MapTypeControlOptions | Null] = js.undefined
  
  /**
    * The initial Map mapTypeId. Defaults to <code>ROADMAP</code>.
    */
  var mapTypeId: js.UndefOr[Null | String] = js.undefined
  
  /**
    * The maximum zoom level which will be displayed on the map. If omitted, or
    * set to <code>null</code>, the maximum zoom from the current map type is
    * used instead. Valid zoom values are numbers from zero up to the supported
    * <a
    * href="https://developers.google.com/maps/documentation/javascript/maxzoom">maximum
    * zoom level</a>.
    */
  var maxZoom: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum zoom level which will be displayed on the map. If omitted, or
    * set to <code>null</code>, the minimum zoom from the current map type is
    * used instead. Valid zoom values are numbers from zero up to the supported
    * <a
    * href="https://developers.google.com/maps/documentation/javascript/maxzoom">maximum
    * zoom level</a>.
    */
  var minZoom: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If <code>true</code>, do not clear the contents of the Map div.
    */
  var noClear: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The enabled/disabled state of the Pan control. <p> Note: The Pan control
    * is not available in the new set of controls introduced in v3.22 of the
    * Google Maps JavaScript API. While using v3.22 and v3.23, you can choose
    * to use the earlier set of controls rather than the new controls, thus
    * making the Pan control available as part of the old control set. See <a
    * href="https://developers.google.com/maps/articles/v322-controls-diff">What&#39;s
    * New in the v3.22 Map Controls</a>.
    */
  var panControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The display options for the Pan control. <p> Note: The Pan control is not
    * available in the new set of controls introduced in v3.22 of the Google
    * Maps JavaScript API. While using v3.22 and v3.23, you can choose to use
    * the earlier set of controls rather than the new controls, thus making the
    * Pan control available as part of the old control set. See <a
    * href="https://developers.google.com/maps/articles/v322-controls-diff">What&#39;s
    * New in the v3.22 Map Controls</a>.
    */
  var panControlOptions: js.UndefOr[PanControlOptions | Null] = js.undefined
  
  /**
    * Defines a boundary that restricts the area of the map accessible to
    * users. When set, a user can only pan and zoom while the camera view stays
    * inside the limits of the boundary.
    */
  var restriction: js.UndefOr[MapRestriction | Null] = js.undefined
  
  /**
    * The enabled/disabled state of the Rotate control.
    */
  var rotateControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The display options for the Rotate control.
    */
  var rotateControlOptions: js.UndefOr[RotateControlOptions | Null] = js.undefined
  
  /**
    * The initial enabled/disabled state of the Scale control.
    */
  var scaleControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The initial display options for the Scale control.
    */
  var scaleControlOptions: js.UndefOr[ScaleControlOptions | Null] = js.undefined
  
  /**
    * If <code>false</code>, disables zooming on the map using a mouse scroll
    * wheel. The scrollwheel is enabled by default. <p><strong>Note</strong>:
    * This property is <strong>not recommended</strong>. To disable zooming
    * using scrollwheel, you can use the <code>gestureHandling</code> property,
    * and set it to either <code>"cooperative"</code> or <code>"none"</code>.
    */
  var scrollwheel: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A <code>StreetViewPanorama</code> to display when the Street View pegman
    * is dropped on the map. If no panorama is specified, a default
    * <code>StreetViewPanorama</code> will be displayed in the map&#39;s
    * <code>div</code> when the pegman is dropped.
    */
  var streetView: js.UndefOr[StreetViewPanorama | Null] = js.undefined
  
  /**
    * The initial enabled/disabled state of the Street View Pegman control.
    * This control is part of the default UI, and should be set to
    * <code>false</code> when displaying a map type on which the Street View
    * road overlay should not appear (e.g. a non-Earth map type).
    */
  var streetViewControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The initial display options for the Street View Pegman control.
    */
  var streetViewControlOptions: js.UndefOr[StreetViewControlOptions | Null] = js.undefined
  
  /**
    * Styles to apply to each of the default map types. Note that for
    * <code>satellite</code>/<code>hybrid</code> and <code>terrain</code>
    * modes, these styles will only apply to labels and geometry.
    */
  var styles: js.UndefOr[js.Array[MapTypeStyle] | Null] = js.undefined
  
  /**
    * For vector maps, sets the angle of incidence of the map. The allowed
    * values are restricted depending on the zoom level of the map. For raster
    * maps, controls the automatic switching behavior for the angle of
    * incidence of the map. The only allowed values are <code>0</code> and
    * <code>45</code>. The value <code>0</code> causes the map to always use a
    * 0&deg; overhead view regardless of the zoom level and viewport. The value
    * <code>45</code> causes the tilt angle to automatically switch to 45
    * whenever 45&deg; imagery is available for the current zoom level and
    * viewport, and switch back to 0 whenever 45&deg; imagery is not available
    * (this is the default behavior). 45&deg; imagery is only available for
    * <code>satellite</code> and <code>hybrid</code> map types, within some
    * locations, and at some zoom levels. <b>Note:</b> <code>getTilt</code>
    * returns the current tilt angle, not the value specified by this option.
    * Because <code>getTilt</code> and this option refer to different things,
    * do not <code>bind()</code> the <code>tilt</code> property; doing so may
    * yield unpredictable effects.
    */
  var tilt: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The initial Map zoom level. Valid zoom values are numbers from zero up to
    * the supported <a
    * href="https://developers.google.com/maps/documentation/javascript/maxzoom">maximum
    * zoom level</a>. Larger zoom values correspond to a higher resolution.
    */
  var zoom: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The enabled/disabled state of the Zoom control.
    */
  var zoomControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The display options for the Zoom control.
    */
  var zoomControlOptions: js.UndefOr[ZoomControlOptions | Null] = js.undefined
}
object MapOptions {
  
  inline def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setCenter(value: LatLng | LatLngLiteral): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterNull: Self = StObject.set(x, "center", null)
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setClickableIcons(value: Boolean): Self = StObject.set(x, "clickableIcons", value.asInstanceOf[js.Any])
    
    inline def setClickableIconsNull: Self = StObject.set(x, "clickableIcons", null)
    
    inline def setClickableIconsUndefined: Self = StObject.set(x, "clickableIcons", js.undefined)
    
    inline def setControlSize(value: Double): Self = StObject.set(x, "controlSize", value.asInstanceOf[js.Any])
    
    inline def setControlSizeNull: Self = StObject.set(x, "controlSize", null)
    
    inline def setControlSizeUndefined: Self = StObject.set(x, "controlSize", js.undefined)
    
    inline def setDisableDefaultUI(value: Boolean): Self = StObject.set(x, "disableDefaultUI", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultUINull: Self = StObject.set(x, "disableDefaultUI", null)
    
    inline def setDisableDefaultUIUndefined: Self = StObject.set(x, "disableDefaultUI", js.undefined)
    
    inline def setDisableDoubleClickZoom(value: Boolean): Self = StObject.set(x, "disableDoubleClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDisableDoubleClickZoomNull: Self = StObject.set(x, "disableDoubleClickZoom", null)
    
    inline def setDisableDoubleClickZoomUndefined: Self = StObject.set(x, "disableDoubleClickZoom", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableCursor(value: String): Self = StObject.set(x, "draggableCursor", value.asInstanceOf[js.Any])
    
    inline def setDraggableCursorNull: Self = StObject.set(x, "draggableCursor", null)
    
    inline def setDraggableCursorUndefined: Self = StObject.set(x, "draggableCursor", js.undefined)
    
    inline def setDraggableNull: Self = StObject.set(x, "draggable", null)
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setDraggingCursor(value: String): Self = StObject.set(x, "draggingCursor", value.asInstanceOf[js.Any])
    
    inline def setDraggingCursorNull: Self = StObject.set(x, "draggingCursor", null)
    
    inline def setDraggingCursorUndefined: Self = StObject.set(x, "draggingCursor", js.undefined)
    
    inline def setFullscreenControl(value: Boolean): Self = StObject.set(x, "fullscreenControl", value.asInstanceOf[js.Any])
    
    inline def setFullscreenControlNull: Self = StObject.set(x, "fullscreenControl", null)
    
    inline def setFullscreenControlOptions(value: FullscreenControlOptions): Self = StObject.set(x, "fullscreenControlOptions", value.asInstanceOf[js.Any])
    
    inline def setFullscreenControlOptionsNull: Self = StObject.set(x, "fullscreenControlOptions", null)
    
    inline def setFullscreenControlOptionsUndefined: Self = StObject.set(x, "fullscreenControlOptions", js.undefined)
    
    inline def setFullscreenControlUndefined: Self = StObject.set(x, "fullscreenControl", js.undefined)
    
    inline def setGestureHandling(value: String): Self = StObject.set(x, "gestureHandling", value.asInstanceOf[js.Any])
    
    inline def setGestureHandlingNull: Self = StObject.set(x, "gestureHandling", null)
    
    inline def setGestureHandlingUndefined: Self = StObject.set(x, "gestureHandling", js.undefined)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingNull: Self = StObject.set(x, "heading", null)
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setIsFractionalZoomEnabled(value: Boolean): Self = StObject.set(x, "isFractionalZoomEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsFractionalZoomEnabledNull: Self = StObject.set(x, "isFractionalZoomEnabled", null)
    
    inline def setIsFractionalZoomEnabledUndefined: Self = StObject.set(x, "isFractionalZoomEnabled", js.undefined)
    
    inline def setKeyboardShortcuts(value: Boolean): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
    
    inline def setKeyboardShortcutsNull: Self = StObject.set(x, "keyboardShortcuts", null)
    
    inline def setKeyboardShortcutsUndefined: Self = StObject.set(x, "keyboardShortcuts", js.undefined)
    
    inline def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
    
    inline def setMapIdNull: Self = StObject.set(x, "mapId", null)
    
    inline def setMapIdUndefined: Self = StObject.set(x, "mapId", js.undefined)
    
    inline def setMapTypeControl(value: Boolean): Self = StObject.set(x, "mapTypeControl", value.asInstanceOf[js.Any])
    
    inline def setMapTypeControlNull: Self = StObject.set(x, "mapTypeControl", null)
    
    inline def setMapTypeControlOptions(value: MapTypeControlOptions): Self = StObject.set(x, "mapTypeControlOptions", value.asInstanceOf[js.Any])
    
    inline def setMapTypeControlOptionsNull: Self = StObject.set(x, "mapTypeControlOptions", null)
    
    inline def setMapTypeControlOptionsUndefined: Self = StObject.set(x, "mapTypeControlOptions", js.undefined)
    
    inline def setMapTypeControlUndefined: Self = StObject.set(x, "mapTypeControl", js.undefined)
    
    inline def setMapTypeId(value: String): Self = StObject.set(x, "mapTypeId", value.asInstanceOf[js.Any])
    
    inline def setMapTypeIdNull: Self = StObject.set(x, "mapTypeId", null)
    
    inline def setMapTypeIdUndefined: Self = StObject.set(x, "mapTypeId", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomNull: Self = StObject.set(x, "maxZoom", null)
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomNull: Self = StObject.set(x, "minZoom", null)
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setNoClear(value: Boolean): Self = StObject.set(x, "noClear", value.asInstanceOf[js.Any])
    
    inline def setNoClearNull: Self = StObject.set(x, "noClear", null)
    
    inline def setNoClearUndefined: Self = StObject.set(x, "noClear", js.undefined)
    
    inline def setPanControl(value: Boolean): Self = StObject.set(x, "panControl", value.asInstanceOf[js.Any])
    
    inline def setPanControlNull: Self = StObject.set(x, "panControl", null)
    
    inline def setPanControlOptions(value: PanControlOptions): Self = StObject.set(x, "panControlOptions", value.asInstanceOf[js.Any])
    
    inline def setPanControlOptionsNull: Self = StObject.set(x, "panControlOptions", null)
    
    inline def setPanControlOptionsUndefined: Self = StObject.set(x, "panControlOptions", js.undefined)
    
    inline def setPanControlUndefined: Self = StObject.set(x, "panControl", js.undefined)
    
    inline def setRestriction(value: MapRestriction): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    inline def setRestrictionNull: Self = StObject.set(x, "restriction", null)
    
    inline def setRestrictionUndefined: Self = StObject.set(x, "restriction", js.undefined)
    
    inline def setRotateControl(value: Boolean): Self = StObject.set(x, "rotateControl", value.asInstanceOf[js.Any])
    
    inline def setRotateControlNull: Self = StObject.set(x, "rotateControl", null)
    
    inline def setRotateControlOptions(value: RotateControlOptions): Self = StObject.set(x, "rotateControlOptions", value.asInstanceOf[js.Any])
    
    inline def setRotateControlOptionsNull: Self = StObject.set(x, "rotateControlOptions", null)
    
    inline def setRotateControlOptionsUndefined: Self = StObject.set(x, "rotateControlOptions", js.undefined)
    
    inline def setRotateControlUndefined: Self = StObject.set(x, "rotateControl", js.undefined)
    
    inline def setScaleControl(value: Boolean): Self = StObject.set(x, "scaleControl", value.asInstanceOf[js.Any])
    
    inline def setScaleControlNull: Self = StObject.set(x, "scaleControl", null)
    
    inline def setScaleControlOptions(value: ScaleControlOptions): Self = StObject.set(x, "scaleControlOptions", value.asInstanceOf[js.Any])
    
    inline def setScaleControlOptionsNull: Self = StObject.set(x, "scaleControlOptions", null)
    
    inline def setScaleControlOptionsUndefined: Self = StObject.set(x, "scaleControlOptions", js.undefined)
    
    inline def setScaleControlUndefined: Self = StObject.set(x, "scaleControl", js.undefined)
    
    inline def setScrollwheel(value: Boolean): Self = StObject.set(x, "scrollwheel", value.asInstanceOf[js.Any])
    
    inline def setScrollwheelNull: Self = StObject.set(x, "scrollwheel", null)
    
    inline def setScrollwheelUndefined: Self = StObject.set(x, "scrollwheel", js.undefined)
    
    inline def setStreetView(value: StreetViewPanorama): Self = StObject.set(x, "streetView", value.asInstanceOf[js.Any])
    
    inline def setStreetViewControl(value: Boolean): Self = StObject.set(x, "streetViewControl", value.asInstanceOf[js.Any])
    
    inline def setStreetViewControlNull: Self = StObject.set(x, "streetViewControl", null)
    
    inline def setStreetViewControlOptions(value: StreetViewControlOptions): Self = StObject.set(x, "streetViewControlOptions", value.asInstanceOf[js.Any])
    
    inline def setStreetViewControlOptionsNull: Self = StObject.set(x, "streetViewControlOptions", null)
    
    inline def setStreetViewControlOptionsUndefined: Self = StObject.set(x, "streetViewControlOptions", js.undefined)
    
    inline def setStreetViewControlUndefined: Self = StObject.set(x, "streetViewControl", js.undefined)
    
    inline def setStreetViewNull: Self = StObject.set(x, "streetView", null)
    
    inline def setStreetViewUndefined: Self = StObject.set(x, "streetView", js.undefined)
    
    inline def setStyles(value: js.Array[MapTypeStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesNull: Self = StObject.set(x, "styles", null)
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: MapTypeStyle*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setTiltNull: Self = StObject.set(x, "tilt", null)
    
    inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomControl(value: Boolean): Self = StObject.set(x, "zoomControl", value.asInstanceOf[js.Any])
    
    inline def setZoomControlNull: Self = StObject.set(x, "zoomControl", null)
    
    inline def setZoomControlOptions(value: ZoomControlOptions): Self = StObject.set(x, "zoomControlOptions", value.asInstanceOf[js.Any])
    
    inline def setZoomControlOptionsNull: Self = StObject.set(x, "zoomControlOptions", null)
    
    inline def setZoomControlOptionsUndefined: Self = StObject.set(x, "zoomControlOptions", js.undefined)
    
    inline def setZoomControlUndefined: Self = StObject.set(x, "zoomControl", js.undefined)
    
    inline def setZoomNull: Self = StObject.set(x, "zoom", null)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
