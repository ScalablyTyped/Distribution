package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSettings extends js.Object {
  /** The country of the channel. */
  var country: js.UndefOr[String] = js.undefined
  var defaultLanguage: js.UndefOr[String] = js.undefined
  /** Which content tab users should see when viewing the channel. */
  var defaultTab: js.UndefOr[String] = js.undefined
  /** Specifies the channel description. */
  var description: js.UndefOr[String] = js.undefined
  /** Title for the featured channels tab. */
  var featuredChannelsTitle: js.UndefOr[String] = js.undefined
  /** The list of featured channels. */
  var featuredChannelsUrls: js.UndefOr[js.Array[String]] = js.undefined
  /** Lists keywords associated with the channel, comma-separated. */
  var keywords: js.UndefOr[String] = js.undefined
  /** Whether user-submitted comments left on the channel page need to be approved by the channel owner to be publicly visible. */
  var moderateComments: js.UndefOr[Boolean] = js.undefined
  /** A prominent color that can be rendered on this channel page. */
  var profileColor: js.UndefOr[String] = js.undefined
  /** Whether the tab to browse the videos should be displayed. */
  var showBrowseView: js.UndefOr[Boolean] = js.undefined
  /** Whether related channels should be proposed. */
  var showRelatedChannels: js.UndefOr[Boolean] = js.undefined
  /** Specifies the channel title. */
  var title: js.UndefOr[String] = js.undefined
  /** The ID for a Google Analytics account to track and measure traffic to the channels. */
  var trackingAnalyticsAccountId: js.UndefOr[String] = js.undefined
  /** The trailer of the channel, for users that are not subscribers. */
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

