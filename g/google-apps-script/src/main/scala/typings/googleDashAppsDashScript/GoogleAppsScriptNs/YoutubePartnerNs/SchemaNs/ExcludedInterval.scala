package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

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
    high: Int | Double = null,
    low: Int | Double = null,
    origin: String = null,
    timeCreated: String = null
  ): ExcludedInterval = {
    val __obj = js.Dynamic.literal()
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated)
    __obj.asInstanceOf[ExcludedInterval]
  }
}

