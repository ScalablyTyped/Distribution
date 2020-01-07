package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * YouTube Data API
  *
  * Supports core YouTube features, such as uploading videos, creating and
  * managing playlists, searching for content, and much more.
  *
  * @example
  * const {google} = require('googleapis');
  * const youtube = google.youtube('v3');
  *
  * @namespace youtube
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Youtube
  */
@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Youtube")
@js.native
class Youtube protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var activities: Resource$Activities = js.native
  var captions: Resource$Captions = js.native
  var channelBanners: Resource$Channelbanners = js.native
  var channelSections: Resource$Channelsections = js.native
  var channels: Resource$Channels = js.native
  var commentThreads: Resource$Commentthreads = js.native
  var comments: Resource$Comments = js.native
  var context: APIRequestContext = js.native
  var guideCategories: Resource$Guidecategories = js.native
  var i18nLanguages: Resource$I18nlanguages = js.native
  var i18nRegions: Resource$I18nregions = js.native
  var liveBroadcasts: Resource$Livebroadcasts = js.native
  var liveChatBans: Resource$Livechatbans = js.native
  var liveChatMessages: Resource$Livechatmessages = js.native
  var liveChatModerators: Resource$Livechatmoderators = js.native
  var liveStreams: Resource$Livestreams = js.native
  var playlistItems: Resource$Playlistitems = js.native
  var playlists: Resource$Playlists = js.native
  var search: Resource$Search = js.native
  var sponsors: Resource$Sponsors = js.native
  var subscriptions: Resource$Subscriptions = js.native
  var superChatEvents: Resource$Superchatevents = js.native
  var thumbnails: Resource$Thumbnails = js.native
  var videoAbuseReportReasons: Resource$Videoabusereportreasons = js.native
  var videoCategories: Resource$Videocategories = js.native
  var videos: Resource$Videos = js.native
  var watermarks: Resource$Watermarks = js.native
}

