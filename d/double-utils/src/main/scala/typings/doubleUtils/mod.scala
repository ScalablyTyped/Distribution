package typings.doubleUtils

import typings.doubleUtils.doubleUtilsInts.`0`
import typings.doubleUtils.doubleUtilsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("double-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decompose(double: Double): js.Tuple3[/* sign */ Double, /* exp */ Double, /* frac */ Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decompose")(double.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[/* sign */ Double, /* exp */ Double, /* frac */ Double]]
  
  inline def exp(double: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("exp")(double.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def format(double: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(double.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(double: Double, /** @default true */
  guide: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(double.asInstanceOf[js.Any], guide.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def frac(double: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("frac")(double.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sign(double: Double): `0` | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(double.asInstanceOf[js.Any]).asInstanceOf[`0` | `1`]
}
