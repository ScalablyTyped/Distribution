package typings.gapiDotClientDotWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitemapsListResponse extends js.Object {
  /** Contains detailed information about a specific URL submitted as a sitemap. */
  var sitemap: js.UndefOr[js.Array[WmxSitemap]] = js.undefined
}

object SitemapsListResponse {
  @scala.inline
  def apply(sitemap: js.Array[WmxSitemap] = null): SitemapsListResponse = {
    val __obj = js.Dynamic.literal()
    if (sitemap != null) __obj.updateDynamic("sitemap")(sitemap)
    __obj.asInstanceOf[SitemapsListResponse]
  }
}

