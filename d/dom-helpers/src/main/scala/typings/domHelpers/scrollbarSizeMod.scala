package typings.domHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollbarSizeMod {
  
  @JSImport("dom-helpers/cjs/scrollbarSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Double]
  inline def default(recalc: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(recalc.asInstanceOf[js.Any]).asInstanceOf[Double]
}
