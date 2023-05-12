package typings.floatingUiDom

import typings.floatingUiDom.srcUtilsIsMod.global.Window
import typings.std.Element
import typings.std.Node
import typings.std.VisualViewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetOverflowAncestorsMod {
  
  @JSImport("@floating-ui/dom/src/utils/getOverflowAncestors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOverflowAncestors(node: Node): OverflowAncestors = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowAncestors")(node.asInstanceOf[js.Any]).asInstanceOf[OverflowAncestors]
  inline def getOverflowAncestors(node: Node, list: OverflowAncestors): OverflowAncestors = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowAncestors")(node.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[OverflowAncestors]
  
  type OverflowAncestors = js.Array[Element | Window | VisualViewport]
}
