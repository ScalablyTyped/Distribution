package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Datum
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy/osgridref", JSImport.Namespace)
@js.native
object osgridrefMod extends js.Object {
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  class Dms ()
    extends typings.geodesy.latlonEllipsoidalDatumMod.Dms
  
  @js.native
  class LatLon () extends LatLonOsGridRef
  
  @js.native
  trait LatLonOsGridRef
    extends typings.geodesy.latlonEllipsoidalDatumMod.default {
    def toOsGrid(): OsGridRef = js.native
  }
  
  @js.native
  trait OsGridRef extends js.Object {
    var easting: Double = js.native
    var northing: Double = js.native
    def toLatLon(): LatLonOsGridRef = js.native
    def toLatLon(datum: Datum): LatLonOsGridRef = js.native
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
  
  /* static members */
  @js.native
  object default extends js.Object {
    def parse(gridref: String): OsGridRef = js.native
  }
  
}

