package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionSnippet extends js.Object {
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var defaultLanguage: js.UndefOr[java.lang.String] = js.undefined
  var localized: js.UndefOr[ChannelSectionLocalization] = js.undefined
  var position: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelSectionSnippet {
  @scala.inline
  def apply(
    channelId: java.lang.String = null,
    defaultLanguage: java.lang.String = null,
    localized: ChannelSectionLocalization = null,
    position: scala.Int | scala.Double = null,
    style: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
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

