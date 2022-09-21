package typings.floatingUiDom

import typings.std.CSSStyleDeclaration
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getComputedStyleMod {
  
  @JSImport("@floating-ui/dom/src/utils/getComputedStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getComputedStyle(element: Element): CSSStyleDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyle")(element.asInstanceOf[js.Any]).asInstanceOf[CSSStyleDeclaration]
}
