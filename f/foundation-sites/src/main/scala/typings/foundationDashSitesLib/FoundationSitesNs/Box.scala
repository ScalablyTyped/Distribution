package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Utilities
// ---------
@js.native
trait Box extends js.Object {
  def GetDimensions(element: js.Object): js.Object = js.native
  def GetOffsets(
    element: js.Object,
    anchor: js.Object,
    position: java.lang.String,
    vOffset: scala.Double,
    hOffset: scala.Double,
    isOverflow: scala.Boolean
  ): js.Object = js.native
  def ImNotTouchingYou(element: js.Object): scala.Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object): scala.Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object, lrOnly: scala.Boolean): scala.Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object, lrOnly: scala.Boolean, tbOnly: scala.Boolean): scala.Boolean = js.native
}

