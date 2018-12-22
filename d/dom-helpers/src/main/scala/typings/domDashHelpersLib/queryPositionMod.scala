package typings
package domDashHelpersLib

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
  def apply(element: stdLib.Element): domDashHelpersLib.queryOffsetMod.DomHelpersOffsetNs.DomHelpersRect = js.native
  /**
   * Return "offset" of the node to its offsetParent,
   * optionally you can specify the offset parent if different than the "real" one
   */
  def apply(element: stdLib.Element, offsetParent: stdLib.Node): domDashHelpersLib.queryOffsetMod.DomHelpersOffsetNs.DomHelpersRect = js.native
}

