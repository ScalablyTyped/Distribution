package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedInterval extends js.Object {
  var high: js.UndefOr[Double] = js.undefined
  var low: js.UndefOr[Double] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var timeCreated: js.UndefOr[String] = js.undefined
}

object ExcludedInterval {
  @scala.inline
  def apply(
    high: js.UndefOr[Double] = js.undefined,
    low: js.UndefOr[Double] = js.undefined,
    origin: String = null,
    timeCreated: String = null
  ): ExcludedInterval = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludedInterval]
  }
}

