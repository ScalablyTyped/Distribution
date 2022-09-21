package typings.floatingUiDom

import typings.floatingUiDom.isMod.global.Window
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOffsetParentMod {
  
  @JSImport("@floating-ui/dom/src/utils/getOffsetParent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOffsetParent(element: Element): Element | Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetParent")(element.asInstanceOf[js.Any]).asInstanceOf[Element | Window]
}
