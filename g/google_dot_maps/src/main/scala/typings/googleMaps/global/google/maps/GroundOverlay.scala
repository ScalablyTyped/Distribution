package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.GroundOverlayOptions
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rectangular image overlay on the map.
  */
@JSGlobal("google.maps.GroundOverlay")
@js.native
open class GroundOverlay protected ()
  extends StObject
     with typings.googleMaps.google.maps.GroundOverlay {
  /**
    * A rectangular image overlay on the map.
    */
  def this(url: String) = this()
  def this(url: String, bounds: typings.googleMaps.google.maps.LatLngBounds) = this()
  def this(url: String, bounds: LatLngBoundsLiteral) = this()
  def this(url: String, bounds: Null, opts: GroundOverlayOptions) = this()
  def this(url: String, bounds: LatLngBoundsLiteral, opts: GroundOverlayOptions) = this()
  def this(url: String, bounds: typings.googleMaps.google.maps.LatLngBounds, opts: GroundOverlayOptions) = this()
}
