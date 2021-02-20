package typings.geodesy

import typings.geodesy.anon.Distance
import typings.geodesy.anon.FinalBearing
import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latlonEllipsoidalVincentyMod {
  
  @JSImport("geodesy/latlon-ellipsoidal-vincenty", JSImport.Default)
  @js.native
  class default () extends LatLonEllipsoidalVincenty
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms")
  @js.native
  class Dms ()
    extends typings.geodesy.latlonEllipsoidalMod.Dms
  object Dms {
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double, precision: Precision): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.fromLocale")
    @js.native
    def fromLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.parse")
    @js.native
    def parse(dms: String): Double = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.parse")
    @js.native
    def parse(dms: Double): Double = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toDms")
    @js.native
    def toDms(deg: Double): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toLat")
    @js.native
    def toLat(deg: Double): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toLocale")
    @js.native
    def toLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toLon")
    @js.native
    def toLon(deg: Double): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.wrap360")
    @js.native
    def wrap360(degrees: Double): String = js.native
    
    /* static member */
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms.wrap90")
    @js.native
    def wrap90(degrees: Double): String = js.native
  }
  
  @js.native
  trait LatLonEllipsoidalVincenty
    extends typings.geodesy.latlonEllipsoidalMod.default {
    
    def destinationPoint(distance: Double, initialBearing: Double): LatLonEllipsoidalVincenty = js.native
    
    def direct(distance: Double, initialBearing: Double): FinalBearing = js.native
    
    def distanceTo(point: LatLonEllipsoidalVincenty): Double = js.native
    
    def finalBearingOn(distance: Double, initialBearing: Double): Double = js.native
    
    def finalBearingTo(point: LatLonEllipsoidalVincenty): Double = js.native
    
    def initialBearingTo(point: LatLonEllipsoidalVincenty): Double = js.native
    
    def inverse(point: LatLonEllipsoidalVincenty): Distance = js.native
  }
}
