package typings.floatingUiDom

import typings.floatingUiCore.typesMod.Dimensions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDimensionsMod {
  
  @JSImport("@floating-ui/dom/src/utils/getDimensions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDimensions(element: Element): Dimensions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[Dimensions]
}
