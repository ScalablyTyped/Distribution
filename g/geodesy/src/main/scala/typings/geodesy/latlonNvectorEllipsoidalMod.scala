package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.latlonEllipsoidalMod.Vector3d
import typings.geodesy.mod.Datum
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latlonNvectorEllipsoidalMod {
  
  @JSImport("geodesy/latlon-nvector-ellipsoidal", JSImport.Default)
  @js.native
  class default () extends LatLonNvectorEllipsoidal
  
  @JSImport("geodesy/latlon-nvector-ellipsoidal", "Cartesian")
  @js.native
  class Cartesian () extends CartesianNvector
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms")
  @js.native
  class Dms ()
    extends typings.geodesy.latlonEllipsoidalMod.Dms
  object Dms {
    
    /* static member */
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double): String = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double, precision: Precision): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.fromLocale")
    @js.native
    def fromLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.parse")
    @js.native
    def parse(dms: String): Double = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.parse")
    @js.native
    def parse(dms: Double): Double = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double): String = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toDms")
    @js.native
    def toDms(deg: Double): String = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toLat")
    @js.native
    def toLat(deg: Double): String = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toLocale")
    @js.native
    def toLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toLon")
    @js.native
    def toLon(deg: Double): String = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.wrap360")
    @js.native
    def wrap360(degrees: Double): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms.wrap90")
    @js.native
    def wrap90(degrees: Double): String = js.native
  }
  
  @JSImport("geodesy/latlon-nvector-ellipsoidal", "Ned")
  @js.native
  class Ned protected () extends StObject {
    def this(north: Double, east: Double, down: Double) = this()
    
    def bearing: Double = js.native
    
    def elevation: Double = js.native
    
    def length: Double = js.native
    
    def toString(dp: Double): String = js.native
  }
  object Ned {
    
    /* static member */
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Ned.fromDistanceBearingElevation")
    @js.native
    def fromDistanceBearingElevation(dist: Double, brng: Double, elev: Double): Ned = js.native
  }
  
  @JSImport("geodesy/latlon-nvector-ellipsoidal", "Nvector")
  @js.native
  class Nvector protected () extends NvectorEllipsoidal {
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, h: Double) = this()
    def this(x: Double, y: Double, z: Double, h: js.UndefOr[scala.Nothing], datum: Datum) = this()
    def this(x: Double, y: Double, z: Double, h: Double, datum: Datum) = this()
  }
  
  @js.native
  trait CartesianNvector
    extends typings.geodesy.latlonEllipsoidalMod.Cartesian {
    
    def toNvector(datum: Datum): NvectorEllipsoidal = js.native
  }
  
  @js.native
  trait LatLonNvectorEllipsoidal
    extends typings.geodesy.latlonEllipsoidalMod.default {
    
    def deltaTo(point: LatLonNvectorEllipsoidal): Ned = js.native
    
    def destinationPoint(delta: Ned): LatLonNvectorEllipsoidal = js.native
    
    def toNvector(): NvectorEllipsoidal = js.native
  }
  
  @js.native
  trait NvectorEllipsoidal extends Vector3d {
    
    def toCartesian(): CartesianNvector = js.native
    
    def toLatLon(): LatLonNvectorEllipsoidal = js.native
    
    def toString(dp: js.UndefOr[scala.Nothing], dpHeight: Double): String = js.native
    def toString(dp: Double, dpHeight: Double): String = js.native
  }
}
