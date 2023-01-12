package typings.geodesy

import typings.geodesy.dmsMod.Precision
import typings.geodesy.mod.Dp
import typings.geodesy.mod.Ellipsoid
import typings.geodesy.mod.Format
import typings.geodesy.mod.Plural
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latlonEllipsoidalReferenceframeMod {
  
  @JSImport("geodesy/latlon-ellipsoidal-referenceframe", JSImport.Default)
  @js.native
  open class default protected () extends LatLonEllipsoidalReferenceFrame {
    def this(lat: Double, lon: Double) = this()
    def this(lat: Double, lon: Double, height: Double) = this()
    def this(lat: Double, lon: Double, height: Double, referenceFrame: ReferenceFrame) = this()
    def this(lat: Double, lon: Double, height: Unit, referenceFrame: ReferenceFrame) = this()
    def this(lat: Double, lon: Double, height: Double, referenceFrame: Unit, epoch: Double) = this()
    def this(lat: Double, lon: Double, height: Double, referenceFrame: ReferenceFrame, epoch: Double) = this()
    def this(lat: Double, lon: Double, height: Unit, referenceFrame: Unit, epoch: Double) = this()
    def this(lat: Double, lon: Double, height: Unit, referenceFrame: ReferenceFrame, epoch: Double) = this()
  }
  object default {
    
    @JSImport("geodesy/latlon-ellipsoidal-referenceframe", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(lat: String): LatLonEllipsoidalReferenceFrame = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any]).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Double, height: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Double, height: Double, referenceFrame: Unit, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Double, height: Double, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Double, height: Double, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Double, height: Unit, referenceFrame: Unit, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Double, height: Unit, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Double, height: Unit, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Unit, height: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Unit, height: Double, referenceFrame: Unit, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Unit, height: Double, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Unit, height: Double, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Unit, height: Unit, referenceFrame: Unit, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Unit, height: Unit, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: String, lon: Unit, height: Unit, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object): LatLonEllipsoidalReferenceFrame = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any]).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Double, height: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Double, height: Double, referenceFrame: Unit, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Double, height: Double, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Double, height: Double, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Double, height: Unit, referenceFrame: Unit, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Double, height: Unit, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Double, height: Unit, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Unit, height: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Unit, height: Double, referenceFrame: Unit, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Unit, height: Double, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Unit, height: Double, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Unit, height: Unit, referenceFrame: Unit, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Unit, height: Unit, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: js.Object, lon: Unit, height: Unit, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    /* static member */
    inline def parse(lat: Double): LatLonEllipsoidalReferenceFrame = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any]).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Double, height: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Double, height: Double, referenceFrame: Unit, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Double, height: Double, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Double, height: Double, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Double, height: Unit, referenceFrame: Unit, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Double, height: Unit, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Double, height: Unit, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Unit, height: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Unit, height: Double, referenceFrame: Unit, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Unit, height: Double, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Unit, height: Double, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Unit, height: Unit, referenceFrame: Unit, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Unit, height: Unit, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
    inline def parse(lat: Double, lon: Unit, height: Unit, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], height.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], epoch.asInstanceOf[js.Any])).asInstanceOf[LatLonEllipsoidalReferenceFrame]
  }
  
  @JSImport("geodesy/latlon-ellipsoidal-referenceframe", "Cartesian")
  @js.native
  open class Cartesian protected () extends CartesianReferenceFrame {
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, referenceFrame: ReferenceFrame) = this()
    def this(x: Double, y: Double, z: Double, referenceFrame: Unit, epoch: Double) = this()
    def this(x: Double, y: Double, z: Double, referenceFrame: ReferenceFrame, epoch: Double) = this()
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/latlon-ellipsoidal-referenceframe", "Dms")
  @js.native
  open class Dms ()
    extends typings.geodesy.latlonEllipsoidalMod.Dms
  object Dms {
    
    @JSImport("geodesy/latlon-ellipsoidal-referenceframe", "Dms")
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
  trait CartesianReferenceFrame
    extends typings.geodesy.latlonEllipsoidalMod.Cartesian {
    
    def convertReferenceFrame(toReferenceFrame: ReferenceFrame): CartesianReferenceFrame = js.native
    
    def epoch: Double = js.native
    
    def referenceFrame: ReferenceFrame = js.native
    
    def toLatLon(): LatLonEllipsoidalReferenceFrame = js.native
  }
  
  @js.native
  trait LatLonEllipsoidalReferenceFrame
    extends typings.geodesy.latlonEllipsoidalMod.default {
    
    def convertReferenceFrame(toReferenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = js.native
    
    def epoch: Double = js.native
    
    def referenceFrame: ReferenceFrame = js.native
    
    def toString(format: Format): String = js.native
    def toString(format: Format, dp: Unit, dpHeight: Double): String = js.native
    def toString(format: Format, dp: Unit, dpHeight: Double, referenceFrame: ReferenceFrame): String = js.native
    def toString(format: Format, dp: Unit, dpHeight: Unit, referenceFrame: ReferenceFrame): String = js.native
    def toString(format: Format, dp: Dp): String = js.native
    def toString(format: Format, dp: Dp, dpHeight: Double): String = js.native
    def toString(format: Format, dp: Dp, dpHeight: Double, referenceFrame: ReferenceFrame): String = js.native
    def toString(format: Format, dp: Dp, dpHeight: Unit, referenceFrame: ReferenceFrame): String = js.native
  }
  
  trait ReferenceFrame extends StObject {
    
    var ellipsoid: Ellipsoid
    
    var epoch: Double
    
    var name: String
  }
  object ReferenceFrame {
    
    inline def apply(ellipsoid: Ellipsoid, epoch: Double, name: String): ReferenceFrame = {
      val __obj = js.Dynamic.literal(ellipsoid = ellipsoid.asInstanceOf[js.Any], epoch = epoch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReferenceFrame] (val x: Self) extends AnyVal {
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEpoch(value: Double): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ReferenceFrames = Plural[ReferenceFrame]
  
  trait TxParam extends StObject {
    
    var epoch: String
    
    var params: js.Tuple6[Double, Double, Double, Double, Double, Double]
    
    var rates: js.Tuple6[Double, Double, Double, Double, Double, Double]
  }
  object TxParam {
    
    inline def apply(
      epoch: String,
      params: js.Tuple6[Double, Double, Double, Double, Double, Double],
      rates: js.Tuple6[Double, Double, Double, Double, Double, Double]
    ): TxParam = {
      val __obj = js.Dynamic.literal(epoch = epoch.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any])
      __obj.asInstanceOf[TxParam]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TxParam] (val x: Self) extends AnyVal {
      
      inline def setEpoch(value: String): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Tuple6[Double, Double, Double, Double, Double, Double]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setRates(value: js.Tuple6[Double, Double, Double, Double, Double, Double]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    }
  }
  
  type TxParams = Plural[TxParam]
}
