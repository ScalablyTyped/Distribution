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

