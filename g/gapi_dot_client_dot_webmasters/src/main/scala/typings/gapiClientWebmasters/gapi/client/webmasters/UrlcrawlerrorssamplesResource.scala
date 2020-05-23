package typings.gapiClientWebmasters.gapi.client.webmasters

import typings.gapiClient.gapi.client.Request
import typings.gapiClientWebmasters.anon.Oauthtoken
import typings.gapiClientWebmasters.anon.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlcrawlerrorssamplesResource extends js.Object {
  /** Retrieves details about crawl errors for a site's sample URL. */
  def get(request: Oauthtoken): Request[UrlCrawlErrorsSample]
  /** Lists a site's sample URLs for the specified crawl error category and platform. */
  def list(request: Platform): Request[UrlCrawlErrorsSamplesListResponse]
  /** Marks the provided site's sample URL as fixed, and removes it from the samples list. */
  def markAsFixed(request: Oauthtoken): Request[Unit]
}

object UrlcrawlerrorssamplesResource {
  @scala.inline
  def apply(
    get: Oauthtoken => Request[UrlCrawlErrorsSample],
    list: Platform => Request[UrlCrawlErrorsSamplesListResponse],
    markAsFixed: Oauthtoken => Request[Unit]
  ): UrlcrawlerrorssamplesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), markAsFixed = js.Any.fromFunction1(markAsFixed))
    __obj.asInstanceOf[UrlcrawlerrorssamplesResource]
  }
}

