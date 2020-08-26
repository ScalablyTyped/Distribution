package typings.gapiClientWebmasters.gapi.client.webmasters

import typings.gapiClient.gapi.client.Request
import typings.gapiClientWebmasters.anon.Oauthtoken
import typings.gapiClientWebmasters.anon.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlcrawlerrorssamplesResource extends js.Object {
  /** Retrieves details about crawl errors for a site's sample URL. */
  def get(request: Oauthtoken): Request[UrlCrawlErrorsSample] = js.native
  /** Lists a site's sample URLs for the specified crawl error category and platform. */
  def list(request: Platform): Request[UrlCrawlErrorsSamplesListResponse] = js.native
  /** Marks the provided site's sample URL as fixed, and removes it from the samples list. */
  def markAsFixed(request: Oauthtoken): Request[Unit] = js.native
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
  @scala.inline
  implicit class UrlcrawlerrorssamplesResourceOps[Self <: UrlcrawlerrorssamplesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: Oauthtoken => Request[UrlCrawlErrorsSample]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Platform => Request[UrlCrawlErrorsSamplesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setMarkAsFixed(value: Oauthtoken => Request[Unit]): Self = this.set("markAsFixed", js.Any.fromFunction1(value))
  }
  
}

