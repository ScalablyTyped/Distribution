package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

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
    if (audioStreams != null) __obj.updateDynamic("audioStreams")(audioStreams.asInstanceOf[js.Any])
    if (bitrateBps != null) __obj.updateDynamic("bitrateBps")(bitrateBps.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (videoStreams != null) __obj.updateDynamic("videoStreams")(videoStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFileDetails]
  }
}

