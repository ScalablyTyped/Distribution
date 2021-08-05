package typings.focusLock

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object correctFocusMod {
  
  @JSImport("focus-lock/dist/es5/utils/correctFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def correctNode(node: HTMLInputElement, nodes: js.Array[HTMLInputElement]): HTMLInputElement = (^.asInstanceOf[js.Dynamic].applyDynamic("correctNode")(node.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[HTMLInputElement]
  
  inline def correctNodes(nodes: js.Array[HTMLInputElement]): js.Array[HTMLInputElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("correctNodes")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLInputElement]]
}
