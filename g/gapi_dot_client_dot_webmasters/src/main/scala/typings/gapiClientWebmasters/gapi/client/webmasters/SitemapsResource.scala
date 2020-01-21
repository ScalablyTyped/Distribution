package typings.gapiClientWebmasters.gapi.client.webmasters

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientWebmasters.AnonAltFeedpath
import typings.gapiClientWebmasters.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitemapsResource extends js.Object {
  /** Deletes a sitemap from this site. */
  def delete(request: AnonAltFeedpath): Request_[Unit]
  /** Retrieves information about a specific sitemap. */
  def get(request: AnonAltFeedpath): Request_[WmxSitemap]
  /** Lists the sitemaps-entries submitted for this site, or included in the sitemap index file (if sitemapIndex is specified in the request). */
  def list(request: AnonAltFields): Request_[SitemapsListResponse]
  /** Submits a sitemap for a site. */
  def submit(request: AnonAltFeedpath): Request_[Unit]
}

object SitemapsResource {
  @scala.inline
  def apply(
    delete: AnonAltFeedpath => Request_[Unit],
    get: AnonAltFeedpath => Request_[WmxSitemap],
    list: AnonAltFields => Request_[SitemapsListResponse],
    submit: AnonAltFeedpath => Request_[Unit]
  ): SitemapsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), submit = js.Any.fromFunction1(submit))
  
    __obj.asInstanceOf[SitemapsResource]
  }
}

