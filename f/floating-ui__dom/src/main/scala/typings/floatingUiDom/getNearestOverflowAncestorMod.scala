package typings.floatingUiDom

import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNearestOverflowAncestorMod {
  
  @JSImport("@floating-ui/dom/src/utils/getNearestOverflowAncestor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNearestOverflowAncestor(node: Node): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getNearestOverflowAncestor")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
}
