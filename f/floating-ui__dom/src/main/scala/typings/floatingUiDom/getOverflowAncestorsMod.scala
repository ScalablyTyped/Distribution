package typings.floatingUiDom

import typings.floatingUiDom.isMod.global.Window
import typings.std.Element
import typings.std.Node
import typings.std.VisualViewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOverflowAncestorsMod {
  
  @JSImport("@floating-ui/dom/src/utils/getOverflowAncestors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOverflowAncestors(node: Node): js.Array[Element | Window | VisualViewport] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowAncestors")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element | Window | VisualViewport]]
  inline def getOverflowAncestors(node: Node, list: js.Array[Element | Window]): js.Array[Element | Window | VisualViewport] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowAncestors")(node.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element | Window | VisualViewport]]
}
