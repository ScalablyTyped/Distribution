package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.geodesyMod.Datum
import typings.geodesy.geodesyMod.Dp
import typings.geodesy.geodesyMod.Format
import typings.geodesy.latlonDashEllipsoidalMod.Vector3d
import typings.geodesy.latlonDashNvectorDashEllipsoidalMod.Cartesian_Nvector
import typings.geodesy.latlonDashNvectorDashEllipsoidalMod.LatLon_NvectorEllipsoidal
import typings.geodesy.latlonDashNvectorDashEllipsoidalMod.Ned
import typings.geodesy.latlonDashNvectorDashEllipsoidalMod.NvectorEllipsoidal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy/latlon-nvector-ellipsoidal", JSImport.Namespace)
@js.native
object latlonDashNvectorDashEllipsoidalMod extends js.Object {
  @js.native
  class Cartesian () extends Cartesian_Nvector
  
  @js.native
  trait Cartesian_Nvector
    extends typings.geodesy.latlonDashEllipsoidalMod.Cartesian {
    def toNvector(datum: Datum): NvectorEllipsoidal = js.native
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  class Dms ()
    extends typings.geodesy.latlonDashEllipsoidalMod.Dms
  
  @js.native
  trait LatLon_NvectorEllipsoidal
    extends typings.geodesy.latlonDashEllipsoidalMod.default {
    def deltaTo(point: LatLon_NvectorEllipsoidal): Ned = js.native
    def destinationPoint(delta: Ned): LatLon_NvectorEllipsoidal = js.native
    def toNvector(): NvectorEllipsoidal = js.native
  }
  
  @js.native
  class Ned protected () extends js.Object {
    def this(north: Double, east: Double, down: Double) = this()
    def bearing(): Double = js.native
    def elevation(): Double = js.native
    def length(): Double = js.native
    def toString(dp: Double): String = js.native
  }
  
  @js.native
  class Nvector protected () extends NvectorEllipsoidal {
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, h: Double) = this()
    def this(x: Double, y: Double, z: Double, h: Double, datum: Datum) = this()
  }
  
  @js.native
  trait NvectorEllipsoidal extends Vector3d {
    def toCartesian(): Cartesian_Nvector = js.native
    def toLatLon(): LatLon_NvectorEllipsoidal = js.native
    def toString(dp: Double, dpHeight: Double): String = js.native
  }
  
  @js.native
  class default () extends LatLon_NvectorEllipsoidal
  
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
  object Ned extends js.Object {
    def fromDistanceBearingElevation(dist: Double, brng: Double, elev: Double): Ned = js.native
  }
  
}

