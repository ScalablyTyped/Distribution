package typings.domHelpers

import typings.std.Element
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/removeClass", JSImport.Namespace)
@js.native
object removeClassMod extends js.Object {
  def default(element: Element, className: String): Unit = js.native
  def default(element: SVGElement, className: String): Unit = js.native
}

