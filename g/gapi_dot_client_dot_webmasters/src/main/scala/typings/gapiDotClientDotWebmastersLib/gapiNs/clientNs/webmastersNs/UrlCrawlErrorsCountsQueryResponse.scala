package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlCrawlErrorsCountsQueryResponse extends js.Object {
  /** The time series of the number of URL crawl errors per error category and platform. */
  var countPerTypes: js.UndefOr[js.Array[UrlCrawlErrorCountsPerType]] = js.undefined
}

object UrlCrawlErrorsCountsQueryResponse {
  @scala.inline
  def apply(countPerTypes: js.Array[UrlCrawlErrorCountsPerType] = null): UrlCrawlErrorsCountsQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (countPerTypes != null) __obj.updateDynamic("countPerTypes")(countPerTypes)
    __obj.asInstanceOf[UrlCrawlErrorsCountsQueryResponse]
  }
}

