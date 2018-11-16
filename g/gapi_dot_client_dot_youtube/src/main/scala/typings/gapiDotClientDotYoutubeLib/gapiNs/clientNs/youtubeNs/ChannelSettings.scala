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

