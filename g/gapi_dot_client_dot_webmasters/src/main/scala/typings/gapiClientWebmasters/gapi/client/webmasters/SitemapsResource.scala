package typings.gapiClientWebmasters.gapi.client.webmasters

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientWebmasters.AnonFeedpath
import typings.gapiClientWebmasters.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitemapsResource extends js.Object {
  /** Deletes a sitemap from this site. */
  def delete(request: AnonFeedpath): Request_[Unit]
  /** Retrieves information about a specific sitemap. */
  def get(request: AnonFeedpath): Request_[WmxSitemap]
  /** Lists the sitemaps-entries submitted for this site, or included in the sitemap index file (if sitemapIndex is specified in the request). */
  def list(request: AnonFields): Request_[SitemapsListResponse]
  /** Submits a sitemap for a site. */
  def submit(request: AnonFeedpath): Request_[Unit]
}

object SitemapsResource {
  @scala.inline
  def apply(
    delete: AnonFeedpath => Request_[Unit],
    get: AnonFeedpath => Request_[WmxSitemap],
    list: AnonFields => Request_[SitemapsListResponse],
    submit: AnonFeedpath => Request_[Unit]
  ): SitemapsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), submit = js.Any.fromFunction1(submit))
    __obj.asInstanceOf[SitemapsResource]
  }
}

