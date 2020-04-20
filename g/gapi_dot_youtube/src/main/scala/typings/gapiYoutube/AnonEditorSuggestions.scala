package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEditorSuggestions extends js.Object {
  /**
    * A list of video editing operations that might improve the video quality or playback experience of the uploaded video.
    */
  var editorSuggestions: js.Array[String]
  /**
    * A list of errors that will prevent YouTube from successfully processing the uploaded video. These errors indicate that, regardless of the videos current processing status, eventually, that status will almost certainly be failed.
    */
  var processingErrors: js.Array[String]
  /**
    * A list of suggestions that may improve YouTubes ability to process the video.
    */
  var processingHints: js.Array[String]
  /**
    * A list of reasons why YouTube may have difficulty transcoding the uploaded video or that might result in an erroneous transcoding. These warnings are generated before YouTube actually processes the uploaded video file. In addition, they identify issues that do not necessarily indicate that video processing will fail but that still might cause problems such as sync issues, video artifacts, or a missing audio track.
    */
  var processingWarnings: js.Array[String]
  /**
    * A list of keyword tags that could be added to the videos metadata to increase the likelihood that users will locate your video when searching or browsing on YouTube.
    */
  var tagSuggestions: js.Array[AnonCategoryRestricts]
}

object AnonEditorSuggestions {
  @scala.inline
  def apply(
    editorSuggestions: js.Array[String],
    processingErrors: js.Array[String],
    processingHints: js.Array[String],
    processingWarnings: js.Array[String],
    tagSuggestions: js.Array[AnonCategoryRestricts]
  ): AnonEditorSuggestions = {
    val __obj = js.Dynamic.literal(editorSuggestions = editorSuggestions.asInstanceOf[js.Any], processingErrors = processingErrors.asInstanceOf[js.Any], processingHints = processingHints.asInstanceOf[js.Any], processingWarnings = processingWarnings.asInstanceOf[js.Any], tagSuggestions = tagSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEditorSuggestions]
  }
}

