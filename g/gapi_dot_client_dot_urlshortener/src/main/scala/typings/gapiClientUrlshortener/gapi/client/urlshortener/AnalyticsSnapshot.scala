package typings.gapiClientUrlshortener.gapi.client.urlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsSnapshot extends js.Object {
  /** Top browsers, e.g. "Chrome"; sorted by (descending) click counts. Only present if this data is available. */
  var browsers: js.UndefOr[js.Array[StringCount]] = js.native
  /** Top countries (expressed as country codes), e.g. "US" or "DE"; sorted by (descending) click counts. Only present if this data is available. */
  var countries: js.UndefOr[js.Array[StringCount]] = js.native
  /** Number of clicks on all goo.gl short URLs pointing to this long URL. */
  var longUrlClicks: js.UndefOr[String] = js.native
  /** Top platforms or OSes, e.g. "Windows"; sorted by (descending) click counts. Only present if this data is available. */
  var platforms: js.UndefOr[js.Array[StringCount]] = js.native
  /** Top referring hosts, e.g. "www.google.com"; sorted by (descending) click counts. Only present if this data is available. */
  var referrers: js.UndefOr[js.Array[StringCount]] = js.native
  /** Number of clicks on this short URL. */
  var shortUrlClicks: js.UndefOr[String] = js.native
}

object AnalyticsSnapshot {
  @scala.inline
  def apply(): AnalyticsSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsSnapshot]
  }
  @scala.inline
  implicit class AnalyticsSnapshotOps[Self <: AnalyticsSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrowsersVarargs(value: StringCount*): Self = this.set("browsers", js.Array(value :_*))
    @scala.inline
    def setBrowsers(value: js.Array[StringCount]): Self = this.set("browsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowsers: Self = this.set("browsers", js.undefined)
    @scala.inline
    def setCountriesVarargs(value: StringCount*): Self = this.set("countries", js.Array(value :_*))
    @scala.inline
    def setCountries(value: js.Array[StringCount]): Self = this.set("countries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountries: Self = this.set("countries", js.undefined)
    @scala.inline
    def setLongUrlClicks(value: String): Self = this.set("longUrlClicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongUrlClicks: Self = this.set("longUrlClicks", js.undefined)
    @scala.inline
    def setPlatformsVarargs(value: StringCount*): Self = this.set("platforms", js.Array(value :_*))
    @scala.inline
    def setPlatforms(value: js.Array[StringCount]): Self = this.set("platforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatforms: Self = this.set("platforms", js.undefined)
    @scala.inline
    def setReferrersVarargs(value: StringCount*): Self = this.set("referrers", js.Array(value :_*))
    @scala.inline
    def setReferrers(value: js.Array[StringCount]): Self = this.set("referrers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrers: Self = this.set("referrers", js.undefined)
    @scala.inline
    def setShortUrlClicks(value: String): Self = this.set("shortUrlClicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortUrlClicks: Self = this.set("shortUrlClicks", js.undefined)
  }
  
}

