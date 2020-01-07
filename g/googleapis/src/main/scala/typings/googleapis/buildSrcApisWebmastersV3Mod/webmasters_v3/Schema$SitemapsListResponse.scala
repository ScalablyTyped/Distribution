package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of sitemaps.
  */
@js.native
trait Schema$SitemapsListResponse extends js.Object {
  /**
    * Contains detailed information about a specific URL submitted as a
    * sitemap.
    */
  var sitemap: js.UndefOr[js.Array[Schema$WmxSitemap]] = js.native
}

object Schema$SitemapsListResponse {
  @scala.inline
  def apply(sitemap: js.Array[Schema$WmxSitemap] = null): Schema$SitemapsListResponse = {
    val __obj = js.Dynamic.literal()
    if (sitemap != null) __obj.updateDynamic("sitemap")(sitemap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SitemapsListResponse]
  }
}

