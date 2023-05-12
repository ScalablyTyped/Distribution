package typings.googleMaps.google.maps

import typings.googleMaps.google.maps.marker.AdvancedMarkerElement
import typings.std.Element
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoWindow
  extends StObject
     with MVCObject {
  
  /**
    * Closes this InfoWindow by removing it from the DOM structure.
    */
  def close(): Unit = js.native
  
  /**
    * Sets focus on this <code>InfoWindow</code>. You may wish to consider
    * using this method along with a <code>visible</code> event to make sure
    * that <code>InfoWindow</code> is visible before setting focus on it. An
    * <code>InfoWindow</code> that is not visible cannot be focused.
    */
  def focus(): Unit = js.native
  
  def getContent(): js.UndefOr[String | Element | Null | Text] = js.native
  
  def getPosition(): js.UndefOr[LatLng | Null] = js.native
  
  def getZIndex(): Double = js.native
  
  /**
    * Opens this InfoWindow on the given map. Optionally, an InfoWindow can be
    * associated with an anchor. In the core API, the only anchor is the Marker
    * class. However, an anchor can be any MVCObject that exposes a LatLng
    * <code>position</code> property and optionally a Point
    * <code>anchorPoint</code> property for calculating the
    * <code>pixelOffset</code> (see InfoWindowOptions). The
    * <code>anchorPoint</code> is the offset from the anchor&#39;s position to
    * the tip of the InfoWindow. It is recommended to use the {@link
    * google.maps.InfoWindowOpenOptions} interface as the single argument for
    * this method. To prevent changing browser focus on open, set {@link
    * google.maps.InfoWindowOpenOptions.shouldFocus} to <code>false</code>.
    * @param options Either an InfoWindowOpenOptions object (recommended) or
    *     the map|panorama on which to render this InfoWindow.
    * @param anchor The anchor to which this InfoWindow will be positioned. If
    *     the anchor is non-null, the InfoWindow will be positioned at the
    *     top-center of the anchor. The InfoWindow will be rendered on the same
    *     map or panorama as the anchor <strong>(when available)</strong>.
    */
  def open(): Unit = js.native
  def open(options: Null, anchor: MVCObject): Unit = js.native
  def open(options: Null, anchor: AdvancedMarkerElement): Unit = js.native
  def open(options: Unit, anchor: MVCObject): Unit = js.native
  def open(options: Unit, anchor: AdvancedMarkerElement): Unit = js.native
  def open(options: InfoWindowOpenOptions): Unit = js.native
  def open(options: InfoWindowOpenOptions, anchor: MVCObject): Unit = js.native
  def open(options: InfoWindowOpenOptions, anchor: AdvancedMarkerElement): Unit = js.native
  def open(options: Map): Unit = js.native
  def open(options: Map, anchor: MVCObject): Unit = js.native
  def open(options: Map, anchor: AdvancedMarkerElement): Unit = js.native
  def open(options: StreetViewPanorama): Unit = js.native
  def open(options: StreetViewPanorama, anchor: MVCObject): Unit = js.native
  def open(options: StreetViewPanorama, anchor: AdvancedMarkerElement): Unit = js.native
  
  def setContent(): Unit = js.native
  def setContent(content: String): Unit = js.native
  def setContent(content: Element): Unit = js.native
  def setContent(content: Text): Unit = js.native
  
  def setOptions(): Unit = js.native
  def setOptions(options: InfoWindowOptions): Unit = js.native
  
  def setPosition(): Unit = js.native
  def setPosition(position: LatLng): Unit = js.native
  def setPosition(position: LatLngLiteral): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
