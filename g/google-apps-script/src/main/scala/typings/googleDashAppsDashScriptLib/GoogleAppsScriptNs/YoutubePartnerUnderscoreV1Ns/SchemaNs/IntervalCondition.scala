package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntervalCondition extends js.Object {
  var high: js.UndefOr[stdLib.Number] = js.undefined
  var low: js.UndefOr[stdLib.Number] = js.undefined
}

object IntervalCondition {
  @scala.inline
  def apply(high: stdLib.Number = null, low: stdLib.Number = null): IntervalCondition = {
    val __obj = js.Dynamic.literal()
    if (high != null) __obj.updateDynamic("high")(high)
    if (low != null) __obj.updateDynamic("low")(low)
    __obj.asInstanceOf[IntervalCondition]
  }
}

