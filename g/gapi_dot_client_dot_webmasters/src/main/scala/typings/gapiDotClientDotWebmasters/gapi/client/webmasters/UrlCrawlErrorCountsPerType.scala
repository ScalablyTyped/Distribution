package typings.gapiDotClientDotWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlCrawlErrorCountsPerType extends js.Object {
  /** The crawl error type. */
  var category: js.UndefOr[String] = js.undefined
  /** The error count entries time series. */
  var entries: js.UndefOr[js.Array[UrlCrawlErrorCount]] = js.undefined
  /** The general type of Googlebot that made the request (see list of Googlebot user-agents for the user-agents used). */
  var platform: js.UndefOr[String] = js.undefined
}

object UrlCrawlErrorCountsPerType {
  @scala.inline
  def apply(category: String = null, entries: js.Array[UrlCrawlErrorCount] = null, platform: String = null): UrlCrawlErrorCountsPerType = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[UrlCrawlErrorCountsPerType]
  }
}

