package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import typings.geodesy.mod.GeoJSON
import typings.geodesy.mod.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latlonNvectorSphericalMod {
  
  @JSImport("geodesy/latlon-nvector-spherical", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LatLonNvectorSpherical {
    def this(lat: Double, lon: Double) = this()
  }
  object default {
    
    @JSImport("geodesy/latlon-nvector-spherical", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def areaOf(polygon: Polygon[LatLonNvectorSpherical]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("areaOf")(polygon.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def areaOf(polygon: Polygon[LatLonNvectorSpherical], radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("areaOf")(polygon.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* static member */
    inline def intersection(
      path1start: LatLonNvectorSpherical,
      path1brngEnd: PathBrngEnd,
      path2start: LatLonNvectorSpherical,
      path2brngEnd: PathBrngEnd
    ): LatLonNvectorSpherical = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(path1start.asInstanceOf[js.Any], path1brngEnd.asInstanceOf[js.Any], path2start.asInstanceOf[js.Any], path2brngEnd.asInstanceOf[js.Any])).asInstanceOf[LatLonNvectorSpherical]
    
    /* static member */
    inline def meanOf(points: Polygon[LatLonNvectorSpherical]): LatLonNvectorSpherical = ^.asInstanceOf[js.Dynamic].applyDynamic("meanOf")(points.asInstanceOf[js.Any]).asInstanceOf[LatLonNvectorSpherical]
    
    /* static member */
    inline def triangulate(point1: LatLonNvectorSpherical, bearing1: Double, point2: LatLonNvectorSpherical, bearing2: Double): LatLonNvectorSpherical = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulate")(point1.asInstanceOf[js.Any], bearing1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], bearing2.asInstanceOf[js.Any])).asInstanceOf[LatLonNvectorSpherical]
    
    /* static member */
    inline def trilaterate(
      point1: LatLonNvectorSpherical,
      distance1: Double,
      point2: LatLonNvectorSpherical,
      distance2: Double,
      point3: LatLonNvectorSpherical,
      distance3: Double
    ): LatLonNvectorSpherical = (^.asInstanceOf[js.Dynamic].applyDynamic("trilaterate")(point1.asInstanceOf[js.Any], distance1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], distance2.asInstanceOf[js.Any], point3.asInstanceOf[js.Any], distance3.asInstanceOf[js.Any])).asInstanceOf[LatLonNvectorSpherical]
    inline def trilaterate(
      point1: LatLonNvectorSpherical,
      distance1: Double,
      point2: LatLonNvectorSpherical,
      distance2: Double,
      point3: LatLonNvectorSpherical,
      distance3: Double,
      radius: Double
    ): LatLonNvectorSpherical = (^.asInstanceOf[js.Dynamic].applyDynamic("trilaterate")(point1.asInstanceOf[js.Any], distance1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], distance2.asInstanceOf[js.Any], point3.asInstanceOf[js.Any], distance3.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[LatLonNvectorSpherical]
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/latlon-nvector-spherical", "Dms")
  @js.native
  open class Dms ()
    extends typings.geodesy.dmsMod.default
  object Dms {
    
    @JSImport("geodesy/latlon-nvector-spherical", "Dms")
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
  
  @JSImport("geodesy/latlon-nvector-spherical", "Nvector")
  @js.native
  open class Nvector protected () extends NvectorSpherical {
    def this(x: Double, y: Double, z: Double) = this()
  }
  
  @js.native
  trait LatLonNvectorSpherical extends StObject {
    
    def alongTrackDistanceTo(pathStart: LatLonNvectorSpherical, pathBrngEnd: PathBrngEnd): Double = js.native
    def alongTrackDistanceTo(pathStart: LatLonNvectorSpherical, pathBrngEnd: PathBrngEnd, radius: Double): Double = js.native
    
    def crossTrackDistanceTo(pathStart: LatLonNvectorSpherical, pathBrngEnd: PathBrngEnd): Double = js.native
    def crossTrackDistanceTo(pathStart: LatLonNvectorSpherical, pathBrngEnd: PathBrngEnd, radius: Double): Double = js.native
    
    def destinationPoint(distance: Double, bearing: Double): LatLonNvectorSpherical = js.native
    def destinationPoint(distance: Double, bearing: Double, radius: Double): LatLonNvectorSpherical = js.native
    
    def distanceTo(point: LatLonNvectorSpherical): Double = js.native
    def distanceTo(point: LatLonNvectorSpherical, radius: Double): Double = js.native
    
    def equals(point: LatLonNvectorSpherical): Boolean = js.native
    
    def finalBearingTo(point: LatLonNvectorSpherical): Double = js.native
    
    def greatCircle(bearing: Double): typings.geodesy.vector3dMod.default = js.native
    
    def initialBearingTo(point: LatLonNvectorSpherical): Double = js.native
    
    def intermediatePointTo(point: LatLonNvectorSpherical, fraction: Double): LatLonNvectorSpherical = js.native
    
    def isEnclosedBy(polygon: Polygon[LatLonNvectorSpherical]): Boolean = js.native
    
    def isWithinExtent(point1: LatLonNvectorSpherical, point2: LatLonNvectorSpherical): Boolean = js.native
    
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
    
    def midpointTo(point: LatLonNvectorSpherical): LatLonNvectorSpherical = js.native
    
    def nearestPointOnSegment(point1: LatLonNvectorSpherical, point2: LatLonNvectorSpherical): LatLonNvectorSpherical = js.native
    
    def toGeoJSON(): GeoJSON = js.native
    
    def toNvector(): NvectorSpherical = js.native
    
    def toString(format: Unit, dp: Dp): String = js.native
    def toString(format: Format): String = js.native
    def toString(format: Format, dp: Dp): String = js.native
  }
  
  @js.native
  trait NvectorSpherical
    extends typings.geodesy.vector3dMod.default {
    
    def greatCircle(bearing: Double): typings.geodesy.vector3dMod.default = js.native
    
    def toLatLon(): LatLonNvectorSpherical = js.native
  }
  
  type PathBrngEnd = LatLonNvectorSpherical | Double
}
