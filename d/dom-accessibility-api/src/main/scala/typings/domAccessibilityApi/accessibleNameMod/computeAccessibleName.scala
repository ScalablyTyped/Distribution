package typings.domAccessibilityApi.accessibleNameMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-accessibility-api/dist/accessible-name", "computeAccessibleName")
@js.native
object computeAccessibleName extends js.Object {
  def apply(root: Element): String = js.native
  def apply(root: Element, options: GetComputedStyleOptions): String = js.native
}

