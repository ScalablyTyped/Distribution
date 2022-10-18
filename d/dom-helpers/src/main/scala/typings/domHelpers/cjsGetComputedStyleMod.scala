package typings.domHelpers

import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsGetComputedStyleMod {
  
  @JSImport("dom-helpers/cjs/getComputedStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: HTMLElement): CSSStyleDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[CSSStyleDeclaration]
  inline def default(node: HTMLElement, psuedoElement: String): CSSStyleDeclaration = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], psuedoElement.asInstanceOf[js.Any])).asInstanceOf[CSSStyleDeclaration]
}
