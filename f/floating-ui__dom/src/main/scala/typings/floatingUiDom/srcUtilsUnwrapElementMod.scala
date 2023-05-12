package typings.floatingUiDom

import typings.floatingUiDom.srcTypesMod.VirtualElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsUnwrapElementMod {
  
  @JSImport("@floating-ui/dom/src/utils/unwrapElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unwrapElement(element: VirtualElement): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapElement")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Element]]
  inline def unwrapElement(element: Element): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapElement")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Element]]
}
