package typings.domHelpers

import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dom-helpers/cjs/getComputedStyle", JSImport.Namespace)
@js.native
object getComputedStyleMod extends js.Object {
  
  def default(node: HTMLElement): CSSStyleDeclaration = js.native
  def default(node: HTMLElement, psuedoElement: String): CSSStyleDeclaration = js.native
}
