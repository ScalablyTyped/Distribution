package typings.geodesy

import typings.geodesy.anon.Lon1
import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import typings.geodesy.mod.GeoJSON
import typings.geodesy.mod.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latlonSphericalMod {
  
  @JSImport("geodesy/latlon-spherical", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with LatLonSpherical {
    def this(lat: Double, lon: Double) = this()
  }
  object default {
    
    @JSImport("geodesy/latlon-spherical", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def areaOf(polygon: Polygon[LatLonSpherical]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("areaOf")(polygon.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def areaOf(polygon: Polygon[LatLonSpherical], radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("areaOf")(polygon.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* static member */
    inline def crossingParallels(point1: LatLonSpherical, point2: LatLonSpherical, latitude: Double): Lon1 | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("crossingParallels")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[Lon1 | Null]
    
    /* static member */
    inline def intersection(p1: LatLonSpherical, brng1: Double, p2: LatLonSpherical, brng2: Double): LatLonSpherical | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(p1.asInstanceOf[js.Any], brng1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], brng2.asInstanceOf[js.Any])).asInstanceOf[LatLonSpherical | Null]
    
    inline def parse(lat: String): LatLonSpherical = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any]).asInstanceOf[LatLonSpherical]
    inline def parse(lat: String, lon: Double): LatLonSpherical = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[LatLonSpherical]
    inline def parse(lat: js.Object): LatLonSpherical = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any]).asInstanceOf[LatLonSpherical]
    inline def parse(lat: js.Object, lon: Double): LatLonSpherical = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[LatLonSpherical]
    /* static member */
    inline def parse(lat: Double): LatLonSpherical = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any]).asInstanceOf[LatLonSpherical]
    inline def parse(lat: Double, lon: Double): LatLonSpherical = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[LatLonSpherical]
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/latlon-spherical", "Dms")
  @js.native
  class Dms ()
    extends typings.geodesy.dmsMod.default
  object Dms {
    
    @JSImport("geodesy/latlon-spherical", "Dms")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def compassPoint(bearing: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compassPoint")(bearing.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def compassPoint(bearing: Double, precision: Precision): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compassPoint")(bearing.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def fromLocale(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLocale")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def parse(dms: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dms.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def parse(dms: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dms.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    inline def toBrng(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toBrng(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toBrng(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toBrng(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def toDms(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toDms(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toDms(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toDms(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def toLat(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toLat(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toLat(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toLat(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def toLocale(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocale")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def toLon(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toLon(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toLon(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toLon(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def wrap360(degrees: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap360")(degrees.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def wrap90(degrees: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap90")(degrees.asInstanceOf[js.Any]).asInstanceOf[String]
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
    
    def toString(format: Unit, dp: Dp): String = js.native
    def toString(format: Format): String = js.native
    def toString(format: Format, dp: Dp): String = js.native
  }
}
