package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Video extends js.Object {
  var ageGating: js.UndefOr[VideoAgeGating] = js.undefined
  var contentDetails: js.UndefOr[VideoContentDetails] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var fileDetails: js.UndefOr[VideoFileDetails] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var liveStreamingDetails: js.UndefOr[VideoLiveStreamingDetails] = js.undefined
  var localizations: js.UndefOr[js.Object] = js.undefined
  var monetizationDetails: js.UndefOr[VideoMonetizationDetails] = js.undefined
  var player: js.UndefOr[VideoPlayer] = js.undefined
  var processingDetails: js.UndefOr[VideoProcessingDetails] = js.undefined
  var projectDetails: js.UndefOr[VideoProjectDetails] = js.undefined
  var recordingDetails: js.UndefOr[VideoRecordingDetails] = js.undefined
  var snippet: js.UndefOr[VideoSnippet] = js.undefined
  var statistics: js.UndefOr[VideoStatistics] = js.undefined
  var status: js.UndefOr[VideoStatus] = js.undefined
  var suggestions: js.UndefOr[VideoSuggestions] = js.undefined
  var topicDetails: js.UndefOr[VideoTopicDetails] = js.undefined
}

object Video {
  @scala.inline
  def apply(
    ageGating: VideoAgeGating = null,
    contentDetails: VideoContentDetails = null,
    etag: String = null,
    fileDetails: VideoFileDetails = null,
    id: String = null,
    kind: String = null,
    liveStreamingDetails: VideoLiveStreamingDetails = null,
    localizations: js.Object = null,
    monetizationDetails: VideoMonetizationDetails = null,
    player: VideoPlayer = null,
    processingDetails: VideoProcessingDetails = null,
    projectDetails: VideoProjectDetails = null,
    recordingDetails: VideoRecordingDetails = null,
    snippet: VideoSnippet = null,
    statistics: VideoStatistics = null,
    status: VideoStatus = null,
    suggestions: VideoSuggestions = null,
    topicDetails: VideoTopicDetails = null
  ): Video = {
    val __obj = js.Dynamic.literal()
    if (ageGating != null) __obj.updateDynamic("ageGating")(ageGating.asInstanceOf[js.Any])
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (fileDetails != null) __obj.updateDynamic("fileDetails")(fileDetails.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (liveStreamingDetails != null) __obj.updateDynamic("liveStreamingDetails")(liveStreamingDetails.asInstanceOf[js.Any])
    if (localizations != null) __obj.updateDynamic("localizations")(localizations.asInstanceOf[js.Any])
    if (monetizationDetails != null) __obj.updateDynamic("monetizationDetails")(monetizationDetails.asInstanceOf[js.Any])
    if (player != null) __obj.updateDynamic("player")(player.asInstanceOf[js.Any])
    if (processingDetails != null) __obj.updateDynamic("processingDetails")(processingDetails.asInstanceOf[js.Any])
    if (projectDetails != null) __obj.updateDynamic("projectDetails")(projectDetails.asInstanceOf[js.Any])
    if (recordingDetails != null) __obj.updateDynamic("recordingDetails")(recordingDetails.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (topicDetails != null) __obj.updateDynamic("topicDetails")(topicDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
}

