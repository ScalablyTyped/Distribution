package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlCrawlErrorsSamplesListResponse extends js.Object {
  /** Information about the sample URL and its crawl error. */
  var urlCrawlErrorSample: js.UndefOr[js.Array[UrlCrawlErrorsSample]] = js.undefined
}

object UrlCrawlErrorsSamplesListResponse {
  @scala.inline
  def apply(urlCrawlErrorSample: js.Array[UrlCrawlErrorsSample] = null): UrlCrawlErrorsSamplesListResponse = {
    val __obj = js.Dynamic.literal()
    if (urlCrawlErrorSample != null) __obj.updateDynamic("urlCrawlErrorSample")(urlCrawlErrorSample)
    __obj.asInstanceOf[UrlCrawlErrorsSamplesListResponse]
  }
}

