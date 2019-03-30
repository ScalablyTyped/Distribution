package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetPosition extends js.Object {
  var left: js.UndefOr[scala.Double] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
}

object OffsetPosition {
  @scala.inline
  def apply(left: scala.Int | scala.Double = null, top: scala.Int | scala.Double = null): OffsetPosition = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetPosition]
  }
}

