package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSettings extends js.Object {
  /** The country of the channel. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  var defaultLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** Which content tab users should see when viewing the channel. */
  var defaultTab: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the channel description. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Title for the featured channels tab. */
  var featuredChannelsTitle: js.UndefOr[java.lang.String] = js.undefined
  /** The list of featured channels. */
  var featuredChannelsUrls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Lists keywords associated with the channel, comma-separated. */
  var keywords: js.UndefOr[java.lang.String] = js.undefined
  /** Whether user-submitted comments left on the channel page need to be approved by the channel owner to be publicly visible. */
  var moderateComments: js.UndefOr[scala.Boolean] = js.undefined
  /** A prominent color that can be rendered on this channel page. */
  var profileColor: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the tab to browse the videos should be displayed. */
  var showBrowseView: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether related channels should be proposed. */
  var showRelatedChannels: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the channel title. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The ID for a Google Analytics account to track and measure traffic to the channels. */
  var trackingAnalyticsAccountId: js.UndefOr[java.lang.String] = js.undefined
  /** The trailer of the channel, for users that are not subscribers. */
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

