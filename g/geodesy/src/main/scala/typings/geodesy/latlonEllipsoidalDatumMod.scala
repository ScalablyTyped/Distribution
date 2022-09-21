package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Datum
import typings.geodesy.mod.Datums
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latlonEllipsoidalDatumMod {
  
  @JSImport("geodesy/latlon-ellipsoidal-datum", JSImport.Default)
  @js.native
  open class default protected () extends LatLonEllipsoidalDatum {
    def this(lat: Double, lon: Double) = this()
    def this(lat: Double, lon: Double, height: Double) = this()
    def this(lat: Double, lon: Double, height: Double, datum: Datum) = this()
    def this(lat: Double, lon: Double, height: Unit, datum: Datum) = this()
  }
  object default {
    
    @JSImport("geodesy/latlon-ellipsoidal-datum", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(lat: String): LatLonEllipsoidalDatum = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any]).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: String, lon: Double): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: String, lon: Double, height: Double): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: String, lon: Double, height: Double, datum: Datum): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: String, lon: Double, height: Unit, datum: Datum): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: String, lon: Unit, height: Double): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: String, lon: Unit, height: Double, datum: Datum): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: String, lon: Unit, height: Unit, datum: Datum): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: js.Object): LatLonEllipsoidalDatum = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any]).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: js.Object, lon: Double): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: js.Object, lon: Double, height: Double): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: js.Object, lon: Double, height: Double, datum: Datum): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: js.Object, lon: Double, height: Unit, datum: Datum): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: js.Object, lon: Unit, height: Double): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: js.Object, lon: Unit, height: Double, datum: Datum): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: js.Object, lon: Unit, height: Unit, datum: Datum): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    /* static member */
    inline def parse(lat: Double): LatLonEllipsoidalDatum = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any]).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: Double, lon: Double): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: Double, lon: Double, height: Double): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: Double, lon: Double, height: Double, datum: Datum): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: Double, lon: Double, height: Unit, datum: Datum): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: Double, lon: Unit, height: Double): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: Double, lon: Unit, height: Double, datum: Datum): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
    inline def parse(lat: Double, lon: Unit, height: Unit, datum: Datum): LatLonEllipsoidalDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalDatum]
  }
  
  @JSImport("geodesy/latlon-ellipsoidal-datum", "Cartesian")
  @js.native
  open class Cartesian protected () extends CartesianDatum {
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, datum: Datum) = this()
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/latlon-ellipsoidal-datum", "Dms")
  @js.native
  open class Dms ()
    extends typings.geodesy.latlonEllipsoidalMod.Dms
  object Dms {
    
    @JSImport("geodesy/latlon-ellipsoidal-datum", "Dms")
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
  
  @JSImport("geodesy/latlon-ellipsoidal-datum", "datums")
  @js.native
  val datums: Datums = js.native
  
  @js.native
  trait CartesianDatum
    extends typings.geodesy.latlonEllipsoidalMod.Cartesian {
    
    def convertDatum(toDatum: Datum): CartesianDatum = js.native
    
    def datum: Datum = js.native
    def datum_=(datum: Datum): Unit = js.native
    
    def toLatLon(): LatLonEllipsoidalDatum = js.native
  }
  
  @js.native
  trait LatLonEllipsoidalDatum
    extends typings.geodesy.latlonEllipsoidalMod.default {
    
    def convertDatum(toDatum: Datum): LatLonEllipsoidalDatum = js.native
  }
}
