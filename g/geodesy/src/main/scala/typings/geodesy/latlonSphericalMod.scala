package typings.geodesy

import typings.geodesy.anon.Lon1
import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import typings.geodesy.mod.GeoJSON
import typings.geodesy.mod.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latlonSphericalMod {
  
  @JSImport("geodesy/latlon-spherical", JSImport.Default)
  @js.native
  class default protected () extends LatLonSpherical {
    def this(lat: Double, lon: Double) = this()
  }
  object default {
    
    /* static member */
    @JSImport("geodesy/latlon-spherical", "default.areaOf")
    @js.native
    def areaOf(polygon: Polygon[LatLonSpherical]): Double = js.native
    @JSImport("geodesy/latlon-spherical", "default.areaOf")
    @js.native
    def areaOf(polygon: Polygon[LatLonSpherical], radius: Double): Double = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-spherical", "default.crossingParallels")
    @js.native
    def crossingParallels(point1: LatLonSpherical, point2: LatLonSpherical, latitude: Double): Lon1 | Null = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-spherical", "default.intersection")
    @js.native
    def intersection(p1: LatLonSpherical, brng1: Double, p2: LatLonSpherical, brng2: Double): LatLonSpherical | Null = js.native
    
    @JSImport("geodesy/latlon-spherical", "default.parse")
    @js.native
    def parse(lat: String): LatLonSpherical = js.native
    @JSImport("geodesy/latlon-spherical", "default.parse")
    @js.native
    def parse(lat: String, lon: Double): LatLonSpherical = js.native
    @JSImport("geodesy/latlon-spherical", "default.parse")
    @js.native
    def parse(lat: js.Object): LatLonSpherical = js.native
    @JSImport("geodesy/latlon-spherical", "default.parse")
    @js.native
    def parse(lat: js.Object, lon: Double): LatLonSpherical = js.native
    /* static member */
    @JSImport("geodesy/latlon-spherical", "default.parse")
    @js.native
    def parse(lat: Double): LatLonSpherical = js.native
    @JSImport("geodesy/latlon-spherical", "default.parse")
    @js.native
    def parse(lat: Double, lon: Double): LatLonSpherical = js.native
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/latlon-spherical", "Dms")
  @js.native
  class Dms ()
    extends typings.geodesy.dmsMod.default
  object Dms {
    
    /* static member */
    @JSImport("geodesy/latlon-spherical", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double): String = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double, precision: Precision): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-spherical", "Dms.fromLocale")
    @js.native
    def fromLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-spherical", "Dms.parse")
    @js.native
    def parse(dms: String): Double = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.parse")
    @js.native
    def parse(dms: Double): Double = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-spherical", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double): String = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-spherical", "Dms.toDms")
    @js.native
    def toDms(deg: Double): String = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-spherical", "Dms.toLat")
    @js.native
    def toLat(deg: Double): String = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-spherical", "Dms.toLocale")
    @js.native
    def toLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-spherical", "Dms.toLon")
    @js.native
    def toLon(deg: Double): String = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-spherical", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-spherical", "Dms.wrap360")
    @js.native
    def wrap360(degrees: Double): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-spherical", "Dms.wrap90")
    @js.native
    def wrap90(degrees: Double): String = js.native
  }
  
  @js.native
  trait LatLonSpherical extends StObject {
    
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
    
    def lat: Double = js.native
    def lat_=(lat: Double): Unit = js.native
    
    def latitude: Double = js.native
    def latitude_=(lat: Double): Unit = js.native
    
    def lng: Double = js.native
    def lng_=(lon: Double): Unit = js.native
    
    def lon: Double = js.native
    def lon_=(lon: Double): Unit = js.native
    
    def longitude: Double = js.native
    def longitude_=(lon: Double): Unit = js.native
    
    def maxLatitude(bearing: Double): Double = js.native
    
    def midpointTo(point: LatLonSpherical): LatLonSpherical = js.native
    
    def rhumbBearingTo(point: LatLonSpherical): Double = js.native
    
    def rhumbDestinationPoint(distance: Double, bearing: Double): LatLonSpherical = js.native
    def rhumbDestinationPoint(distance: Double, bearing: Double, radius: Double): LatLonSpherical = js.native
    
    def rhumbDistanceTo(point: LatLonSpherical): Double = js.native
    def rhumbDistanceTo(point: LatLonSpherical, radius: Double): Double = js.native
    
    def rhumbMidpointTo(point: LatLonSpherical): LatLonSpherical = js.native
    
    def toGeoJSON(): GeoJSON = js.native
    
    def toString(format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toString(format: Format): String = js.native
    def toString(format: Format, dp: Dp): String = js.native
  }
}
