package typings.gapiClientWebmasters.gapi.client.webmasters

import typings.gapiClient.gapi.client.Request
import typings.gapiClientWebmasters.anon.Feedpath
import typings.gapiClientWebmasters.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitemapsResource extends js.Object {
  /** Deletes a sitemap from this site. */
  def delete(request: Feedpath): Request[Unit]
  /** Retrieves information about a specific sitemap. */
  def get(request: Feedpath): Request[WmxSitemap]
  /** Lists the sitemaps-entries submitted for this site, or included in the sitemap index file (if sitemapIndex is specified in the request). */
  def list(request: Fields): Request[SitemapsListResponse]
  /** Submits a sitemap for a site. */
  def submit(request: Feedpath): Request[Unit]
}

object SitemapsResource {
  @scala.inline
  def apply(
    delete: Feedpath => Request[Unit],
    get: Feedpath => Request[WmxSitemap],
    list: Fields => Request[SitemapsListResponse],
    submit: Feedpath => Request[Unit]
  ): SitemapsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), submit = js.Any.fromFunction1(submit))
    __obj.asInstanceOf[SitemapsResource]
  }
}

