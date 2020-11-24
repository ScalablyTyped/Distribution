package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Datum
import typings.geodesy.mod.Datums
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Ellipsoid
import typings.geodesy.mod.Ellipsoids
import typings.geodesy.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geodesy/latlon-ellipsoidal", JSImport.Namespace)
@js.native
object latlonEllipsoidalMod extends js.Object {
  
  @js.native
  class Cartesian ()
    extends typings.geodesy.vector3dMod.default {
    
    def toLatLon(ellipsoid: Ellipsoid): LatLonEllipsoidal = js.native
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  class Dms ()
    extends typings.geodesy.dmsMod.default
  /* static members */
  @js.native
  object Dms extends js.Object {
    
    def compassPoint(bearing: Double): String = js.native
    def compassPoint(bearing: Double, precision: Precision): String = js.native
    
    def fromLocale(str: String): String = js.native
    
    def parse(dms: String): Double = js.native
    def parse(dms: Double): Double = js.native
    
    def separator: String = js.native
    def separator_=(char: String): Unit = js.native
    
    def toBrng(deg: Double): String = js.native
    def toBrng(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toBrng(deg: Double, format: Format): String = js.native
    def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
    
    def toDms(deg: Double): String = js.native
    def toDms(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toDms(deg: Double, format: Format): String = js.native
    def toDms(deg: Double, format: Format, dp: Dp): String = js.native
    
    def toLat(deg: Double): String = js.native
    def toLat(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toLat(deg: Double, format: Format): String = js.native
    def toLat(deg: Double, format: Format, dp: Dp): String = js.native
    
    def toLocale(str: String): String = js.native
    
    def toLon(deg: Double): String = js.native
    def toLon(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toLon(deg: Double, format: Format): String = js.native
    def toLon(deg: Double, format: Format, dp: Dp): String = js.native
    
    def wrap360(degrees: Double): String = js.native
    
    def wrap90(degrees: Double): String = js.native
  }
  
  @js.native
  trait LatLonEllipsoidal extends js.Object {
    
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
    
    def toString(format: js.UndefOr[scala.Nothing], dp: js.UndefOr[scala.Nothing], dpHeight: Double): String = js.native
    def toString(format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toString(format: js.UndefOr[scala.Nothing], dp: Dp, dpHeight: Double): String = js.native
    def toString(format: String): String = js.native
    def toString(format: String, dp: js.UndefOr[scala.Nothing], dpHeight: Double): String = js.native
    def toString(format: String, dp: Dp): String = js.native
    def toString(format: String, dp: Dp, dpHeight: Double): String = js.native
  }
  
  @js.native
  class Vector3d protected ()
    extends typings.geodesy.vector3dMod.default {
    def this(x: Double, y: Double, z: Double) = this()
  }
  
  @js.native
  class default protected () extends LatLonEllipsoidal {
    def this(lat: Double, lon: Double) = this()
    def this(lat: Double, lon: Double, height: Double) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def datums: Datums = js.native
    
    def ellipsoids: Ellipsoids = js.native
    
    def parse(lat: String): LatLonEllipsoidal = js.native
    def parse(lat: String, lon: js.UndefOr[scala.Nothing], height: Double): LatLonEllipsoidal = js.native
    def parse(lat: String, lon: Double): LatLonEllipsoidal = js.native
    def parse(lat: String, lon: Double, height: Double): LatLonEllipsoidal = js.native
    def parse(lat: js.Object): LatLonEllipsoidal = js.native
    def parse(lat: js.Object, lon: js.UndefOr[scala.Nothing], height: Double): LatLonEllipsoidal = js.native
    def parse(lat: js.Object, lon: Double): LatLonEllipsoidal = js.native
    def parse(lat: js.Object, lon: Double, height: Double): LatLonEllipsoidal = js.native
    def parse(lat: Double): LatLonEllipsoidal = js.native
    def parse(lat: Double, lon: js.UndefOr[scala.Nothing], height: Double): LatLonEllipsoidal = js.native
    def parse(lat: Double, lon: Double): LatLonEllipsoidal = js.native
    def parse(lat: Double, lon: Double, height: Double): LatLonEllipsoidal = js.native
  }
}
