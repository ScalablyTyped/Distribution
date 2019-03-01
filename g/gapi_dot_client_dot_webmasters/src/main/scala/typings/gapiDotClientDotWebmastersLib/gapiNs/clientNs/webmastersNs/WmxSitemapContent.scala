package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WmxSitemapContent extends js.Object {
  /** The number of URLs from the sitemap that were indexed (of the content type). */
  var indexed: js.UndefOr[java.lang.String] = js.undefined
  /** The number of URLs in the sitemap (of the content type). */
  var submitted: js.UndefOr[java.lang.String] = js.undefined
  /** The specific type of content in this sitemap. For example: web. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object WmxSitemapContent {
  @scala.inline
  def apply(
    indexed: java.lang.String = null,
    submitted: java.lang.String = null,
    `type`: java.lang.String = null
  ): WmxSitemapContent = {
    val __obj = js.Dynamic.literal()
    if (indexed != null) __obj.updateDynamic("indexed")(indexed)
    if (submitted != null) __obj.updateDynamic("submitted")(submitted)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WmxSitemapContent]
  }
}

