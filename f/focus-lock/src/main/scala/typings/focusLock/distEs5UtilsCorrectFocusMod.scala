package typings.focusLock

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5UtilsCorrectFocusMod {
  
  @JSImport("focus-lock/dist/es5/utils/correctFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def correctNode(node: HTMLElement, nodes: js.Array[HTMLElement]): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("correctNode")(node.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def correctNodes(nodes: js.Array[HTMLElement]): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("correctNodes")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
}
