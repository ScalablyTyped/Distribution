package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WmxSitemap extends js.Object {
  /** The various content types in the sitemap. */
  var contents: js.UndefOr[js.Array[WmxSitemapContent]] = js.undefined
  /** Number of errors in the sitemap. These are issues with the sitemap itself that need to be fixed before it can be processed correctly. */
  var errors: js.UndefOr[java.lang.String] = js.undefined
  /** If true, the sitemap has not been processed. */
  var isPending: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, the sitemap is a collection of sitemaps. */
  var isSitemapsIndex: js.UndefOr[scala.Boolean] = js.undefined
  /** Date & time in which this sitemap was last downloaded. Date format is in RFC 3339 format (yyyy-mm-dd). */
  var lastDownloaded: js.UndefOr[java.lang.String] = js.undefined
  /** Date & time in which this sitemap was submitted. Date format is in RFC 3339 format (yyyy-mm-dd). */
  var lastSubmitted: js.UndefOr[java.lang.String] = js.undefined
  /** The url of the sitemap. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the sitemap. For example: rssFeed. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Number of warnings for the sitemap. These are generally non-critical issues with URLs in the sitemaps. */
  var warnings: js.UndefOr[java.lang.String] = js.undefined
}

object WmxSitemap {
  @scala.inline
  def apply(
    contents: js.Array[WmxSitemapContent] = null,
    errors: java.lang.String = null,
    isPending: js.UndefOr[scala.Boolean] = js.undefined,
    isSitemapsIndex: js.UndefOr[scala.Boolean] = js.undefined,
    lastDownloaded: java.lang.String = null,
    lastSubmitted: java.lang.String = null,
    path: java.lang.String = null,
    `type`: java.lang.String = null,
    warnings: java.lang.String = null
  ): WmxSitemap = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (!js.isUndefined(isPending)) __obj.updateDynamic("isPending")(isPending)
    if (!js.isUndefined(isSitemapsIndex)) __obj.updateDynamic("isSitemapsIndex")(isSitemapsIndex)
    if (lastDownloaded != null) __obj.updateDynamic("lastDownloaded")(lastDownloaded)
    if (lastSubmitted != null) __obj.updateDynamic("lastSubmitted")(lastSubmitted)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[WmxSitemap]
  }
}

