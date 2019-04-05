package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Video extends js.Object {
  var ageGating: js.UndefOr[VideoAgeGating] = js.undefined
  var contentDetails: js.UndefOr[VideoContentDetails] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var fileDetails: js.UndefOr[VideoFileDetails] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
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
    etag: java.lang.String = null,
    fileDetails: VideoFileDetails = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
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
    if (ageGating != null) __obj.updateDynamic("ageGating")(ageGating)
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (fileDetails != null) __obj.updateDynamic("fileDetails")(fileDetails)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (liveStreamingDetails != null) __obj.updateDynamic("liveStreamingDetails")(liveStreamingDetails)
    if (localizations != null) __obj.updateDynamic("localizations")(localizations)
    if (monetizationDetails != null) __obj.updateDynamic("monetizationDetails")(monetizationDetails)
    if (player != null) __obj.updateDynamic("player")(player)
    if (processingDetails != null) __obj.updateDynamic("processingDetails")(processingDetails)
    if (projectDetails != null) __obj.updateDynamic("projectDetails")(projectDetails)
    if (recordingDetails != null) __obj.updateDynamic("recordingDetails")(recordingDetails)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (status != null) __obj.updateDynamic("status")(status)
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions)
    if (topicDetails != null) __obj.updateDynamic("topicDetails")(topicDetails)
    __obj.asInstanceOf[Video]
  }
}

