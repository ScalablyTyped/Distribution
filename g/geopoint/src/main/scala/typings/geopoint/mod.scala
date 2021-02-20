package typings.geopoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geopoint", JSImport.Namespace)
  @js.native
  class ^ protected () extends GeoPoint {
    def this(lat: Double, lon: Double) = this()
    def this(lat: Double, lon: Double, inRadians: Boolean) = this()
  }
  
  /* static member */
  @JSImport("geopoint", "degreesToRadians")
  @js.native
  def degreesToRadians(value: Double): Double = js.native
  
  /* static member */
  @JSImport("geopoint", "kilometersToMiles")
  @js.native
  def kilometersToMiles(value: Double): Double = js.native
  
  /* static member */
  @JSImport("geopoint", "milesToKilometers")
  @js.native
  def milesToKilometers(value: Double): Double = js.native
  
  /* static member */
  @JSImport("geopoint", "radiansToDegrees")
  @js.native
  def radiansToDegrees(value: Double): Double = js.native
  
  @js.native
  trait GeoPoint extends StObject {
    
    def boundingCoordinates(distance: Double): js.Tuple2[GeoPoint, GeoPoint] = js.native
    def boundingCoordinates(distance: Double, radius: js.UndefOr[scala.Nothing], inKilometers: Boolean): js.Tuple2[GeoPoint, GeoPoint] = js.native
    def boundingCoordinates(distance: Double, radius: Double): js.Tuple2[GeoPoint, GeoPoint] = js.native
    def boundingCoordinates(distance: Double, radius: Double, inKilometers: Boolean): js.Tuple2[GeoPoint, GeoPoint] = js.native
    
    def distanceTo(point: GeoPoint): Double = js.native
    def distanceTo(point: GeoPoint, inKilometers: Boolean): Double = js.native
    
    def latitude(): Double = js.native
    def latitude(inRadians: Boolean): Double = js.native
    
    def longitude(): Double = js.native
    def longitude(inRadians: Boolean): Double = js.native
  }
}
