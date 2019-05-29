package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntervalCondition extends js.Object {
  var high: js.UndefOr[scala.Double] = js.undefined
  var low: js.UndefOr[scala.Double] = js.undefined
}

object IntervalCondition {
  @scala.inline
  def apply(high: scala.Int | scala.Double = null, low: scala.Int | scala.Double = null): IntervalCondition = {
    val __obj = js.Dynamic.literal()
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalCondition]
  }
}

