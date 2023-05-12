package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetViewPanoramaOptions extends StObject {
  
  /**
    * The enabled/disabled state of the address control.
    */
  var addressControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The display options for the address control.
    */
  var addressControlOptions: js.UndefOr[StreetViewAddressControlOptions | Null] = js.undefined
  
  /**
    * The enabled/disabled state of click-to-go. Not applicable to custom
    * panoramas.
    * @defaultValue <code>true</code>
    */
  var clickToGo: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Size in pixels of the controls appearing on the panorama. This value must
    * be supplied directly when creating the Panorama, updating this value
    * later may bring the controls into an undefined state. Only governs the
    * controls made by the Maps API itself. Does not scale developer created
    * custom controls.
    */
  var controlSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Enables/disables all default UI. May be overridden individually.
    */
  var disableDefaultUI: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enables/disables zoom on double click.
    * @defaultValue <code>true</code>
    */
  var disableDoubleClickZoom: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If <code>true</code>, the close button is displayed.
    * @defaultValue <code>false</code>
    */
  var enableCloseButton: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The enabled/disabled state of the fullscreen control.
    */
  var fullscreenControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The display options for the fullscreen control.
    */
  var fullscreenControlOptions: js.UndefOr[FullscreenControlOptions | Null] = js.undefined
  
  /**
    * The enabled/disabled state of the imagery acquisition date control.
    * Disabled by default.
    */
  var imageDateControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The enabled/disabled state of the links control.
    */
  var linksControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether motion tracking is on or off. Enabled by default when the motion
    * tracking control is present and permission is granted by a user or not
    * required, so that the POV (point of view) follows the orientation of the
    * device. This is primarily applicable to mobile devices. If
    * <code>motionTracking</code> is set to <code>false</code> while
    * <code>motionTrackingControl</code> is enabled, the motion tracking
    * control appears but tracking is off. The user can tap the motion tracking
    * control to toggle this option. If <code>motionTracking</code> is set to
    * <code>true</code> while permission is required but not yet requested, the
    * motion tracking control appears but tracking is off. The user can tap the
    * motion tracking control to request permission. If
    * <code>motionTracking</code> is set to <code>true</code> while permission
    * is denied by a user, the motion tracking control appears disabled with
    * tracking turned off.
    */
  var motionTracking: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The enabled/disabled state of the motion tracking control. Enabled by
    * default when the device has motion data, so that the control appears on
    * the map. This is primarily applicable to mobile devices.
    */
  var motionTrackingControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The display options for the motion tracking control.
    */
  var motionTrackingControlOptions: js.UndefOr[MotionTrackingControlOptions | Null] = js.undefined
  
  /**
    * The enabled/disabled state of the pan control.
    */
  var panControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The display options for the pan control.
    */
  var panControlOptions: js.UndefOr[PanControlOptions | Null] = js.undefined
  
  /**
    * The panorama ID, which should be set when specifying a custom panorama.
    */
  var pano: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The <code>LatLng</code> position of the Street View panorama.
    */
  var position: js.UndefOr[LatLng | Null | LatLngLiteral] = js.undefined
  
  /**
    * The camera orientation, specified as heading and pitch, for the panorama.
    */
  var pov: js.UndefOr[StreetViewPov | Null] = js.undefined
  
  /**
    * If <code>false</code>, disables scrollwheel zooming in Street View.
    * @defaultValue <code>true</code>
    */
  var scrollwheel: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The display of street names on the panorama. If this value is not
    * specified, or is set to <code>true</code>, street names are displayed on
    * the panorama. If set to <code>false</code>, street names are not
    * displayed.
    * @defaultValue <code>true</code>
    */
  var showRoadLabels: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If <code>true</code>, the Street View panorama is visible on load.
    */
  var visible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The zoom of the panorama, specified as a number. A zoom of 0 gives a 180
    * degrees Field of View.
    */
  var zoom: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The enabled/disabled state of the zoom control.
    */
  var zoomControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The display options for the zoom control.
    */
  var zoomControlOptions: js.UndefOr[ZoomControlOptions | Null] = js.undefined
}
object StreetViewPanoramaOptions {
  
  inline def apply(): StreetViewPanoramaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewPanoramaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreetViewPanoramaOptions] (val x: Self) extends AnyVal {
    
    inline def setAddressControl(value: Boolean): Self = StObject.set(x, "addressControl", value.asInstanceOf[js.Any])
    
    inline def setAddressControlNull: Self = StObject.set(x, "addressControl", null)
    
    inline def setAddressControlOptions(value: StreetViewAddressControlOptions): Self = StObject.set(x, "addressControlOptions", value.asInstanceOf[js.Any])
    
    inline def setAddressControlOptionsNull: Self = StObject.set(x, "addressControlOptions", null)
    
    inline def setAddressControlOptionsUndefined: Self = StObject.set(x, "addressControlOptions", js.undefined)
    
    inline def setAddressControlUndefined: Self = StObject.set(x, "addressControl", js.undefined)
    
    inline def setClickToGo(value: Boolean): Self = StObject.set(x, "clickToGo", value.asInstanceOf[js.Any])
    
    inline def setClickToGoNull: Self = StObject.set(x, "clickToGo", null)
    
    inline def setClickToGoUndefined: Self = StObject.set(x, "clickToGo", js.undefined)
    
    inline def setControlSize(value: Double): Self = StObject.set(x, "controlSize", value.asInstanceOf[js.Any])
    
    inline def setControlSizeNull: Self = StObject.set(x, "controlSize", null)
    
    inline def setControlSizeUndefined: Self = StObject.set(x, "controlSize", js.undefined)
    
    inline def setDisableDefaultUI(value: Boolean): Self = StObject.set(x, "disableDefaultUI", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultUINull: Self = StObject.set(x, "disableDefaultUI", null)
    
    inline def setDisableDefaultUIUndefined: Self = StObject.set(x, "disableDefaultUI", js.undefined)
    
    inline def setDisableDoubleClickZoom(value: Boolean): Self = StObject.set(x, "disableDoubleClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDisableDoubleClickZoomNull: Self = StObject.set(x, "disableDoubleClickZoom", null)
    
    inline def setDisableDoubleClickZoomUndefined: Self = StObject.set(x, "disableDoubleClickZoom", js.undefined)
    
    inline def setEnableCloseButton(value: Boolean): Self = StObject.set(x, "enableCloseButton", value.asInstanceOf[js.Any])
    
    inline def setEnableCloseButtonNull: Self = StObject.set(x, "enableCloseButton", null)
    
    inline def setEnableCloseButtonUndefined: Self = StObject.set(x, "enableCloseButton", js.undefined)
    
    inline def setFullscreenControl(value: Boolean): Self = StObject.set(x, "fullscreenControl", value.asInstanceOf[js.Any])
    
    inline def setFullscreenControlNull: Self = StObject.set(x, "fullscreenControl", null)
    
    inline def setFullscreenControlOptions(value: FullscreenControlOptions): Self = StObject.set(x, "fullscreenControlOptions", value.asInstanceOf[js.Any])
    
    inline def setFullscreenControlOptionsNull: Self = StObject.set(x, "fullscreenControlOptions", null)
    
    inline def setFullscreenControlOptionsUndefined: Self = StObject.set(x, "fullscreenControlOptions", js.undefined)
    
    inline def setFullscreenControlUndefined: Self = StObject.set(x, "fullscreenControl", js.undefined)
    
    inline def setImageDateControl(value: Boolean): Self = StObject.set(x, "imageDateControl", value.asInstanceOf[js.Any])
    
    inline def setImageDateControlNull: Self = StObject.set(x, "imageDateControl", null)
    
    inline def setImageDateControlUndefined: Self = StObject.set(x, "imageDateControl", js.undefined)
    
    inline def setLinksControl(value: Boolean): Self = StObject.set(x, "linksControl", value.asInstanceOf[js.Any])
    
    inline def setLinksControlNull: Self = StObject.set(x, "linksControl", null)
    
    inline def setLinksControlUndefined: Self = StObject.set(x, "linksControl", js.undefined)
    
    inline def setMotionTracking(value: Boolean): Self = StObject.set(x, "motionTracking", value.asInstanceOf[js.Any])
    
    inline def setMotionTrackingControl(value: Boolean): Self = StObject.set(x, "motionTrackingControl", value.asInstanceOf[js.Any])
    
    inline def setMotionTrackingControlNull: Self = StObject.set(x, "motionTrackingControl", null)
    
    inline def setMotionTrackingControlOptions(value: MotionTrackingControlOptions): Self = StObject.set(x, "motionTrackingControlOptions", value.asInstanceOf[js.Any])
    
    inline def setMotionTrackingControlOptionsNull: Self = StObject.set(x, "motionTrackingControlOptions", null)
    
    inline def setMotionTrackingControlOptionsUndefined: Self = StObject.set(x, "motionTrackingControlOptions", js.undefined)
    
    inline def setMotionTrackingControlUndefined: Self = StObject.set(x, "motionTrackingControl", js.undefined)
    
    inline def setMotionTrackingNull: Self = StObject.set(x, "motionTracking", null)
    
    inline def setMotionTrackingUndefined: Self = StObject.set(x, "motionTracking", js.undefined)
    
    inline def setPanControl(value: Boolean): Self = StObject.set(x, "panControl", value.asInstanceOf[js.Any])
    
    inline def setPanControlNull: Self = StObject.set(x, "panControl", null)
    
    inline def setPanControlOptions(value: PanControlOptions): Self = StObject.set(x, "panControlOptions", value.asInstanceOf[js.Any])
    
    inline def setPanControlOptionsNull: Self = StObject.set(x, "panControlOptions", null)
    
    inline def setPanControlOptionsUndefined: Self = StObject.set(x, "panControlOptions", js.undefined)
    
    inline def setPanControlUndefined: Self = StObject.set(x, "panControl", js.undefined)
    
    inline def setPano(value: String): Self = StObject.set(x, "pano", value.asInstanceOf[js.Any])
    
    inline def setPanoNull: Self = StObject.set(x, "pano", null)
    
    inline def setPanoUndefined: Self = StObject.set(x, "pano", js.undefined)
    
    inline def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPov(value: StreetViewPov): Self = StObject.set(x, "pov", value.asInstanceOf[js.Any])
    
    inline def setPovNull: Self = StObject.set(x, "pov", null)
    
    inline def setPovUndefined: Self = StObject.set(x, "pov", js.undefined)
    
    inline def setScrollwheel(value: Boolean): Self = StObject.set(x, "scrollwheel", value.asInstanceOf[js.Any])
    
    inline def setScrollwheelNull: Self = StObject.set(x, "scrollwheel", null)
    
    inline def setScrollwheelUndefined: Self = StObject.set(x, "scrollwheel", js.undefined)
    
    inline def setShowRoadLabels(value: Boolean): Self = StObject.set(x, "showRoadLabels", value.asInstanceOf[js.Any])
    
    inline def setShowRoadLabelsNull: Self = StObject.set(x, "showRoadLabels", null)
    
    inline def setShowRoadLabelsUndefined: Self = StObject.set(x, "showRoadLabels", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleNull: Self = StObject.set(x, "visible", null)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
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
