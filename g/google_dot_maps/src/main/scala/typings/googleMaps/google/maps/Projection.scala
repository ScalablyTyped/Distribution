package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Projection extends StObject {
  
  /**
    * Translates from the LatLng cylinder to the Point plane. This interface
    * specifies a function which implements translation from given
    * <code>LatLng</code> values to world coordinates on the map projection.
    * The Maps API calls this method when it needs to plot locations on screen.
    * <code>Projection</code> objects must implement this method, but may
    * return <code>null</code> if the projection cannot calculate the
    * <code>Point</code>.
    */
  def fromLatLngToPoint(latLng: LatLng): Point | Null = js.native
  def fromLatLngToPoint(latLng: LatLngLiteral): Point | Null = js.native
  def fromLatLngToPoint(latLng: LatLngLiteral, point: Point): Point | Null = js.native
  def fromLatLngToPoint(latLng: LatLng, point: Point): Point | Null = js.native
  
  /**
    * This interface specifies a function which implements translation from
    * world coordinates on a map projection to <code>LatLng</code> values. The
    * Maps API calls this method when it needs to translate actions on screen
    * to positions on the map. <code>Projection</code> objects must implement
    * this method, but may return <code>null</code> if the projection cannot
    * calculate the <code>LatLng</code>.
    */
  def fromPointToLatLng(pixel: Point): LatLng | Null = js.native
  def fromPointToLatLng(pixel: Point, noClampNoWrap: Boolean): LatLng | Null = js.native
}
