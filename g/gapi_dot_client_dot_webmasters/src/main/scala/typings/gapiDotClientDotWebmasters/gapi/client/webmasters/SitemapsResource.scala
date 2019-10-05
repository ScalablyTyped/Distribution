package typings.gapiDotClientDotWebmasters.gapi.client.webmasters

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotWebmasters.Anon_AltFeedpath
import typings.gapiDotClientDotWebmasters.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitemapsResource extends js.Object {
  /** Deletes a sitemap from this site. */
  def delete(request: Anon_AltFeedpath): Request[Unit]
  /** Retrieves information about a specific sitemap. */
  def get(request: Anon_AltFeedpath): Request[WmxSitemap]
  /** Lists the sitemaps-entries submitted for this site, or included in the sitemap index file (if sitemapIndex is specified in the request). */
  def list(request: Anon_AltFields): Request[SitemapsListResponse]
  /** Submits a sitemap for a site. */
  def submit(request: Anon_AltFeedpath): Request[Unit]
}

object SitemapsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFeedpath => Request[Unit],
    get: Anon_AltFeedpath => Request[WmxSitemap],
    list: Anon_AltFields => Request[SitemapsListResponse],
    submit: Anon_AltFeedpath => Request[Unit]
  ): SitemapsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), submit = js.Any.fromFunction1(submit))
  
    __obj.asInstanceOf[SitemapsResource]
  }
}

