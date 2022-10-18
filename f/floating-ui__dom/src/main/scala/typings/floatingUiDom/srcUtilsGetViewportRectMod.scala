package typings.floatingUiDom

import typings.floatingUiCore.srcTypesMod.Rect
import typings.floatingUiCore.srcTypesMod.Strategy
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetViewportRectMod {
  
  @JSImport("@floating-ui/dom/src/utils/getViewportRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getViewportRect(element: Element, strategy: Strategy): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getViewportRect")(element.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Rect]
}
