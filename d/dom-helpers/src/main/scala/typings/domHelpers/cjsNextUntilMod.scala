package typings.domHelpers

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsNextUntilMod {
  
  @JSImport("dom-helpers/cjs/nextUntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Null, selector: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def default(node: Element, selector: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
}
