package typings.googleDashAppsDashScript.GoogleAppsScript.UrlShortener.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsSnapshot extends js.Object {
  var browsers: js.UndefOr[js.Array[StringCount]] = js.undefined
  var countries: js.UndefOr[js.Array[StringCount]] = js.undefined
  var longUrlClicks: js.UndefOr[String] = js.undefined
  var platforms: js.UndefOr[js.Array[StringCount]] = js.undefined
  var referrers: js.UndefOr[js.Array[StringCount]] = js.undefined
  var shortUrlClicks: js.UndefOr[String] = js.undefined
}

object AnalyticsSnapshot {
  @scala.inline
  def apply(
    browsers: js.Array[StringCount] = null,
    countries: js.Array[StringCount] = null,
    longUrlClicks: String = null,
    platforms: js.Array[StringCount] = null,
    referrers: js.Array[StringCount] = null,
    shortUrlClicks: String = null
  ): AnalyticsSnapshot = {
    val __obj = js.Dynamic.literal()
    if (browsers != null) __obj.updateDynamic("browsers")(browsers)
    if (countries != null) __obj.updateDynamic("countries")(countries)
    if (longUrlClicks != null) __obj.updateDynamic("longUrlClicks")(longUrlClicks)
    if (platforms != null) __obj.updateDynamic("platforms")(platforms)
    if (referrers != null) __obj.updateDynamic("referrers")(referrers)
    if (shortUrlClicks != null) __obj.updateDynamic("shortUrlClicks")(shortUrlClicks)
    __obj.asInstanceOf[AnalyticsSnapshot]
  }
}

