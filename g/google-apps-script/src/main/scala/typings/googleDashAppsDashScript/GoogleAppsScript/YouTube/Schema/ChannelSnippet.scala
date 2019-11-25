package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSnippet extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var customUrl: js.UndefOr[String] = js.undefined
  var defaultLanguage: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var localized: js.UndefOr[ChannelLocalization] = js.undefined
  var publishedAt: js.UndefOr[String] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object ChannelSnippet {
  @scala.inline
  def apply(
    country: String = null,
    customUrl: String = null,
    defaultLanguage: String = null,
    description: String = null,
    localized: ChannelLocalization = null,
    publishedAt: String = null,
    thumbnails: ThumbnailDetails = null,
    title: String = null
  ): ChannelSnippet = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (customUrl != null) __obj.updateDynamic("customUrl")(customUrl.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(localized.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSnippet]
  }
}

