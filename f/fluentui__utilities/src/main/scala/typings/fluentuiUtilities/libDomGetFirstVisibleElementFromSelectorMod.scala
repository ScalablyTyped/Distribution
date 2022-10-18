package typings.fluentuiUtilities

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomGetFirstVisibleElementFromSelectorMod {
  
  @JSImport("@fluentui/utilities/lib/dom/getFirstVisibleElementFromSelector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFirstVisibleElementFromSelector(selector: String): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstVisibleElementFromSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Element]]
}
