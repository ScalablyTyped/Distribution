package typings.gapiUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiUrlShortenerUrlResourceAnalyticsObject extends js.Object {
  /**
    * Top browsers, e.g. "Chrome"; sorted by (descending) click counts. Only present if this data is available.
    */
  var browsers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]
  /**
    * Top countries (expressed as country codes), e.g. "US" or "DE"; sorted by (descending) click counts. Only present if this data is available.
    */
  var countries: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]
  /**
    * Number of clicks on all goo.gl short URLs pointing to this long URL.
    */
  var longUrlClicks: String
  /**
    * Top platforms or OSes, e.g. "Windows"; sorted by (descending) click counts. Only present if this data is available.
    */
  var platforms: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]
  /**
    * Top referring hosts, e.g. "www.google.com"; sorted by (descending) click counts. Only present if this data is available.
    */
  var referrers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]
  /**
    * Number of clicks on this short URL.
    */
  var shortUrlClicks: String
}

object GoogleApiUrlShortenerUrlResourceAnalyticsObject {
  @scala.inline
  def apply(
    browsers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    countries: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    longUrlClicks: String,
    platforms: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    referrers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    shortUrlClicks: String
  ): GoogleApiUrlShortenerUrlResourceAnalyticsObject = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], countries = countries.asInstanceOf[js.Any], longUrlClicks = longUrlClicks.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], referrers = referrers.asInstanceOf[js.Any], shortUrlClicks = shortUrlClicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiUrlShortenerUrlResourceAnalyticsObject]
  }
}

