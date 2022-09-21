package typings.floatingUiDom

import typings.floatingUiCore.typesMod.Rect
import typings.floatingUiCore.typesMod.Strategy
import typings.floatingUiCore.typesMod.VirtualElement
import typings.floatingUiDom.isMod.global.Window
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRectRelativeToOffsetParentMod {
  
  @JSImport("@floating-ui/dom/src/utils/getRectRelativeToOffsetParent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRectRelativeToOffsetParent(element: VirtualElement, offsetParent: Window, strategy: Strategy): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectRelativeToOffsetParent")(element.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def getRectRelativeToOffsetParent(element: VirtualElement, offsetParent: Element, strategy: Strategy): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectRelativeToOffsetParent")(element.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def getRectRelativeToOffsetParent(element: Element, offsetParent: Window, strategy: Strategy): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectRelativeToOffsetParent")(element.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def getRectRelativeToOffsetParent(element: Element, offsetParent: Element, strategy: Strategy): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectRelativeToOffsetParent")(element.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Rect]
}
