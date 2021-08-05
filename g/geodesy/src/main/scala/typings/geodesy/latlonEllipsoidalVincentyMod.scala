package typings.geodesy

import typings.geodesy.anon.Distance
import typings.geodesy.anon.FinalBearing
import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("geodesy/latlon-ellipsoidal-vincenty", "Dms")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def compassPoint(bearing: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compassPoint")(bearing.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def compassPoint(bearing: Double, precision: Precision): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compassPoint")(bearing.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def fromLocale(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLocale")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def parse(dms: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dms.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def parse(dms: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dms.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    inline def toBrng(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toBrng(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toBrng(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toBrng(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def toDms(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toDms(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toDms(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toDms(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def toLat(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toLat(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toLat(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toLat(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def toLocale(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocale")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def toLon(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toLon(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toLon(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toLon(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def wrap360(degrees: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap360")(degrees.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def wrap90(degrees: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap90")(degrees.asInstanceOf[js.Any]).asInstanceOf[String]
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
