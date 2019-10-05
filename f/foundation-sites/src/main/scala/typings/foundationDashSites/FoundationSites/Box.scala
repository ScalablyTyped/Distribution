package typings.foundationDashSites.FoundationSites

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
    position: String,
    vOffset: Double,
    hOffset: Double,
    isOverflow: Boolean
  ): js.Object = js.native
  def ImNotTouchingYou(element: js.Object): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object, lrOnly: Boolean): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object, lrOnly: Boolean, tbOnly: Boolean): Boolean = js.native
}

