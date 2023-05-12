package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.PolygonOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.Polygon")
@js.native
/**
  * A polygon (like a polyline) defines a series of connected coordinates in
  * an ordered sequence. Additionally, polygons form a closed loop and define
  * a filled region. See the samples in the developer&#39;s guide, starting
  * with a <a
  * href="https://developers.google.com/maps/documentation/javascript/examples/polygon-simple">simple
  * polygon</a>, a <a
  * href="https://developers.google.com/maps/documentation/javascript/examples/polygon-hole">polygon
  * with a hole</a>, and more. Note that you can also use the <a
  * href="#Data.Polygon">Data layer</a> to create a polygon. The Data layer
  * offers a simpler way of creating holes because it handles the order of
  * the inner and outer paths for you.
  *
  * Access by calling `const {Polygon} = await
  * google.maps.importLibrary("maps")`. See
  * https://developers.google.com/maps/documentation/javascript/libraries.
  */
open class Polygon ()
  extends StObject
     with typings.googleMaps.google.maps.Polygon {
  def this(opts: PolygonOptions) = this()
}
