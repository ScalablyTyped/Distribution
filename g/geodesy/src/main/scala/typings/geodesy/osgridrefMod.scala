package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Datum
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object osgridrefMod {
  
  @JSImport("geodesy/osgridref", JSImport.Default)
  @js.native
  class default protected () extends OsGridRef {
    def this(easting: Double, northing: Double) = this()
  }
  object default {
    
    /* static member */
    @JSImport("geodesy/osgridref", "default.parse")
    @js.native
    def parse(gridref: String): OsGridRef = js.native
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/osgridref", "Dms")
  @js.native
  class Dms ()
    extends typings.geodesy.latlonEllipsoidalDatumMod.Dms
  object Dms {
    
    /* static member */
    @JSImport("geodesy/osgridref", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double): String = js.native
    @JSImport("geodesy/osgridref", "Dms.compassPoint")
    @js.native
    def compassPoint(bearing: Double, precision: Precision): String = js.native
    
    /* static member */
    @JSImport("geodesy/osgridref", "Dms.fromLocale")
    @js.native
    def fromLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/osgridref", "Dms.parse")
    @js.native
    def parse(dms: String): Double = js.native
    @JSImport("geodesy/osgridref", "Dms.parse")
    @js.native
    def parse(dms: Double): Double = js.native
    
    /* static member */
    @JSImport("geodesy/osgridref", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double): String = js.native
    @JSImport("geodesy/osgridref", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/osgridref", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/osgridref", "Dms.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/osgridref", "Dms.toDms")
    @js.native
    def toDms(deg: Double): String = js.native
    @JSImport("geodesy/osgridref", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/osgridref", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/osgridref", "Dms.toDms")
    @js.native
    def toDms(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/osgridref", "Dms.toLat")
    @js.native
    def toLat(deg: Double): String = js.native
    @JSImport("geodesy/osgridref", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/osgridref", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/osgridref", "Dms.toLat")
    @js.native
    def toLat(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/osgridref", "Dms.toLocale")
    @js.native
    def toLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/osgridref", "Dms.toLon")
    @js.native
    def toLon(deg: Double): String = js.native
    @JSImport("geodesy/osgridref", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/osgridref", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/osgridref", "Dms.toLon")
    @js.native
    def toLon(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/osgridref", "Dms.wrap360")
    @js.native
    def wrap360(degrees: Double): String = js.native
    
    /* static member */
    @JSImport("geodesy/osgridref", "Dms.wrap90")
    @js.native
    def wrap90(degrees: Double): String = js.native
  }
  
  @JSImport("geodesy/osgridref", "LatLon")
  @js.native
  class LatLon () extends LatLonOsGridRef
  
  @js.native
  trait LatLonOsGridRef
    extends typings.geodesy.latlonEllipsoidalDatumMod.default {
    
    def toOsGrid(): OsGridRef = js.native
  }
  
  @js.native
  trait OsGridRef extends StObject {
    
    var easting: Double = js.native
    
    var northing: Double = js.native
    
    def toLatLon(): LatLonOsGridRef = js.native
    def toLatLon(datum: Datum): LatLonOsGridRef = js.native
    
    def toString(digits: Double): String = js.native
  }
}
