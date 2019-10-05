package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceQuotasRemaining extends js.Object {
  var dailyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined
  var hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined
}

object ResourceQuotasRemaining {
  @scala.inline
  def apply(dailyQuotaTokensRemaining: Int | Double = null, hourlyQuotaTokensRemaining: Int | Double = null): ResourceQuotasRemaining = {
    val __obj = js.Dynamic.literal()
    if (dailyQuotaTokensRemaining != null) __obj.updateDynamic("dailyQuotaTokensRemaining")(dailyQuotaTokensRemaining.asInstanceOf[js.Any])
    if (hourlyQuotaTokensRemaining != null) __obj.updateDynamic("hourlyQuotaTokensRemaining")(hourlyQuotaTokensRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQuotasRemaining]
  }
}

