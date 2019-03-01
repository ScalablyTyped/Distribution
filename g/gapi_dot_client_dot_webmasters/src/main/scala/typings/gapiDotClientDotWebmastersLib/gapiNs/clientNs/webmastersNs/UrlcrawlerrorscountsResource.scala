package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlcrawlerrorscountsResource extends js.Object {
  /** Retrieves a time series of the number of URL crawl errors per error category and platform. */
  def query(request: gapiDotClientDotWebmastersLib.Anon_AltCategory): gapiDotClientLib.gapiNs.clientNs.Request[UrlCrawlErrorsCountsQueryResponse]
}

object UrlcrawlerrorscountsResource {
  @scala.inline
  def apply(
    query: js.Function1[
      gapiDotClientDotWebmastersLib.Anon_AltCategory, 
      gapiDotClientLib.gapiNs.clientNs.Request[UrlCrawlErrorsCountsQueryResponse]
    ]
  ): UrlcrawlerrorscountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[UrlcrawlerrorscountsResource]
  }
}

