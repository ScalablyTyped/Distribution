package typings.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WmxSitemap extends js.Object {
  /** The various content types in the sitemap. */
  var contents: js.UndefOr[js.Array[WmxSitemapContent]] = js.undefined
  /** Number of errors in the sitemap. These are issues with the sitemap itself that need to be fixed before it can be processed correctly. */
  var errors: js.UndefOr[String] = js.undefined
  /** If true, the sitemap has not been processed. */
  var isPending: js.UndefOr[Boolean] = js.undefined
  /** If true, the sitemap is a collection of sitemaps. */
  var isSitemapsIndex: js.UndefOr[Boolean] = js.undefined
  /** Date & time in which this sitemap was last downloaded. Date format is in RFC 3339 format (yyyy-mm-dd). */
  var lastDownloaded: js.UndefOr[String] = js.undefined
  /** Date & time in which this sitemap was submitted. Date format is in RFC 3339 format (yyyy-mm-dd). */
  var lastSubmitted: js.UndefOr[String] = js.undefined
  /** The url of the sitemap. */
  var path: js.UndefOr[String] = js.undefined
  /** The type of the sitemap. For example: rssFeed. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Number of warnings for the sitemap. These are generally non-critical issues with URLs in the sitemaps. */
  var warnings: js.UndefOr[String] = js.undefined
}

object WmxSitemap {
  @scala.inline
  def apply(
    contents: js.Array[WmxSitemapContent] = null,
    errors: String = null,
    isPending: js.UndefOr[Boolean] = js.undefined,
    isSitemapsIndex: js.UndefOr[Boolean] = js.undefined,
    lastDownloaded: String = null,
    lastSubmitted: String = null,
    path: String = null,
    `type`: String = null,
    warnings: String = null
  ): WmxSitemap = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(isPending)) __obj.updateDynamic("isPending")(isPending.asInstanceOf[js.Any])
    if (!js.isUndefined(isSitemapsIndex)) __obj.updateDynamic("isSitemapsIndex")(isSitemapsIndex.asInstanceOf[js.Any])
    if (lastDownloaded != null) __obj.updateDynamic("lastDownloaded")(lastDownloaded.asInstanceOf[js.Any])
    if (lastSubmitted != null) __obj.updateDynamic("lastSubmitted")(lastSubmitted.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[WmxSitemap]
  }
}

