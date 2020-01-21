package typings.domHelpers

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/closest", JSImport.Namespace)
@js.native
object closestMod extends js.Object {
  def default(node: Element, selector: String): Element | Null = js.native
  def default(node: Element, selector: String, stopAt: Element): Element | Null = js.native
}

