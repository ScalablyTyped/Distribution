package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.LatLngBoundsLiteral
import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.LatLngBounds")
@js.native
/**
  * A <code><a href="#LatLngBounds">LatLngBounds</a></code> instance
  * represents a rectangle in geographical coordinates, including one that
  * crosses the 180 degrees longitudinal meridian.
  *
  * Access by calling `const {LatLngBounds} = await
  * google.maps.importLibrary("core")`. See
  * https://developers.google.com/maps/documentation/javascript/libraries.
  */
open class LatLngBounds ()
  extends StObject
     with typings.googleMaps.google.maps.LatLngBounds {
  def this(swOrLatLngBounds: typings.googleMaps.google.maps.LatLng) = this()
  def this(swOrLatLngBounds: typings.googleMaps.google.maps.LatLngBounds) = this()
  def this(swOrLatLngBounds: LatLngBoundsLiteral) = this()
  def this(swOrLatLngBounds: LatLngLiteral) = this()
  def this(swOrLatLngBounds: Null, ne: typings.googleMaps.google.maps.LatLng) = this()
  def this(swOrLatLngBounds: Null, ne: LatLngLiteral) = this()
  def this(swOrLatLngBounds: Unit, ne: typings.googleMaps.google.maps.LatLng) = this()
  def this(swOrLatLngBounds: Unit, ne: LatLngLiteral) = this()
  def this(swOrLatLngBounds: LatLngBoundsLiteral, ne: typings.googleMaps.google.maps.LatLng) = this()
  def this(swOrLatLngBounds: LatLngBoundsLiteral, ne: LatLngLiteral) = this()
  def this(
    swOrLatLngBounds: typings.googleMaps.google.maps.LatLngBounds,
    ne: typings.googleMaps.google.maps.LatLng
  ) = this()
  def this(swOrLatLngBounds: typings.googleMaps.google.maps.LatLngBounds, ne: LatLngLiteral) = this()
  def this(swOrLatLngBounds: LatLngLiteral, ne: typings.googleMaps.google.maps.LatLng) = this()
  def this(swOrLatLngBounds: LatLngLiteral, ne: LatLngLiteral) = this()
  def this(swOrLatLngBounds: typings.googleMaps.google.maps.LatLng, ne: typings.googleMaps.google.maps.LatLng) = this()
  def this(swOrLatLngBounds: typings.googleMaps.google.maps.LatLng, ne: LatLngLiteral) = this()
}
/* static members */
object LatLngBounds {
  
  /**
    * LatLngBounds for the max bounds of the Earth. These bounds will encompass
    * the entire globe.
    */
  @JSGlobal("google.maps.LatLngBounds.MAX_BOUNDS")
  @js.native
  val MAX_BOUNDS: typings.googleMaps.google.maps.LatLngBounds = js.native
}
