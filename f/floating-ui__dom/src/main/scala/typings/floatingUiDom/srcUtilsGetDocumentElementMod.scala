package typings.floatingUiDom

import typings.floatingUiDom.srcUtilsIsMod.global.Window
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetDocumentElementMod {
  
  @JSImport("@floating-ui/dom/src/utils/getDocumentElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocumentElement(node: Window): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentElement")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def getDocumentElement(node: Node): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentElement")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
}
