package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.PolylineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.Polyline")
@js.native
/**
  * A polyline is a linear overlay of connected line segments on the map.
  *
  * Access by calling `const {Polyline} = await
  * google.maps.importLibrary("maps")`. See
  * https://developers.google.com/maps/documentation/javascript/libraries.
  */
open class Polyline ()
  extends StObject
     with typings.googleMaps.google.maps.Polyline {
  def this(opts: PolylineOptions) = this()
}
