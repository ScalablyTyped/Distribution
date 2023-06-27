package typings.floatingUiDom

import typings.floatingUiCore.srcTypesMod.Coords
import typings.floatingUiDom.srcTypesMod.VirtualElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetScaleMod {
  
  @JSImport("@floating-ui/dom/src/utils/getScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getScale(element: VirtualElement): Coords = ^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(element.asInstanceOf[js.Any]).asInstanceOf[Coords]
  inline def getScale(element: Element): Coords = ^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(element.asInstanceOf[js.Any]).asInstanceOf[Coords]
}
