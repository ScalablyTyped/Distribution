package typings.gapiDotClientDotWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlCrawlErrorCount extends js.Object {
  /** The error count at the given timestamp. */
  var count: js.UndefOr[String] = js.undefined
  /** The date and time when the crawl attempt took place, in RFC 3339 format. */
  var timestamp: js.UndefOr[String] = js.undefined
}

object UrlCrawlErrorCount {
  @scala.inline
  def apply(count: String = null, timestamp: String = null): UrlCrawlErrorCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlCrawlErrorCount]
  }
}

