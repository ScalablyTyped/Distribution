package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSettings extends js.Object {
  /** The country of the channel. */
  var country: js.UndefOr[String] = js.native
  var defaultLanguage: js.UndefOr[String] = js.native
  /** Which content tab users should see when viewing the channel. */
  var defaultTab: js.UndefOr[String] = js.native
  /** Specifies the channel description. */
  var description: js.UndefOr[String] = js.native
  /** Title for the featured channels tab. */
  var featuredChannelsTitle: js.UndefOr[String] = js.native
  /** The list of featured channels. */
  var featuredChannelsUrls: js.UndefOr[js.Array[String]] = js.native
  /** Lists keywords associated with the channel, comma-separated. */
  var keywords: js.UndefOr[String] = js.native
  /** Whether user-submitted comments left on the channel page need to be approved by the channel owner to be publicly visible. */
  var moderateComments: js.UndefOr[Boolean] = js.native
  /** A prominent color that can be rendered on this channel page. */
  var profileColor: js.UndefOr[String] = js.native
  /** Whether the tab to browse the videos should be displayed. */
  var showBrowseView: js.UndefOr[Boolean] = js.native
  /** Whether related channels should be proposed. */
  var showRelatedChannels: js.UndefOr[Boolean] = js.native
  /** Specifies the channel title. */
  var title: js.UndefOr[String] = js.native
  /** The ID for a Google Analytics account to track and measure traffic to the channels. */
  var trackingAnalyticsAccountId: js.UndefOr[String] = js.native
  /** The trailer of the channel, for users that are not subscribers. */
  var unsubscribedTrailer: js.UndefOr[String] = js.native
}

object ChannelSettings {
  @scala.inline
  def apply(): ChannelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSettings]
  }
  @scala.inline
  implicit class ChannelSettingsOps[Self <: ChannelSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setDefaultLanguage(value: String): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLanguage: Self = this.set("defaultLanguage", js.undefined)
    @scala.inline
    def setDefaultTab(value: String): Self = this.set("defaultTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTab: Self = this.set("defaultTab", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFeaturedChannelsTitle(value: String): Self = this.set("featuredChannelsTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedChannelsTitle: Self = this.set("featuredChannelsTitle", js.undefined)
    @scala.inline
    def setFeaturedChannelsUrlsVarargs(value: String*): Self = this.set("featuredChannelsUrls", js.Array(value :_*))
    @scala.inline
    def setFeaturedChannelsUrls(value: js.Array[String]): Self = this.set("featuredChannelsUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedChannelsUrls: Self = this.set("featuredChannelsUrls", js.undefined)
    @scala.inline
    def setKeywords(value: String): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setModerateComments(value: Boolean): Self = this.set("moderateComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModerateComments: Self = this.set("moderateComments", js.undefined)
    @scala.inline
    def setProfileColor(value: String): Self = this.set("profileColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileColor: Self = this.set("profileColor", js.undefined)
    @scala.inline
    def setShowBrowseView(value: Boolean): Self = this.set("showBrowseView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBrowseView: Self = this.set("showBrowseView", js.undefined)
    @scala.inline
    def setShowRelatedChannels(value: Boolean): Self = this.set("showRelatedChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRelatedChannels: Self = this.set("showRelatedChannels", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrackingAnalyticsAccountId(value: String): Self = this.set("trackingAnalyticsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingAnalyticsAccountId: Self = this.set("trackingAnalyticsAccountId", js.undefined)
    @scala.inline
    def setUnsubscribedTrailer(value: String): Self = this.set("unsubscribedTrailer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsubscribedTrailer: Self = this.set("unsubscribedTrailer", js.undefined)
  }
  
}

