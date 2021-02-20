package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Datum
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utmMod {
  
  @JSImport("geodesy/utm", JSImport.Default)
  @js.native
  class default protected () extends Utm {
    def this(zone: Double, hemisphere: Hemisphere, easting: Double, northing: Double) = this()
    def this(zone: Double, hemisphere: Hemisphere, easting: Double, northing: Double, datum: Datum) = this()
    def this(
      zone: Double,
      hemisphere: Hemisphere,
      easting: Double,
      northing: Double,
      datum: js.UndefOr[scala.Nothing],
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
      datum: js.UndefOr[scala.Nothing],
      convergence: js.UndefOr[scala.Nothing],
      scale: Double
    ) = this()
    def this(
      zone: Double,
      hemisphere: Hemisphere,
      easting: Double,
      northing: Double,
      datum: js.UndefOr[scala.Nothing],
      convergence: Double,
      scale: Double
    ) = this()
    def this(
      zone: Double,
      hemisphere: Hemisphere,
      easting: Double,
      northing: Double,
      datum: Datum,
      convergence: js.UndefOr[scala.Nothing],
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
  }
  object default {
    
    /* static member */
    @JSImport("geodesy/utm", "default.parse")
    @js.native
    def parse(utmCoord: String): Utm = js.native
    @JSImport("geodesy/utm", "default.parse")
    @js.native
    def parse(utmCoord: String, datum: Datum): Utm = js.native
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/utm", "Dms")
  @js.native
  class Dms ()
    extends typings.geodesy.latlonEllipsoidalDatumMod.Dms
  object Dms {
    
    /* static member */
    @JSImport("geodesy/utm", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double): String = js.native
    @JSImport("geodesy/utm", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double, precision: Precision): String = js.native
    
    /* static member */
    @JSImport("geodesy/utm", "Dms.fromLocale")
    @js.native
    def fromLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/utm", "Dms.parse")
    @js.native
    def parse(dms: String): Double = js.native
    @JSImport("geodesy/utm", "Dms.parse")
    @js.native
    def parse(dms: Double): Double = js.native
    
    /* static member */
    @JSImport("geodesy/utm", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double): String = js.native
    @JSImport("geodesy/utm", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/utm", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/utm", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/utm", "Dms.toDms")
    @js.native
    def toDms(deg: Double): String = js.native
    @JSImport("geodesy/utm", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/utm", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/utm", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/utm", "Dms.toLat")
    @js.native
    def toLat(deg: Double): String = js.native
    @JSImport("geodesy/utm", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/utm", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/utm", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/utm", "Dms.toLocale")
    @js.native
    def toLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/utm", "Dms.toLon")
    @js.native
    def toLon(deg: Double): String = js.native
    @JSImport("geodesy/utm", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/utm", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/utm", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/utm", "Dms.wrap360")
    @js.native
    def wrap360(degrees: Double): String = js.native
    
    /* static member */
    @JSImport("geodesy/utm", "Dms.wrap90")
    @js.native
    def wrap90(degrees: Double): String = js.native
  }
  
  @JSImport("geodesy/utm", "LatLon")
  @js.native
  class LatLon () extends LatLonUtm
  
  /* Rewritten from type alias, can be one of: 
    - typings.geodesy.geodesyStrings.N
    - typings.geodesy.geodesyStrings.S
  */
  trait Hemisphere extends StObject
  object Hemisphere {
    
    @scala.inline
    def N: typings.geodesy.geodesyStrings.N = "N".asInstanceOf[typings.geodesy.geodesyStrings.N]
    
    @scala.inline
    def S: typings.geodesy.geodesyStrings.S = "S".asInstanceOf[typings.geodesy.geodesyStrings.S]
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
