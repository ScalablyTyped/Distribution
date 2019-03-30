package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFileDetails extends js.Object {
  var audioStreams: js.UndefOr[js.Array[VideoFileDetailsAudioStream]] = js.undefined
  var bitrateBps: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  var durationMs: js.UndefOr[java.lang.String] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var fileSize: js.UndefOr[java.lang.String] = js.undefined
  var fileType: js.UndefOr[java.lang.String] = js.undefined
  var videoStreams: js.UndefOr[js.Array[VideoFileDetailsVideoStream]] = js.undefined
}

object VideoFileDetails {
  @scala.inline
  def apply(
    audioStreams: js.Array[VideoFileDetailsAudioStream] = null,
    bitrateBps: java.lang.String = null,
    container: java.lang.String = null,
    creationTime: java.lang.String = null,
    durationMs: java.lang.String = null,
    fileName: java.lang.String = null,
    fileSize: java.lang.String = null,
    fileType: java.lang.String = null,
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

