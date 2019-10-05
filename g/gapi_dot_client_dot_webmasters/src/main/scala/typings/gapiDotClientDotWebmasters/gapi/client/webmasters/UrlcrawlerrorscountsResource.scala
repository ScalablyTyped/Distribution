package typings.gapiDotClientDotWebmasters.gapi.client.webmasters

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotWebmasters.Anon_AltCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlcrawlerrorscountsResource extends js.Object {
  /** Retrieves a time series of the number of URL crawl errors per error category and platform. */
  def query(request: Anon_AltCategory): Request[UrlCrawlErrorsCountsQueryResponse]
}

object UrlcrawlerrorscountsResource {
  @scala.inline
  def apply(query: Anon_AltCategory => Request[UrlCrawlErrorsCountsQueryResponse]): UrlcrawlerrorscountsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[UrlcrawlerrorscountsResource]
  }
}

