package typings.gapiDotClientDotWebmasters.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WmxSitemapContent extends js.Object {
  /** The number of URLs from the sitemap that were indexed (of the content type). */
  var indexed: js.UndefOr[String] = js.undefined
  /** The number of URLs in the sitemap (of the content type). */
  var submitted: js.UndefOr[String] = js.undefined
  /** The specific type of content in this sitemap. For example: web. */
  var `type`: js.UndefOr[String] = js.undefined
}

object WmxSitemapContent {
  @scala.inline
  def apply(indexed: String = null, submitted: String = null, `type`: String = null): WmxSitemapContent = {
    val __obj = js.Dynamic.literal()
    if (indexed != null) __obj.updateDynamic("indexed")(indexed)
    if (submitted != null) __obj.updateDynamic("submitted")(submitted)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WmxSitemapContent]
  }
}

