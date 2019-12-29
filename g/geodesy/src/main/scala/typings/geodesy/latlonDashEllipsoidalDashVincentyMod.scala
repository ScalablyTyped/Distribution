package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.geodesyMod.Dp
import typings.geodesy.geodesyMod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy/latlon-ellipsoidal-vincenty", JSImport.Namespace)
@js.native
object latlonDashEllipsoidalDashVincentyMod extends js.Object {
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  class Dms ()
    extends typings.geodesy.latlonDashEllipsoidalMod.Dms
  
  @js.native
  trait LatLonEllipsoidal_Vincenty
    extends typings.geodesy.latlonDashEllipsoidalMod.default {
    def destinationPoint(distance: Double, initialBearing: Double): LatLonEllipsoidal_Vincenty = js.native
    def direct(distance: Double, initialBearing: Double): Anon_FinalBearing = js.native
    def distanceTo(point: LatLonEllipsoidal_Vincenty): Double = js.native
    def finalBearingOn(distance: Double, initialBearing: Double): Double = js.native
    def finalBearingTo(point: LatLonEllipsoidal_Vincenty): Double = js.native
    def initialBearingTo(point: LatLonEllipsoidal_Vincenty): Double = js.native
    def inverse(point: LatLonEllipsoidal_Vincenty): Anon_Distance = js.native
  }
  
  @js.native
  class default () extends LatLonEllipsoidal_Vincenty
  
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
  
}

