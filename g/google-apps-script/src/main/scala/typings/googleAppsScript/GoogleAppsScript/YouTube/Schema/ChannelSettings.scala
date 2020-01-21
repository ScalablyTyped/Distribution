package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSettings extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var defaultLanguage: js.UndefOr[String] = js.undefined
  var defaultTab: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var featuredChannelsTitle: js.UndefOr[String] = js.undefined
  var featuredChannelsUrls: js.UndefOr[js.Array[String]] = js.undefined
  var keywords: js.UndefOr[String] = js.undefined
  var moderateComments: js.UndefOr[Boolean] = js.undefined
  var profileColor: js.UndefOr[String] = js.undefined
  var showBrowseView: js.UndefOr[Boolean] = js.undefined
  var showRelatedChannels: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var trackingAnalyticsAccountId: js.UndefOr[String] = js.undefined
  var unsubscribedTrailer: js.UndefOr[String] = js.undefined
}

object ChannelSettings {
  @scala.inline
  def apply(
    country: String = null,
    defaultLanguage: String = null,
    defaultTab: String = null,
    description: String = null,
    featuredChannelsTitle: String = null,
    featuredChannelsUrls: js.Array[String] = null,
    keywords: String = null,
    moderateComments: js.UndefOr[Boolean] = js.undefined,
    profileColor: String = null,
    showBrowseView: js.UndefOr[Boolean] = js.undefined,
    showRelatedChannels: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    trackingAnalyticsAccountId: String = null,
    unsubscribedTrailer: String = null
  ): ChannelSettings = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (defaultTab != null) __obj.updateDynamic("defaultTab")(defaultTab.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (featuredChannelsTitle != null) __obj.updateDynamic("featuredChannelsTitle")(featuredChannelsTitle.asInstanceOf[js.Any])
    if (featuredChannelsUrls != null) __obj.updateDynamic("featuredChannelsUrls")(featuredChannelsUrls.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (!js.isUndefined(moderateComments)) __obj.updateDynamic("moderateComments")(moderateComments.asInstanceOf[js.Any])
    if (profileColor != null) __obj.updateDynamic("profileColor")(profileColor.asInstanceOf[js.Any])
    if (!js.isUndefined(showBrowseView)) __obj.updateDynamic("showBrowseView")(showBrowseView.asInstanceOf[js.Any])
    if (!js.isUndefined(showRelatedChannels)) __obj.updateDynamic("showRelatedChannels")(showRelatedChannels.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trackingAnalyticsAccountId != null) __obj.updateDynamic("trackingAnalyticsAccountId")(trackingAnalyticsAccountId.asInstanceOf[js.Any])
    if (unsubscribedTrailer != null) __obj.updateDynamic("unsubscribedTrailer")(unsubscribedTrailer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSettings]
  }
}

