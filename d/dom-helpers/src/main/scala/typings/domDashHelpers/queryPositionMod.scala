package typings.domDashHelpers

import typings.domDashHelpers.queryOffsetMod.DomHelpersRect
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/query/position", JSImport.Namespace)
@js.native
object queryPositionMod extends js.Object {
  /**
    * Return "offset" of the node to its offsetParent,
    * optionally you can specify the offset parent if different than the "real" one
    */
  def apply(element: Element): DomHelpersRect = js.native
  def apply(element: Element, offsetParent: Node): DomHelpersRect = js.native
}

