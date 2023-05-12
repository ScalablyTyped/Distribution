package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapCanvasProjection extends StObject {
  
  /**
    * Computes the geographical coordinates from pixel coordinates in the
    * map&#39;s container.
    */
  def fromContainerPixelToLatLng(): LatLng | Null = js.native
  def fromContainerPixelToLatLng(pixel: Null, noClampNoWrap: Boolean): LatLng | Null = js.native
  def fromContainerPixelToLatLng(pixel: Point): LatLng | Null = js.native
  def fromContainerPixelToLatLng(pixel: Point, noClampNoWrap: Boolean): LatLng | Null = js.native
  
  /**
    * Computes the geographical coordinates from pixel coordinates in the div
    * that holds the draggable map.
    */
  def fromDivPixelToLatLng(): LatLng | Null = js.native
  def fromDivPixelToLatLng(pixel: Null, noClampNoWrap: Boolean): LatLng | Null = js.native
  def fromDivPixelToLatLng(pixel: Point): LatLng | Null = js.native
  def fromDivPixelToLatLng(pixel: Point, noClampNoWrap: Boolean): LatLng | Null = js.native
  
  /**
    * Computes the pixel coordinates of the given geographical location in the
    * map&#39;s container element.
    */
  def fromLatLngToContainerPixel(latLng: LatLng): Point | Null = js.native
  def fromLatLngToContainerPixel(latLng: LatLngLiteral): Point | Null = js.native
  
  /**
    * Computes the pixel coordinates of the given geographical location in the
    * DOM element that holds the draggable map.
    */
  def fromLatLngToDivPixel(): Point | Null = js.native
  def fromLatLngToDivPixel(latLng: LatLng): Point | Null = js.native
  def fromLatLngToDivPixel(latLng: LatLngLiteral): Point | Null = js.native
  
  /**
    * The visible region of the map. Returns <code>null</code> if the map has
    * no size. Returns <code>null</code> if the OverlayView is on a
    * StreetViewPanorama.
    */
  def getVisibleRegion(): VisibleRegion | Null = js.native
  
  /**
    * The width of the world in pixels in the current zoom level. For
    * projections with a heading angle of either 90 or 270 degrees, this
    * corresponds to the pixel span in the Y-axis.
    */
  def getWorldWidth(): Double = js.native
}
