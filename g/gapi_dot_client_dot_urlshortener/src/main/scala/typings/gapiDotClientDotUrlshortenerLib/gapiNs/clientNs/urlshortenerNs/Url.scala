package typings
package gapiDotClientDotUrlshortenerLib.gapiNs.clientNs.urlshortenerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Url extends js.Object {
  /** A summary of the click analytics for the short and long URL. Might not be present if not requested or currently unavailable. */
  var analytics: js.UndefOr[AnalyticsSummary] = js.undefined
  /** Time the short URL was created; ISO 8601 representation using the yyyy-MM-dd'T'HH:mm:ss.SSSZZ format, e.g. "2010-10-14T19:01:24.944+00:00". */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Short URL, e.g. "http://goo.gl/l6MS". */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The fixed string "urlshortener#url". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Long URL, e.g. "http://www.google.com/". Might not be present if the status is "REMOVED". */
  var longUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Status of the target URL. Possible values: "OK", "MALWARE", "PHISHING", or "REMOVED". A URL might be marked "REMOVED" if it was flagged as spam, for
               * example.
               */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

