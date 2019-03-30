package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSettings extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var defaultLanguage: js.UndefOr[java.lang.String] = js.undefined
  var defaultTab: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var featuredChannelsTitle: js.UndefOr[java.lang.String] = js.undefined
  var featuredChannelsUrls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var keywords: js.UndefOr[java.lang.String] = js.undefined
  var moderateComments: js.UndefOr[scala.Boolean] = js.undefined
  var profileColor: js.UndefOr[java.lang.String] = js.undefined
  var showBrowseView: js.UndefOr[scala.Boolean] = js.undefined
  var showRelatedChannels: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var trackingAnalyticsAccountId: js.UndefOr[java.lang.String] = js.undefined
  var unsubscribedTrailer: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelSettings {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    defaultLanguage: java.lang.String = null,
    defaultTab: java.lang.String = null,
    description: java.lang.String = null,
    featuredChannelsTitle: java.lang.String = null,
    featuredChannelsUrls: js.Array[java.lang.String] = null,
    keywords: java.lang.String = null,
    moderateComments: js.UndefOr[scala.Boolean] = js.undefined,
    profileColor: java.lang.String = null,
    showBrowseView: js.UndefOr[scala.Boolean] = js.undefined,
    showRelatedChannels: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    trackingAnalyticsAccountId: java.lang.String = null,
    unsubscribedTrailer: java.lang.String = null
  ): ChannelSettings = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage)
    if (defaultTab != null) __obj.updateDynamic("defaultTab")(defaultTab)
    if (description != null) __obj.updateDynamic("description")(description)
    if (featuredChannelsTitle != null) __obj.updateDynamic("featuredChannelsTitle")(featuredChannelsTitle)
    if (featuredChannelsUrls != null) __obj.updateDynamic("featuredChannelsUrls")(featuredChannelsUrls)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (!js.isUndefined(moderateComments)) __obj.updateDynamic("moderateComments")(moderateComments)
    if (profileColor != null) __obj.updateDynamic("profileColor")(profileColor)
    if (!js.isUndefined(showBrowseView)) __obj.updateDynamic("showBrowseView")(showBrowseView)
    if (!js.isUndefined(showRelatedChannels)) __obj.updateDynamic("showRelatedChannels")(showRelatedChannels)
    if (title != null) __obj.updateDynamic("title")(title)
    if (trackingAnalyticsAccountId != null) __obj.updateDynamic("trackingAnalyticsAccountId")(trackingAnalyticsAccountId)
    if (unsubscribedTrailer != null) __obj.updateDynamic("unsubscribedTrailer")(unsubscribedTrailer)
    __obj.asInstanceOf[ChannelSettings]
  }
}

