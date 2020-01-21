package typings.gapiClientUrlshortener.gapi.client.urlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsSnapshot extends js.Object {
  /** Top browsers, e.g. "Chrome"; sorted by (descending) click counts. Only present if this data is available. */
  var browsers: js.UndefOr[js.Array[StringCount]] = js.undefined
  /** Top countries (expressed as country codes), e.g. "US" or "DE"; sorted by (descending) click counts. Only present if this data is available. */
  var countries: js.UndefOr[js.Array[StringCount]] = js.undefined
  /** Number of clicks on all goo.gl short URLs pointing to this long URL. */
  var longUrlClicks: js.UndefOr[String] = js.undefined
  /** Top platforms or OSes, e.g. "Windows"; sorted by (descending) click counts. Only present if this data is available. */
  var platforms: js.UndefOr[js.Array[StringCount]] = js.undefined
  /** Top referring hosts, e.g. "www.google.com"; sorted by (descending) click counts. Only present if this data is available. */
  var referrers: js.UndefOr[js.Array[StringCount]] = js.undefined
  /** Number of clicks on this short URL. */
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
    if (browsers != null) __obj.updateDynamic("browsers")(browsers.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (longUrlClicks != null) __obj.updateDynamic("longUrlClicks")(longUrlClicks.asInstanceOf[js.Any])
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    if (referrers != null) __obj.updateDynamic("referrers")(referrers.asInstanceOf[js.Any])
    if (shortUrlClicks != null) __obj.updateDynamic("shortUrlClicks")(shortUrlClicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsSnapshot]
  }
}

