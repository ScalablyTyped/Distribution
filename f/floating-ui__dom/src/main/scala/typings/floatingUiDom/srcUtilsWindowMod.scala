package typings.floatingUiDom

import typings.floatingUiDom.srcUtilsIsMod.global.Window
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsWindowMod {
  
  @JSImport("@floating-ui/dom/src/utils/window", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWindow(node: Window): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")(node.asInstanceOf[js.Any]).asInstanceOf[Window]
  inline def getWindow(node: Node): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")(node.asInstanceOf[js.Any]).asInstanceOf[Window]
  
  inline def isWindow(value: Any): /* is @floating-ui/dom.@floating-ui/dom/src/utils/is.<global>.Window */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindow")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @floating-ui/dom.@floating-ui/dom/src/utils/is.<global>.Window */ Boolean]
}
