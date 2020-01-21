package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

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
    if (audioTrackType != null) __obj.updateDynamic("audioTrackType")(audioTrackType.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (!js.isUndefined(isAutoSynced)) __obj.updateDynamic("isAutoSynced")(isAutoSynced.asInstanceOf[js.Any])
    if (!js.isUndefined(isCC)) __obj.updateDynamic("isCC")(isCC.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraft)) __obj.updateDynamic("isDraft")(isDraft.asInstanceOf[js.Any])
    if (!js.isUndefined(isEasyReader)) __obj.updateDynamic("isEasyReader")(isEasyReader.asInstanceOf[js.Any])
    if (!js.isUndefined(isLarge)) __obj.updateDynamic("isLarge")(isLarge.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastUpdated != null) __obj.updateDynamic("lastUpdated")(lastUpdated.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trackKind != null) __obj.updateDynamic("trackKind")(trackKind.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSnippet]
  }
}

