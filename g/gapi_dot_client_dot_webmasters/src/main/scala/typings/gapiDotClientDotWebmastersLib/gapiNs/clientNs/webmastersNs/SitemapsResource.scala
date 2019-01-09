package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitemapsResource extends js.Object {
  /** Deletes a sitemap from this site. */
  def delete(request: gapiDotClientDotWebmastersLib.Anon_AltFeedpath): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves information about a specific sitemap. */
  def get(request: gapiDotClientDotWebmastersLib.Anon_AltFeedpath): gapiDotClientLib.gapiNs.clientNs.Request[WmxSitemap]
  /** Lists the sitemaps-entries submitted for this site, or included in the sitemap index file (if sitemapIndex is specified in the request). */
  def list(request: gapiDotClientDotWebmastersLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[SitemapsListResponse]
  /** Submits a sitemap for a site. */
  def submit(request: gapiDotClientDotWebmastersLib.Anon_AltFeedpath): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

