package typings.gapiDotClientDotWebmasters.gapiNs.clientNs.webmastersNs

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
    if (count != null) __obj.updateDynamic("count")(count)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[UrlCrawlErrorCount]
  }
}

