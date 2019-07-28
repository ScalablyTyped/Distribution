package typings.gapiDotClientDotWebmasters.gapiNs.clientNs.webmastersNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotWebmasters.Anon_AltCategoryFields
import typings.gapiDotClientDotWebmasters.Anon_AltCategoryFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlcrawlerrorssamplesResource extends js.Object {
  /** Retrieves details about crawl errors for a site's sample URL. */
  def get(request: Anon_AltCategoryFields): Request[UrlCrawlErrorsSample]
  /** Lists a site's sample URLs for the specified crawl error category and platform. */
  def list(request: Anon_AltCategoryFieldsKey): Request[UrlCrawlErrorsSamplesListResponse]
  /** Marks the provided site's sample URL as fixed, and removes it from the samples list. */
  def markAsFixed(request: Anon_AltCategoryFields): Request[Unit]
}

object UrlcrawlerrorssamplesResource {
  @scala.inline
  def apply(
    get: Anon_AltCategoryFields => Request[UrlCrawlErrorsSample],
    list: Anon_AltCategoryFieldsKey => Request[UrlCrawlErrorsSamplesListResponse],
    markAsFixed: Anon_AltCategoryFields => Request[Unit]
  ): UrlcrawlerrorssamplesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), markAsFixed = js.Any.fromFunction1(markAsFixed))
  
    __obj.asInstanceOf[UrlcrawlerrorssamplesResource]
  }
}

