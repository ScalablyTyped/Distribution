package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceQuotasRemaining extends js.Object {
  var dailyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined
  var hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined
}

object ResourceQuotasRemaining {
  @scala.inline
  def apply(
    dailyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined,
    hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined
  ): ResourceQuotasRemaining = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dailyQuotaTokensRemaining)) __obj.updateDynamic("dailyQuotaTokensRemaining")(dailyQuotaTokensRemaining.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hourlyQuotaTokensRemaining)) __obj.updateDynamic("hourlyQuotaTokensRemaining")(hourlyQuotaTokensRemaining.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQuotasRemaining]
  }
}

