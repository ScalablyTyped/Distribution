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

object SitemapsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotWebmastersLib.Anon_AltFeedpath, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotWebmastersLib.Anon_AltFeedpath, 
      gapiDotClientLib.gapiNs.clientNs.Request[WmxSitemap]
    ],
    list: js.Function1[
      gapiDotClientDotWebmastersLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[SitemapsListResponse]
    ],
    submit: js.Function1[
      gapiDotClientDotWebmastersLib.Anon_AltFeedpath, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ]
  ): SitemapsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("submit")(submit)
    __obj.asInstanceOf[SitemapsResource]
  }
}

