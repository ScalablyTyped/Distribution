package typings.floatingUiDom

import typings.floatingUiDom.srcUtilsIsMod.global.Window
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetWindowMod {
  
  @JSImport("@floating-ui/dom/src/utils/getWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWindow(node: Node): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")(node.asInstanceOf[js.Any]).asInstanceOf[Window]
}
