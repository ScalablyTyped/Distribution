package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSnippet extends js.Object {
  var audioTrackType: js.UndefOr[String] = js.undefined
  var failureReason: js.UndefOr[String] = js.undefined
  var isAutoSynced: js.UndefOr[Boolean] = js.undefined
  var isCC: js.UndefOr[Boolean] = js.undefined
  var isDraft: js.UndefOr[Boolean] = js.undefined
  var isEasyReader: js.UndefOr[Boolean] = js.undefined
  var isLarge: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var lastUpdated: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var trackKind: js.UndefOr[String] = js.undefined
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

