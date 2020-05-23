package typings.gapiClientYoutube

import typings.gapiClientYoutube.gapi.client.youtube.ActivitiesResource
import typings.gapiClientYoutube.gapi.client.youtube.CaptionsResource
import typings.gapiClientYoutube.gapi.client.youtube.ChannelBannersResource
import typings.gapiClientYoutube.gapi.client.youtube.ChannelSectionsResource
import typings.gapiClientYoutube.gapi.client.youtube.ChannelsResource
import typings.gapiClientYoutube.gapi.client.youtube.CommentThreadsResource
import typings.gapiClientYoutube.gapi.client.youtube.CommentsResource
import typings.gapiClientYoutube.gapi.client.youtube.FanFundingEventsResource
import typings.gapiClientYoutube.gapi.client.youtube.GuideCategoriesResource
import typings.gapiClientYoutube.gapi.client.youtube.I18nLanguagesResource
import typings.gapiClientYoutube.gapi.client.youtube.I18nRegionsResource
import typings.gapiClientYoutube.gapi.client.youtube.LiveBroadcastsResource
import typings.gapiClientYoutube.gapi.client.youtube.LiveChatBansResource
import typings.gapiClientYoutube.gapi.client.youtube.LiveChatMessagesResource
import typings.gapiClientYoutube.gapi.client.youtube.LiveChatModeratorsResource
import typings.gapiClientYoutube.gapi.client.youtube.LiveStreamsResource
import typings.gapiClientYoutube.gapi.client.youtube.PlaylistItemsResource
import typings.gapiClientYoutube.gapi.client.youtube.PlaylistsResource
import typings.gapiClientYoutube.gapi.client.youtube.SearchResource
import typings.gapiClientYoutube.gapi.client.youtube.SponsorsResource
import typings.gapiClientYoutube.gapi.client.youtube.SubscriptionsResource
import typings.gapiClientYoutube.gapi.client.youtube.SuperChatEventsResource
import typings.gapiClientYoutube.gapi.client.youtube.ThumbnailsResource
import typings.gapiClientYoutube.gapi.client.youtube.VideoAbuseReportReasonsResource
import typings.gapiClientYoutube.gapi.client.youtube.VideoCategoriesResource
import typings.gapiClientYoutube.gapi.client.youtube.VideosResource
import typings.gapiClientYoutube.gapi.client.youtube.WatermarksResource
import typings.gapiClientYoutube.gapiClientYoutubeStrings.v3
import typings.gapiClientYoutube.gapiClientYoutubeStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val activities: ActivitiesResource = js.native
      val captions: CaptionsResource = js.native
      val channelBanners: ChannelBannersResource = js.native
      val channelSections: ChannelSectionsResource = js.native
      val channels: ChannelsResource = js.native
      val commentThreads: CommentThreadsResource = js.native
      val comments: CommentsResource = js.native
      val fanFundingEvents: FanFundingEventsResource = js.native
      val guideCategories: GuideCategoriesResource = js.native
      val i18nLanguages: I18nLanguagesResource = js.native
      val i18nRegions: I18nRegionsResource = js.native
      val liveBroadcasts: LiveBroadcastsResource = js.native
      val liveChatBans: LiveChatBansResource = js.native
      val liveChatMessages: LiveChatMessagesResource = js.native
      val liveChatModerators: LiveChatModeratorsResource = js.native
      val liveStreams: LiveStreamsResource = js.native
      val playlistItems: PlaylistItemsResource = js.native
      val playlists: PlaylistsResource = js.native
      val search: SearchResource = js.native
      val sponsors: SponsorsResource = js.native
      val subscriptions: SubscriptionsResource = js.native
      val superChatEvents: SuperChatEventsResource = js.native
      val thumbnails: ThumbnailsResource = js.native
      val videoAbuseReportReasons: VideoAbuseReportReasonsResource = js.native
      val videoCategories: VideoCategoriesResource = js.native
      val videos: VideosResource = js.native
      val watermarks: WatermarksResource = js.native
      /** Load YouTube Data API v3 */
      def load(name: youtube, version: v3): js.Thenable[Unit] = js.native
      def load(name: youtube, version: v3, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

