package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedInterval extends js.Object {
  var high: js.UndefOr[stdLib.Number] = js.undefined
  var low: js.UndefOr[stdLib.Number] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var timeCreated: js.UndefOr[java.lang.String] = js.undefined
}

object ExcludedInterval {
  @scala.inline
  def apply(
    high: stdLib.Number = null,
    low: stdLib.Number = null,
    origin: java.lang.String = null,
    timeCreated: java.lang.String = null
  ): ExcludedInterval = {
    val __obj = js.Dynamic.literal()
    if (high != null) __obj.updateDynamic("high")(high)
    if (low != null) __obj.updateDynamic("low")(low)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated)
    __obj.asInstanceOf[ExcludedInterval]
  }
}

