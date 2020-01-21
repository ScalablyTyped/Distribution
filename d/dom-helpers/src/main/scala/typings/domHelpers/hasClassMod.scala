package typings.domHelpers

import typings.std.Element
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/hasClass", JSImport.Namespace)
@js.native
object hasClassMod extends js.Object {
  def default(element: Element, className: String): Boolean = js.native
  def default(element: SVGElement, className: String): Boolean = js.native
}

