package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.geodesyMod.Datum
import typings.geodesy.geodesyMod.Dp
import typings.geodesy.geodesyMod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy/osgridref", JSImport.Namespace)
@js.native
object osgridrefMod extends js.Object {
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  class Dms ()
    extends typings.geodesy.latlonDashEllipsoidalDashDatumMod.Dms
  
  @js.native
  class LatLon () extends LatLon_OsGridRef
  
  @js.native
  trait LatLon_OsGridRef
    extends typings.geodesy.latlonDashEllipsoidalDashDatumMod.default {
    def toOsGrid(): OsGridRef = js.native
  }
  
  @js.native
  trait OsGridRef extends js.Object {
    var easting: Double = js.native
    var northing: Double = js.native
    def toLatLon(): LatLon_OsGridRef = js.native
    def toLatLon(datum: Datum): LatLon_OsGridRef = js.native
    def toString(digits: Double): String = js.native
  }
  
  @js.native
  class default protected () extends OsGridRef {
    def this(easting: Double, northing: Double) = this()
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
    def parse(gridref: String): OsGridRef = js.native
  }
  
}

