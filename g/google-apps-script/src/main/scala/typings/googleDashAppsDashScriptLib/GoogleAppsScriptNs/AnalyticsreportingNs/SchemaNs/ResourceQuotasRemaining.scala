package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceQuotasRemaining extends js.Object {
  var dailyQuotaTokensRemaining: js.UndefOr[scala.Double] = js.undefined
  var hourlyQuotaTokensRemaining: js.UndefOr[scala.Double] = js.undefined
}

object ResourceQuotasRemaining {
  @scala.inline
  def apply(
    dailyQuotaTokensRemaining: scala.Int | scala.Double = null,
    hourlyQuotaTokensRemaining: scala.Int | scala.Double = null
  ): ResourceQuotasRemaining = {
    val __obj = js.Dynamic.literal()
    if (dailyQuotaTokensRemaining != null) __obj.updateDynamic("dailyQuotaTokensRemaining")(dailyQuotaTokensRemaining.asInstanceOf[js.Any])
    if (hourlyQuotaTokensRemaining != null) __obj.updateDynamic("hourlyQuotaTokensRemaining")(hourlyQuotaTokensRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQuotasRemaining]
  }
}

