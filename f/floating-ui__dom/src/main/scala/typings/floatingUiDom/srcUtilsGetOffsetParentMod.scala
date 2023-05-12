package typings.floatingUiDom

import typings.floatingUiDom.srcUtilsIsMod.global.Window
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetOffsetParentMod {
  
  @JSImport("@floating-ui/dom/src/utils/getOffsetParent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOffsetParent(element: Element): Element | Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetParent")(element.asInstanceOf[js.Any]).asInstanceOf[Element | Window]
  inline def getOffsetParent(element: Element, polyfill: Polyfill): Element | Window = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetParent")(element.asInstanceOf[js.Any], polyfill.asInstanceOf[js.Any])).asInstanceOf[Element | Window]
  
  type Polyfill = js.Function1[/* element */ HTMLElement, Element | Null]
}
