package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Datum
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utmMod {
  
  @JSImport("geodesy/utm", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Utm {
    def this(zone: Double, hemisphere: Hemisphere, easting: Double, northing: Double) = this()
    def this(zone: Double, hemisphere: Hemisphere, easting: Double, northing: Double, datum: Datum) = this()
    def this(
      zone: Double,
      hemisphere: Hemisphere,
      easting: Double,
      northing: Double,
      datum: Unit,
      convergence: Double
    ) = this()
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
      datum: Unit,
      convergence: Double,
      scale: Double
    ) = this()
    def this(
      zone: Double,
      hemisphere: Hemisphere,
      easting: Double,
      northing: Double,
      datum: Unit,
      convergence: Unit,
      scale: Double
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
    def this(
      zone: Double,
      hemisphere: Hemisphere,
      easting: Double,
      northing: Double,
      datum: Datum,
      convergence: Unit,
      scale: Double
    ) = this()
  }
  object default {
    
    @JSImport("geodesy/utm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def parse(utmCoord: String): Utm = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(utmCoord.asInstanceOf[js.Any]).asInstanceOf[Utm]
    inline def parse(utmCoord: String, datum: Datum): Utm = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(utmCoord.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[Utm]
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/utm", "Dms")
  @js.native
  open class Dms ()
    extends typings.geodesy.latlonEllipsoidalDatumMod.Dms
  object Dms {
    
    @JSImport("geodesy/utm", "Dms")
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
  
  @JSImport("geodesy/utm", "LatLon")
  @js.native
  open class LatLon () extends LatLonUtm
  
  /* Rewritten from type alias, can be one of: 
    - typings.geodesy.geodesyStrings.N
    - typings.geodesy.geodesyStrings.S
  */
  trait Hemisphere extends StObject
  object Hemisphere {
    
    inline def N: typings.geodesy.geodesyStrings.N = "N".asInstanceOf[typings.geodesy.geodesyStrings.N]
    
    inline def S: typings.geodesy.geodesyStrings.S = "S".asInstanceOf[typings.geodesy.geodesyStrings.S]
  }
  
  @js.native
  trait LatLonUtm
    extends typings.geodesy.latlonEllipsoidalDatumMod.default {
    
    def toUtm(): Utm = js.native
    def toUtm(zoneOverride: Double): Utm = js.native
  }
  
  @js.native
  trait Utm extends StObject {
    
    var convergence: Double | Null = js.native
    
    var datum: Datum = js.native
    
    var easting: Double = js.native
    
    var hemisphere: Hemisphere = js.native
    
    var northing: Double = js.native
    
    var scale: Double | Null = js.native
    
    def toLatLon(): LatLonUtm = js.native
    
    def toString(digits: Double): String = js.native
    
    var zone: Double = js.native
  }
}
