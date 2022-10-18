package typings.domHelpers

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsScrollTopMod {
  
  @JSImport("dom-helpers/cjs/scrollTop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(node: Element, `val`: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
