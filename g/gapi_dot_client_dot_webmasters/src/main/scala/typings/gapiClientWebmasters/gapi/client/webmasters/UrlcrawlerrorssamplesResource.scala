package typings.gapiClientWebmasters.gapi.client.webmasters

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientWebmasters.AnonOauthtoken
import typings.gapiClientWebmasters.AnonPlatform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlcrawlerrorssamplesResource extends js.Object {
  /** Retrieves details about crawl errors for a site's sample URL. */
  def get(request: AnonOauthtoken): Request_[UrlCrawlErrorsSample]
  /** Lists a site's sample URLs for the specified crawl error category and platform. */
  def list(request: AnonPlatform): Request_[UrlCrawlErrorsSamplesListResponse]
  /** Marks the provided site's sample URL as fixed, and removes it from the samples list. */
  def markAsFixed(request: AnonOauthtoken): Request_[Unit]
}

object UrlcrawlerrorssamplesResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => Request_[UrlCrawlErrorsSample],
    list: AnonPlatform => Request_[UrlCrawlErrorsSamplesListResponse],
    markAsFixed: AnonOauthtoken => Request_[Unit]
  ): UrlcrawlerrorssamplesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), markAsFixed = js.Any.fromFunction1(markAsFixed))
  
    __obj.asInstanceOf[UrlcrawlerrorssamplesResource]
  }
}

