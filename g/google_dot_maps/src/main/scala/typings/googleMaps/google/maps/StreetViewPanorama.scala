package typings.googleMaps.google.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewPanorama
  extends StObject
     with MVCObject {
  
  /**
    * Additional controls to attach to the panorama. To add a control to the
    * panorama, add the control&#39;s <code>&lt;div&gt;</code> to the
    * <code>MVCArray</code> corresponding to the {@link
    * google.maps.ControlPosition} where it should be rendered.
    */
  var controls: js.Array[MVCArray[HTMLElement]] = js.native
  
  /**
    * Sets focus on this <code>StreetViewPanorama</code>. You may wish to
    * consider using this method along with a <code>visible_changed</code>
    * event to make sure that <code>StreetViewPanorama</code> is visible before
    * setting focus on it. A <code>StreetViewPanorama</code> that is not
    * visible cannot be focused.
    */
  def focus(): Unit = js.native
  
  /**
    * Returns the set of navigation links for the Street View panorama.
    */
  def getLinks(): (js.Array[StreetViewLink | Null]) | Null = js.native
  
  /**
    * Returns the StreetViewLocation of the current panorama.
    */
  def getLocation(): StreetViewLocation | Null = js.native
  
  /**
    * Returns the state of motion tracker. If <code>true</code> when the user
    * physically moves the device and the browser supports it, the Street View
    * Panorama tracks the physical movements.
    */
  def getMotionTracking(): Boolean = js.native
  
  /**
    * Returns the current panorama ID for the Street View panorama. This id is
    * stable within the browser&#39;s current session only.
    */
  def getPano(): String = js.native
  
  /**
    * Returns the heading and pitch of the photographer when this panorama was
    * taken. For Street View panoramas on the road, this also reveals in which
    * direction the car was travelling. This data is available after the
    * <code>pano_changed</code> event.
    */
  def getPhotographerPov(): StreetViewPov = js.native
  
  /**
    * Returns the current <code>LatLng</code> position for the Street View
    * panorama.
    */
  def getPosition(): LatLng | Null = js.native
  
  /**
    * Returns the current point of view for the Street View panorama.
    */
  def getPov(): StreetViewPov = js.native
  
  /**
    * Returns the status of the panorama on completion of the
    * <code>setPosition()</code> or <code>setPano()</code> request.
    */
  def getStatus(): StreetViewStatus = js.native
  
  /**
    * Returns <code>true</code> if the panorama is visible. It does not specify
    * whether Street View imagery is available at the specified position.
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Returns the zoom level of the panorama. Fully zoomed-out is level 0,
    * where the field of view is 180 degrees. Zooming in increases the zoom
    * level.
    */
  def getZoom(): Double = js.native
  
  /**
    * Set the custom panorama provider called on pano change to load custom
    * panoramas.
    */
  def registerPanoProvider(provider: js.Function1[/* a */ String, StreetViewPanoramaData | Null]): Unit = js.native
  def registerPanoProvider(
    provider: js.Function1[/* a */ String, StreetViewPanoramaData | Null],
    opt_options: PanoProviderOptions
  ): Unit = js.native
  
  /**
    * Sets the set of navigation links for the Street View panorama.
    */
  def setLinks(): Unit = js.native
  def setLinks(links: js.Array[StreetViewLink | Null]): Unit = js.native
  
  /**
    * Sets the state of motion tracker. If <code>true</code> when the user
    * physically moves the device and the browser supports it, the Street View
    * Panorama tracks the physical movements.
    */
  def setMotionTracking(motionTracking: Boolean): Unit = js.native
  
  /**
    * Sets a collection of key-value pairs.
    */
  def setOptions(): Unit = js.native
  def setOptions(options: StreetViewPanoramaOptions): Unit = js.native
  
  /**
    * Sets the current panorama ID for the Street View panorama.
    */
  def setPano(pano: String): Unit = js.native
  
  /**
    * Sets the current <code>LatLng</code> position for the Street View
    * panorama.
    */
  def setPosition(): Unit = js.native
  def setPosition(latLng: LatLng): Unit = js.native
  def setPosition(latLng: LatLngLiteral): Unit = js.native
  
  /**
    * Sets the point of view for the Street View panorama.
    */
  def setPov(pov: StreetViewPov): Unit = js.native
  
  /**
    * Sets to <code>true</code> to make the panorama visible. If set to
    * <code>false</code>, the panorama will be hidden whether it is embedded in
    * the map or in its own <code>&lt;div&gt;</code>.
    */
  def setVisible(flag: Boolean): Unit = js.native
  
  /**
    * Sets the zoom level of the panorama. Fully zoomed-out is level 0, where
    * the field of view is 180 degrees. Zooming in increases the zoom level.
    */
  def setZoom(zoom: Double): Unit = js.native
}
