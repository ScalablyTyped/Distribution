package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.latlonEllipsoidalMod.Vector3d
import typings.geodesy.mod.Datum
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy/latlon-nvector-ellipsoidal", JSImport.Namespace)
@js.native
object latlonNvectorEllipsoidalMod extends js.Object {
  @js.native
  class Cartesian () extends CartesianNvector
  
  @js.native
  trait CartesianNvector
    extends typings.geodesy.latlonEllipsoidalMod.Cartesian {
    def toNvector(datum: Datum): NvectorEllipsoidal = js.native
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  class Dms ()
    extends typings.geodesy.latlonEllipsoidalMod.Dms
  
  @js.native
  trait LatLonNvectorEllipsoidal
    extends typings.geodesy.latlonEllipsoidalMod.default {
    def deltaTo(point: LatLonNvectorEllipsoidal): Ned = js.native
    def destinationPoint(delta: Ned): LatLonNvectorEllipsoidal = js.native
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
    def toCartesian(): CartesianNvector = js.native
    def toLatLon(): LatLonNvectorEllipsoidal = js.native
    def toString(dp: Double, dpHeight: Double): String = js.native
  }
  
  @js.native
  class default () extends LatLonNvectorEllipsoidal
  
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

