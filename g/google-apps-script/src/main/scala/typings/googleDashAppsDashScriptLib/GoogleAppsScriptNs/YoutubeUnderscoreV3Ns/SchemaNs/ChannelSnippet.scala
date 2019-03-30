package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSnippet extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var customUrl: js.UndefOr[java.lang.String] = js.undefined
  var defaultLanguage: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var localized: js.UndefOr[ChannelLocalization] = js.undefined
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelSnippet {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    customUrl: java.lang.String = null,
    defaultLanguage: java.lang.String = null,
    description: java.lang.String = null,
    localized: ChannelLocalization = null,
    publishedAt: java.lang.String = null,
    thumbnails: ThumbnailDetails = null,
    title: java.lang.String = null
  ): ChannelSnippet = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (customUrl != null) __obj.updateDynamic("customUrl")(customUrl)
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage)
    if (description != null) __obj.updateDynamic("description")(description)
    if (localized != null) __obj.updateDynamic("localized")(localized)
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ChannelSnippet]
  }
}

