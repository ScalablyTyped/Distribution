package typings.floatingUiDom

import typings.floatingUiDom.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMathMod {
  
  @JSImport("@floating-ui/dom/src/utils/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEmptyCoords(v: Double): X = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyCoords")(v.asInstanceOf[js.Any]).asInstanceOf[X]
  
  inline def floor(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def max(values: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  
  inline def min(values: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  
  inline def round(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
}
