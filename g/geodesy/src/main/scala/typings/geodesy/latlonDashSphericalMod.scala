package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.geodesyMod.Dp
import typings.geodesy.geodesyMod.Format
import typings.geodesy.geodesyMod.GeoJSON
import typings.geodesy.geodesyMod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy/latlon-spherical", JSImport.Namespace)
@js.native
object latlonDashSphericalMod extends js.Object {
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  class Dms ()
    extends typings.geodesy.dmsMod.default
  
  @js.native
  trait LatLonSpherical extends js.Object {
    def alongTrackDistanceTo(pathStart: LatLonSpherical, pathEnd: LatLonSpherical): Double = js.native
    def alongTrackDistanceTo(pathStart: LatLonSpherical, pathEnd: LatLonSpherical, radius: Double): Double = js.native
    def crossTrackDistanceTo(pathStart: LatLonSpherical, pathEnd: LatLonSpherical): Double = js.native
    def crossTrackDistanceTo(pathStart: LatLonSpherical, pathEnd: LatLonSpherical, radius: Double): Double = js.native
    def destinationPoint(distance: Double, bearing: Double): LatLonSpherical = js.native
    def destinationPoint(distance: Double, bearing: Double, radius: Double): LatLonSpherical = js.native
    def distanceTo(point: LatLonSpherical): Double = js.native
    def distanceTo(point: LatLonSpherical, radius: Double): Double = js.native
    def equals(point: LatLonSpherical): Boolean = js.native
    def finalBearingTo(point: LatLonSpherical): Double = js.native
    def initialBearingTo(point: LatLonSpherical): Double = js.native
    def intermediatePointTo(point: LatLonSpherical, fraction: Double): LatLonSpherical = js.native
    def lat(): Double = js.native
    def lat(lat: Double): js.Any = js.native
    def latitude(): Double = js.native
    def latitude(lat: Double): js.Any = js.native
    def lng(): Double = js.native
    def lng(lon: Double): js.Any = js.native
    def lon(): Double = js.native
    def lon(lon: Double): js.Any = js.native
    def longitude(): Double = js.native
    def longitude(lon: Double): js.Any = js.native
    def maxLatitude(bearing: Double): Double = js.native
    def midpointTo(point: LatLonSpherical): LatLonSpherical = js.native
    def rhumbBearingTo(point: LatLonSpherical): Double = js.native
    def rhumbDestinationPoint(distance: Double, bearing: Double): LatLonSpherical = js.native
    def rhumbDestinationPoint(distance: Double, bearing: Double, radius: Double): LatLonSpherical = js.native
    def rhumbDistanceTo(point: LatLonSpherical): Double = js.native
    def rhumbDistanceTo(point: LatLonSpherical, radius: Double): Double = js.native
    def rhumbMidpointTo(point: LatLonSpherical): LatLonSpherical = js.native
    def toGeoJSON(): GeoJSON = js.native
    def toString(format: Format): String = js.native
    def toString(format: Format, dp: Dp): String = js.native
  }
  
  @js.native
  class default protected () extends LatLonSpherical {
    def this(lat: Double, lon: Double) = this()
  }
  
  /* static members */
  @js.native
  object Dms extends js.Object {
    def compassPoint(bearing: Double): String = js.native
    def compassPoint(bearing: Double, precision: Precision): String = js.native
    def fromLocale(str: String): String = js.native
    def parse(dms: String): Double = js.native
    def parse(dms: Double): Double = js.native
    def separator(): String = js.native
    def separator(char: String): js.Any = js.native
    def toBrng(deg: Double): String = js.native
    def toBrng(deg: Double, format: Format): String = js.native
    def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
    def toDms(deg: Double): String = js.native
    def toDms(deg: Double, format: Format): String = js.native
    def toDms(deg: Double, format: Format, dp: Dp): String = js.native
    def toLat(deg: Double): String = js.native
    def toLat(deg: Double, format: Format): String = js.native
    def toLat(deg: Double, format: Format, dp: Dp): String = js.native
    def toLocale(str: String): String = js.native
    def toLon(deg: Double): String = js.native
    def toLon(deg: Double, format: Format): String = js.native
    def toLon(deg: Double, format: Format, dp: Dp): String = js.native
    def wrap360(degrees: Double): String = js.native
    def wrap90(degrees: Double): String = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def areaOf(polygon: Polygon[LatLonSpherical]): Double = js.native
    def areaOf(polygon: Polygon[LatLonSpherical], radius: Double): Double = js.native
    def crossingParallels(point1: LatLonSpherical, point2: LatLonSpherical, latitude: Double): Anon_Lon1 | Null = js.native
    def intersection(p1: LatLonSpherical, brng1: Double, p2: LatLonSpherical, brng2: Double): LatLonSpherical | Null = js.native
    def metresToKm(): Double = js.native
    def metresToMiles(): Double = js.native
    def metresToNauticalMiles(): Double = js.native
    def parse(lat: String): LatLonSpherical = js.native
    def parse(lat: String, lon: Double): LatLonSpherical = js.native
    def parse(lat: js.Object): LatLonSpherical = js.native
    def parse(lat: js.Object, lon: Double): LatLonSpherical = js.native
    def parse(lat: Double): LatLonSpherical = js.native
    def parse(lat: Double, lon: Double): LatLonSpherical = js.native
  }
  
}

