package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSnippet extends js.Object {
  /** The type of audio track associated with the caption track. */
  var audioTrackType: js.UndefOr[String] = js.undefined
  /** The reason that YouTube failed to process the caption track. This property is only present if the state property's value is failed. */
  var failureReason: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether YouTube synchronized the caption track to the audio track in the video. The value will be true if a sync was explicitly requested
    * when the caption track was uploaded. For example, when calling the captions.insert or captions.update methods, you can set the sync parameter to true
    * to instruct YouTube to sync the uploaded track to the video. If the value is false, YouTube uses the time codes in the uploaded caption track to
    * determine when to display captions.
    */
  var isAutoSynced: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the track contains closed captions for the deaf and hard of hearing. The default value is false. */
  var isCC: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the caption track is a draft. If the value is true, then the track is not publicly visible. The default value is false. */
  var isDraft: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether caption track is formatted for "easy reader," meaning it is at a third-grade level for language learners. The default value is false. */
  var isEasyReader: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the caption track uses large text for the vision-impaired. The default value is false. */
  var isLarge: js.UndefOr[Boolean] = js.undefined
  /** The language of the caption track. The property value is a BCP-47 language tag. */
  var language: js.UndefOr[String] = js.undefined
  /** The date and time when the caption track was last updated. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var lastUpdated: js.UndefOr[String] = js.undefined
  /** The name of the caption track. The name is intended to be visible to the user as an option during playback. */
  var name: js.UndefOr[String] = js.undefined
  /** The caption track's status. */
  var status: js.UndefOr[String] = js.undefined
  /** The caption track's type. */
  var trackKind: js.UndefOr[String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the video associated with the caption track. */
  var videoId: js.UndefOr[String] = js.undefined
}

object CaptionSnippet {
  @scala.inline
  def apply(
    audioTrackType: String = null,
    failureReason: String = null,
    isAutoSynced: js.UndefOr[Boolean] = js.undefined,
    isCC: js.UndefOr[Boolean] = js.undefined,
    isDraft: js.UndefOr[Boolean] = js.undefined,
    isEasyReader: js.UndefOr[Boolean] = js.undefined,
    isLarge: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    lastUpdated: String = null,
    name: String = null,
    status: String = null,
    trackKind: String = null,
    videoId: String = null
  ): CaptionSnippet = {
    val __obj = js.Dynamic.literal()
    if (audioTrackType != null) __obj.updateDynamic("audioTrackType")(audioTrackType)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (!js.isUndefined(isAutoSynced)) __obj.updateDynamic("isAutoSynced")(isAutoSynced)
    if (!js.isUndefined(isCC)) __obj.updateDynamic("isCC")(isCC)
    if (!js.isUndefined(isDraft)) __obj.updateDynamic("isDraft")(isDraft)
    if (!js.isUndefined(isEasyReader)) __obj.updateDynamic("isEasyReader")(isEasyReader)
    if (!js.isUndefined(isLarge)) __obj.updateDynamic("isLarge")(isLarge)
    if (language != null) __obj.updateDynamic("language")(language)
    if (lastUpdated != null) __obj.updateDynamic("lastUpdated")(lastUpdated)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status)
    if (trackKind != null) __obj.updateDynamic("trackKind")(trackKind)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[CaptionSnippet]
  }
}

