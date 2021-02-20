package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.geodesyNumbers.`10`
import typings.geodesy.geodesyNumbers.`2`
import typings.geodesy.geodesyNumbers.`4`
import typings.geodesy.geodesyNumbers.`6`
import typings.geodesy.geodesyNumbers.`8`
import typings.geodesy.mod.Datum
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mgrsMod {
  
  @JSImport("geodesy/mgrs", JSImport.Default)
  @js.native
  class default protected () extends Mgrs {
    def this(zone: Double, band: String, e100k: String, n100k: String, easting: Double, northing: Double) = this()
    def this(
      zone: Double,
      band: String,
      e100k: String,
      n100k: String,
      easting: Double,
      northing: Double,
      datum: Datum
    ) = this()
  }
  object default {
    
    /* static member */
    @JSImport("geodesy/mgrs", "default.parse")
    @js.native
    def parse(mgrsGridRef: String): Mgrs = js.native
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/mgrs", "Dms")
  @js.native
  class Dms ()
    extends typings.geodesy.utmMod.Dms
  object Dms {
    
    /* static member */
    @JSImport("geodesy/mgrs", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double): String = js.native
    @JSImport("geodesy/mgrs", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double, precision: Precision): String = js.native
    
    /* static member */
    @JSImport("geodesy/mgrs", "Dms.fromLocale")
    @js.native
    def fromLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/mgrs", "Dms.parse")
    @js.native
    def parse(dms: String): Double = js.native
    @JSImport("geodesy/mgrs", "Dms.parse")
    @js.native
    def parse(dms: Double): Double = js.native
    
    /* static member */
    @JSImport("geodesy/mgrs", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double): String = js.native
    @JSImport("geodesy/mgrs", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/mgrs", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/mgrs", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/mgrs", "Dms.toDms")
    @js.native
    def toDms(deg: Double): String = js.native
    @JSImport("geodesy/mgrs", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/mgrs", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/mgrs", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/mgrs", "Dms.toLat")
    @js.native
    def toLat(deg: Double): String = js.native
    @JSImport("geodesy/mgrs", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/mgrs", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/mgrs", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/mgrs", "Dms.toLocale")
    @js.native
    def toLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/mgrs", "Dms.toLon")
    @js.native
    def toLon(deg: Double): String = js.native
    @JSImport("geodesy/mgrs", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/mgrs", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/mgrs", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/mgrs", "Dms.wrap360")
    @js.native
    def wrap360(degrees: Double): String = js.native
    
    /* static member */
    @JSImport("geodesy/mgrs", "Dms.wrap90")
    @js.native
    def wrap90(degrees: Double): String = js.native
  }
  
  @JSImport("geodesy/mgrs", "LatLon")
  @js.native
  class LatLon () extends LatlonUtmMgrs
  
  @JSImport("geodesy/mgrs", "Utm")
  @js.native
  class Utm () extends UtmMgrs
  
  @js.native
  trait LatlonUtmMgrs
    extends typings.geodesy.utmMod.LatLon
  
  @js.native
  trait Mgrs extends StObject {
    
    var band: String = js.native
    
    var datum: Datum = js.native
    
    var e100k: String = js.native
    
    var easting: Double = js.native
    
    var n100k: String = js.native
    
    var northing: Double = js.native
    
    @JSName("toString")
    def toString_10(digits: `10`): String = js.native
    @JSName("toString")
    def toString_2(digits: `2`): String = js.native
    @JSName("toString")
    def toString_4(digits: `4`): String = js.native
    @JSName("toString")
    def toString_6(digits: `6`): String = js.native
    @JSName("toString")
    def toString_8(digits: `8`): String = js.native
    
    def toUtm(): UtmMgrs = js.native
    
    var zone: Double = js.native
  }
  
  @js.native
  trait UtmMgrs
    extends typings.geodesy.utmMod.default {
    
    def toMgrs(): Mgrs = js.native
  }
}
