package typings.domDashHelpers

import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/getComputedStyle", JSImport.Namespace)
@js.native
object cjsGetComputedStyleMod extends js.Object {
  def default(node: HTMLElement): CSSStyleDeclaration = js.native
  def default(node: HTMLElement, psuedoElement: String): CSSStyleDeclaration = js.native
}

