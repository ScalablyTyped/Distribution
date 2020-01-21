package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Datum
import typings.geodesy.mod.Datums
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Ellipsoids
import typings.geodesy.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy/latlon-ellipsoidal-datum", JSImport.Namespace)
@js.native
object latlonEllipsoidalDatumMod extends js.Object {
  @js.native
  class Cartesian protected () extends CartesianDatum {
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, datum: Datum) = this()
  }
  
  @js.native
  trait CartesianDatum
    extends typings.geodesy.latlonEllipsoidalMod.Cartesian {
    def convertDatum(toDatum: Datum): CartesianDatum = js.native
    def datum(): Datum = js.native
    def datum(datum: Datum): js.Any = js.native
    def toLatLon(): LatLonEllipsoidalDatum = js.native
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  class Dms ()
    extends typings.geodesy.latlonEllipsoidalMod.Dms
  
  @js.native
  trait LatLonEllipsoidalDatum
    extends typings.geodesy.latlonEllipsoidalMod.default {
    def convertDatum(toDatum: Datum): LatLonEllipsoidalDatum = js.native
  }
  
  @js.native
  class default protected () extends LatLonEllipsoidalDatum {
    def this(lat: Double, lon: Double) = this()
    def this(lat: Double, lon: Double, height: Double) = this()
    def this(lat: Double, lon: Double, height: Double, datum: Datum) = this()
  }
  
  val datums: Datums = js.native
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
    def datums(): Datums = js.native
    def ellipsoids(): Ellipsoids = js.native
    def parse(lat: String): LatLonEllipsoidalDatum = js.native
    def parse(lat: String, lon: Double): LatLonEllipsoidalDatum = js.native
    def parse(lat: String, lon: Double, height: Double): LatLonEllipsoidalDatum = js.native
    def parse(lat: String, lon: Double, height: Double, datum: Datum): LatLonEllipsoidalDatum = js.native
    def parse(lat: js.Object): LatLonEllipsoidalDatum = js.native
    def parse(lat: js.Object, lon: Double): LatLonEllipsoidalDatum = js.native
    def parse(lat: js.Object, lon: Double, height: Double): LatLonEllipsoidalDatum = js.native
    def parse(lat: js.Object, lon: Double, height: Double, datum: Datum): LatLonEllipsoidalDatum = js.native
    def parse(lat: Double): LatLonEllipsoidalDatum = js.native
    def parse(lat: Double, lon: Double): LatLonEllipsoidalDatum = js.native
    def parse(lat: Double, lon: Double, height: Double): LatLonEllipsoidalDatum = js.native
    def parse(lat: Double, lon: Double, height: Double, datum: Datum): LatLonEllipsoidalDatum = js.native
  }
  
}

