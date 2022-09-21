package typings.geopoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geopoint", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GeoPoint {
    def this(lat: Double, lon: Double) = this()
    def this(lat: Double, lon: Double, inRadians: Boolean) = this()
  }
  @JSImport("geopoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def degreesToRadians(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degreesToRadians")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def kilometersToMiles(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("kilometersToMiles")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def milesToKilometers(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("milesToKilometers")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def radiansToDegrees(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("radiansToDegrees")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @js.native
  trait GeoPoint extends StObject {
    
    def boundingCoordinates(distance: Double): js.Tuple2[GeoPoint, GeoPoint] = js.native
    def boundingCoordinates(distance: Double, radius: Double): js.Tuple2[GeoPoint, GeoPoint] = js.native
    def boundingCoordinates(distance: Double, radius: Double, inKilometers: Boolean): js.Tuple2[GeoPoint, GeoPoint] = js.native
    def boundingCoordinates(distance: Double, radius: Unit, inKilometers: Boolean): js.Tuple2[GeoPoint, GeoPoint] = js.native
    
    def distanceTo(point: GeoPoint): Double = js.native
    def distanceTo(point: GeoPoint, inKilometers: Boolean): Double = js.native
    
    def latitude(): Double = js.native
    def latitude(inRadians: Boolean): Double = js.native
    
    def longitude(): Double = js.native
    def longitude(inRadians: Boolean): Double = js.native
  }
}
