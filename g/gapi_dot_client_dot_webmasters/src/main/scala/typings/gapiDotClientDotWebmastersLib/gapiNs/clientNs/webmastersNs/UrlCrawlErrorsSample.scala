package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlCrawlErrorsSample extends js.Object {
  /** The time the error was first detected, in RFC 3339 format. */
  var first_detected: js.UndefOr[java.lang.String] = js.undefined
  /** The time when the URL was last crawled, in RFC 3339 format. */
  var last_crawled: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of an error, relative to the site. */
  var pageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The HTTP response code, if any. */
  var responseCode: js.UndefOr[scala.Double] = js.undefined
  /** Additional details about the URL, set only when calling get(). */
  var urlDetails: js.UndefOr[UrlSampleDetails] = js.undefined
}

