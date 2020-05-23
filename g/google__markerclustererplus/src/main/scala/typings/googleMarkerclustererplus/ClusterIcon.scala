package typings.googleMarkerclustererplus

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.OverlayView
import typings.googlemaps.google.maps.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterIcon extends OverlayView {
  /**
    * Creates the cssText style parameter based on the position of the icon.
    *
    * @param pos The position of the icon.
    * @return The CSS style text.
    */
  def createCss(pos: Point): java.lang.String = js.native
  /**
    * Returns the position at which to place the DIV depending on the latlng.
    *
    * @param latLng The position in latlng.
    * @return The position in pixels.
    */
  def getPosFromLatLng_(latLng: LatLng): Point = js.native
  /**
    * Hides the icon.
    */
  def hide(): Unit = js.native
  /**
    * Sets the position at which to center the icon.
    *
    * @param center The latlng to set as the center.
    */
  def setCenter(center: LatLng): Unit = js.native
  /**
    * Positions and shows the icon.
    */
  def show(): Unit = js.native
  /**
    * Sets the icon styles to the appropriate element in the styles array.
    *
    * @param style The icon label text and styles index.
    */
  def useStyle(style: ClusterIconInfo): Unit = js.native
}

