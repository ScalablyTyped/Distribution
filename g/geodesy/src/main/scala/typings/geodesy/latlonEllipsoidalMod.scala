package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Datum
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Ellipsoid
import typings.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latlonEllipsoidalMod {
  
  @JSImport("geodesy/latlon-ellipsoidal", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LatLonEllipsoidal {
    def this(lat: Double, lon: Double) = this()
    def this(lat: Double, lon: Double, height: Double) = this()
  }
  object default {
    
    @JSImport("geodesy/latlon-ellipsoidal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(lat: String): LatLonEllipsoidal = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any]).asInstanceOf[LatLonEllipsoidal]
    inline def parse(lat: String, lon: Double): LatLonEllipsoidal = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidal]
    inline def parse(lat: String, lon: Double, height: Double): LatLonEllipsoidal = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidal]
    inline def parse(lat: String, lon: Unit, height: Double): LatLonEllipsoidal = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidal]
    inline def parse(lat: js.Object): LatLonEllipsoidal = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any]).asInstanceOf[LatLonEllipsoidal]
    inline def parse(lat: js.Object, lon: Double): LatLonEllipsoidal = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidal]
    inline def parse(lat: js.Object, lon: Double, height: Double): LatLonEllipsoidal = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidal]
    inline def parse(lat: js.Object, lon: Unit, height: Double): LatLonEllipsoidal = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidal]
    /* static member */
    inline def parse(lat: Double): LatLonEllipsoidal = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any]).asInstanceOf[LatLonEllipsoidal]
    inline def parse(lat: Double, lon: Double): LatLonEllipsoidal = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidal]
    inline def parse(lat: Double, lon: Double, height: Double): LatLonEllipsoidal = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidal]
    inline def parse(lat: Double, lon: Unit, height: Double): LatLonEllipsoidal = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidal]
  }
  
  @JSImport("geodesy/latlon-ellipsoidal", "Cartesian")
  @js.native
  open class Cartesian protected ()
    extends typings.geodesy.vector3dMod.default {
    def this(x: Double, y: Double, z: Double) = this()
    
    def toLatLon(ellipsoid: Ellipsoid): LatLonEllipsoidal = js.native
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/latlon-ellipsoidal", "Dms")
  @js.native
  open class Dms ()
    extends typings.geodesy.dmsMod.default
  object Dms {
    
    @JSImport("geodesy/latlon-ellipsoidal", "Dms")
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
  
  @JSImport("geodesy/latlon-ellipsoidal", "Vector3d")
  @js.native
  open class Vector3d protected ()
    extends typings.geodesy.vector3dMod.default {
    def this(x: Double, y: Double, z: Double) = this()
  }
  
  @js.native
  trait LatLonEllipsoidal extends StObject {
    
    var _datum: Datum = js.native
    
    var _height: Double = js.native
    
    var _lat: Double = js.native
    
    var _lon: Double = js.native
    
    def datum: Datum = js.native
    def datum_=(datum: Datum): Unit = js.native
    
    def equals(point: LatLonEllipsoidal): Boolean = js.native
    
    def height: Double = js.native
    def height_=(height: Double): Unit = js.native
    
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
    
    def toCartesian(): Cartesian = js.native
    
    def toString(format: String): String = js.native
    def toString(format: String, dp: Unit, dpHeight: Double): String = js.native
    def toString(format: String, dp: Dp): String = js.native
    def toString(format: String, dp: Dp, dpHeight: Double): String = js.native
    def toString(format: Unit, dp: Unit, dpHeight: Double): String = js.native
    def toString(format: Unit, dp: Dp): String = js.native
    def toString(format: Unit, dp: Dp, dpHeight: Double): String = js.native
  }
}
