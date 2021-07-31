package typings.geodesy

import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dmsMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/dms", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Dms
  object default {
    
    @JSImport("geodesy/dms", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def compassPoint(bearing: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compassPoint")(bearing.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def compassPoint(bearing: Double, precision: Precision): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compassPoint")(bearing.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    @scala.inline
    def fromLocale(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLocale")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    @scala.inline
    def parse(dms: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dms.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def parse(dms: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dms.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    @scala.inline
    def toBrng(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def toBrng(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def toBrng(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def toBrng(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    @scala.inline
    def toDms(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def toDms(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def toDms(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def toDms(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    @scala.inline
    def toLat(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def toLat(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def toLat(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def toLat(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    @scala.inline
    def toLocale(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocale")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    @scala.inline
    def toLon(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def toLon(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def toLon(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def toLon(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    @scala.inline
    def wrap360(degrees: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap360")(degrees.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    @scala.inline
    def wrap90(degrees: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap90")(degrees.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  // tslint:disable-next-line no-unnecessary-class
  trait Dms extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.geodesy.geodesyNumbers.`1`
    - typings.geodesy.geodesyNumbers.`2`
    - typings.geodesy.geodesyNumbers.`3`
  */
  trait Precision extends StObject
  object Precision {
    
    @scala.inline
    def `1`: typings.geodesy.geodesyNumbers.`1` = 1.asInstanceOf[typings.geodesy.geodesyNumbers.`1`]
    
    @scala.inline
    def `2`: typings.geodesy.geodesyNumbers.`2` = 2.asInstanceOf[typings.geodesy.geodesyNumbers.`2`]
    
    @scala.inline
    def `3`: typings.geodesy.geodesyNumbers.`3` = 3.asInstanceOf[typings.geodesy.geodesyNumbers.`3`]
  }
}
