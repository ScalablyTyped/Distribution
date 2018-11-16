package typings
package gapiDotClientDotUrlshortenerLib.gapiNs.clientNs.urlshortenerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnalyticsSnapshot extends js.Object {
  /** Top browsers, e.g. "Chrome"; sorted by (descending) click counts. Only present if this data is available. */
  var browsers: js.UndefOr[js.Array[StringCount]] = js.undefined
  /** Top countries (expressed as country codes), e.g. "US" or "DE"; sorted by (descending) click counts. Only present if this data is available. */
  var countries: js.UndefOr[js.Array[StringCount]] = js.undefined
  /** Number of clicks on all goo.gl short URLs pointing to this long URL. */
  var longUrlClicks: js.UndefOr[java.lang.String] = js.undefined
  /** Top platforms or OSes, e.g. "Windows"; sorted by (descending) click counts. Only present if this data is available. */
  var platforms: js.UndefOr[js.Array[StringCount]] = js.undefined
  /** Top referring hosts, e.g. "www.google.com"; sorted by (descending) click counts. Only present if this data is available. */
  var referrers: js.UndefOr[js.Array[StringCount]] = js.undefined
  /** Number of clicks on this short URL. */
  var shortUrlClicks: js.UndefOr[java.lang.String] = js.undefined
}

