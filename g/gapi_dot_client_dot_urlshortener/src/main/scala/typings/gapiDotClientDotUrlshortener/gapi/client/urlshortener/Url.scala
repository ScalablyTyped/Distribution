package typings.gapiDotClientDotUrlshortener.gapi.client.urlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  /** A summary of the click analytics for the short and long URL. Might not be present if not requested or currently unavailable. */
  var analytics: js.UndefOr[AnalyticsSummary] = js.undefined
  /** Time the short URL was created; ISO 8601 representation using the yyyy-MM-dd'T'HH:mm:ss.SSSZZ format, e.g. "2010-10-14T19:01:24.944+00:00". */
  var created: js.UndefOr[String] = js.undefined
  /** Short URL, e.g. "http://goo.gl/l6MS". */
  var id: js.UndefOr[String] = js.undefined
  /** The fixed string "urlshortener#url". */
  var kind: js.UndefOr[String] = js.undefined
  /** Long URL, e.g. "http://www.google.com/". Might not be present if the status is "REMOVED". */
  var longUrl: js.UndefOr[String] = js.undefined
  /**
    * Status of the target URL. Possible values: "OK", "MALWARE", "PHISHING", or "REMOVED". A URL might be marked "REMOVED" if it was flagged as spam, for
    * example.
    */
  var status: js.UndefOr[String] = js.undefined
}

object Url {
  @scala.inline
  def apply(
    analytics: AnalyticsSummary = null,
    created: String = null,
    id: String = null,
    kind: String = null,
    longUrl: String = null,
    status: String = null
  ): Url = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics)
    if (created != null) __obj.updateDynamic("created")(created)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (longUrl != null) __obj.updateDynamic("longUrl")(longUrl)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Url]
  }
}

