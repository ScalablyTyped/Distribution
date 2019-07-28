package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFileDetails extends js.Object {
  var audioStreams: js.UndefOr[js.Array[VideoFileDetailsAudioStream]] = js.undefined
  var bitrateBps: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var creationTime: js.UndefOr[String] = js.undefined
  var durationMs: js.UndefOr[String] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var fileSize: js.UndefOr[String] = js.undefined
  var fileType: js.UndefOr[String] = js.undefined
  var videoStreams: js.UndefOr[js.Array[VideoFileDetailsVideoStream]] = js.undefined
}

object VideoFileDetails {
  @scala.inline
  def apply(
    audioStreams: js.Array[VideoFileDetailsAudioStream] = null,
    bitrateBps: String = null,
    container: String = null,
    creationTime: String = null,
    durationMs: String = null,
    fileName: String = null,
    fileSize: String = null,
    fileType: String = null,
    videoStreams: js.Array[VideoFileDetailsVideoStream] = null
  ): VideoFileDetails = {
    val __obj = js.Dynamic.literal()
    if (audioStreams != null) __obj.updateDynamic("audioStreams")(audioStreams)
    if (bitrateBps != null) __obj.updateDynamic("bitrateBps")(bitrateBps)
    if (container != null) __obj.updateDynamic("container")(container)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize)
    if (fileType != null) __obj.updateDynamic("fileType")(fileType)
    if (videoStreams != null) __obj.updateDynamic("videoStreams")(videoStreams)
    __obj.asInstanceOf[VideoFileDetails]
  }
}

