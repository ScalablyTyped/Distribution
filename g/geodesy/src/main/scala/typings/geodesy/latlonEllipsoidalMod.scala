package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Datum
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Ellipsoid
import typings.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latlonEllipsoidalMod {
  
  @JSImport("geodesy/latlon-ellipsoidal", JSImport.Default)
  @js.native
  class default protected () extends LatLonEllipsoidal {
    def this(lat: Double, lon: Double) = this()
    def this(lat: Double, lon: Double, height: Double) = this()
  }
  object default {
    
    @JSImport("geodesy/latlon-ellipsoidal", "default.parse")
    @js.native
    def parse(lat: String): LatLonEllipsoidal = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "default.parse")
    @js.native
    def parse(lat: String, lon: js.UndefOr[scala.Nothing], height: Double): LatLonEllipsoidal = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "default.parse")
    @js.native
    def parse(lat: String, lon: Double): LatLonEllipsoidal = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "default.parse")
    @js.native
    def parse(lat: String, lon: Double, height: Double): LatLonEllipsoidal = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "default.parse")
    @js.native
    def parse(lat: js.Object): LatLonEllipsoidal = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "default.parse")
    @js.native
    def parse(lat: js.Object, lon: js.UndefOr[scala.Nothing], height: Double): LatLonEllipsoidal = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "default.parse")
    @js.native
    def parse(lat: js.Object, lon: Double): LatLonEllipsoidal = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "default.parse")
    @js.native
    def parse(lat: js.Object, lon: Double, height: Double): LatLonEllipsoidal = js.native
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal", "default.parse")
    @js.native
    def parse(lat: Double): LatLonEllipsoidal = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "default.parse")
    @js.native
    def parse(lat: Double, lon: js.UndefOr[scala.Nothing], height: Double): LatLonEllipsoidal = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "default.parse")
    @js.native
    def parse(lat: Double, lon: Double): LatLonEllipsoidal = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "default.parse")
    @js.native
    def parse(lat: Double, lon: Double, height: Double): LatLonEllipsoidal = js.native
  }
  
  @JSImport("geodesy/latlon-ellipsoidal", "Cartesian")
  @js.native
  class Cartesian protected ()
    extends typings.geodesy.vector3dMod.default {
    def this(x: Double, y: Double, z: Double) = this()
    
    def toLatLon(ellipsoid: Ellipsoid): LatLonEllipsoidal = js.native
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/latlon-ellipsoidal", "Dms")
  @js.native
  class Dms ()
    extends typings.geodesy.dmsMod.default
  object Dms {
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double, precision: Precision): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.fromLocale")
    @js.native
    def fromLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.parse")
    @js.native
    def parse(dms: String): Double = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.parse")
    @js.native
    def parse(dms: Double): Double = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toDms")
    @js.native
    def toDms(deg: Double): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toLat")
    @js.native
    def toLat(deg: Double): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toLocale")
    @js.native
    def toLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toLon")
    @js.native
    def toLon(deg: Double): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.wrap360")
    @js.native
    def wrap360(degrees: Double): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal", "Dms.wrap90")
    @js.native
    def wrap90(degrees: Double): String = js.native
  }
  
  @JSImport("geodesy/latlon-ellipsoidal", "Vector3d")
  @js.native
  class Vector3d protected ()
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
    
    def toString(format: js.UndefOr[scala.Nothing], dp: js.UndefOr[scala.Nothing], dpHeight: Double): String = js.native
    def toString(format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toString(format: js.UndefOr[scala.Nothing], dp: Dp, dpHeight: Double): String = js.native
    def toString(format: String): String = js.native
    def toString(format: String, dp: js.UndefOr[scala.Nothing], dpHeight: Double): String = js.native
    def toString(format: String, dp: Dp): String = js.native
    def toString(format: String, dp: Dp, dpHeight: Double): String = js.native
  }
}
