package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.geodesyMod.Datum
import typings.geodesy.geodesyMod.Dp
import typings.geodesy.geodesyMod.Format
import typings.geodesy.utmMod.Hemisphere
import typings.geodesy.utmMod.LatLon_Utm
import typings.geodesy.utmMod.Utm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy/utm", JSImport.Namespace)
@js.native
object utmMod extends js.Object {
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  class Dms ()
    extends typings.geodesy.latlonDashEllipsoidalDashDatumMod.Dms
  
  /* Rewritten from type alias, can be one of: 
    - typings.geodesy.geodesyStrings.N
    - typings.geodesy.geodesyStrings.S
  */
  trait Hemisphere extends js.Object
  
  @js.native
  class LatLon () extends LatLon_Utm
  
  @js.native
  trait LatLon_Utm
    extends typings.geodesy.latlonDashEllipsoidalDashDatumMod.default {
    def toUtm(): Utm = js.native
    def toUtm(zoneOverride: Double): Utm = js.native
  }
  
  @js.native
  trait Utm extends js.Object {
    var convergence: Double | Null = js.native
    var datum: Datum = js.native
    var easting: Double = js.native
    var hemisphere: Hemisphere = js.native
    var northing: Double = js.native
    var scale: Double | Null = js.native
    var zone: Double = js.native
    def toLatLon(): LatLon_Utm = js.native
    def toString(digits: Double): String = js.native
  }
  
  @js.native
  class default protected () extends Utm {
    def this(zone: Double, hemisphere: Hemisphere, easting: Double, northing: Double) = this()
    def this(zone: Double, hemisphere: Hemisphere, easting: Double, northing: Double, datum: Datum) = this()
    def this(
      zone: Double,
      hemisphere: Hemisphere,
      easting: Double,
      northing: Double,
      datum: Datum,
      convergence: Double
    ) = this()
    def this(
      zone: Double,
      hemisphere: Hemisphere,
      easting: Double,
      northing: Double,
      datum: Datum,
      convergence: Double,
      scale: Double
    ) = this()
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
    def parse(utmCoord: String): Utm = js.native
    def parse(utmCoord: String, datum: Datum): Utm = js.native
  }
  
}

