package typings.gapiClientWebmasters.gapi.client.webmasters

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientWebmasters.AnonCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlcrawlerrorscountsResource extends js.Object {
  /** Retrieves a time series of the number of URL crawl errors per error category and platform. */
  def query(request: AnonCategory): Request_[UrlCrawlErrorsCountsQueryResponse]
}

object UrlcrawlerrorscountsResource {
  @scala.inline
  def apply(query: AnonCategory => Request_[UrlCrawlErrorsCountsQueryResponse]): UrlcrawlerrorscountsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[UrlcrawlerrorscountsResource]
  }
}

