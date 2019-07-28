package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionSnippet extends js.Object {
  var channelId: js.UndefOr[String] = js.undefined
  var defaultLanguage: js.UndefOr[String] = js.undefined
  var localized: js.UndefOr[ChannelSectionLocalization] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ChannelSectionSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    defaultLanguage: String = null,
    localized: ChannelSectionLocalization = null,
    position: Int | Double = null,
    style: String = null,
    title: String = null,
    `type`: String = null
  ): ChannelSectionSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage)
    if (localized != null) __obj.updateDynamic("localized")(localized)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChannelSectionSnippet]
  }
}

