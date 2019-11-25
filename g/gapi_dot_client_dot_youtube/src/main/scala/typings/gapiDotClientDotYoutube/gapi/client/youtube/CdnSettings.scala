package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CdnSettings extends js.Object {
  /** The format of the video stream that you are sending to Youtube. */
  var format: js.UndefOr[String] = js.undefined
  /** The frame rate of the inbound video data. */
  var frameRate: js.UndefOr[String] = js.undefined
  /** The ingestionInfo object contains information that YouTube provides that you need to transmit your RTMP or HTTP stream to YouTube. */
  var ingestionInfo: js.UndefOr[IngestionInfo] = js.undefined
  /** The method or protocol used to transmit the video stream. */
  var ingestionType: js.UndefOr[String] = js.undefined
  /** The resolution of the inbound video data. */
  var resolution: js.UndefOr[String] = js.undefined
}

object CdnSettings {
  @scala.inline
  def apply(
    format: String = null,
    frameRate: String = null,
    ingestionInfo: IngestionInfo = null,
    ingestionType: String = null,
    resolution: String = null
  ): CdnSettings = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (ingestionInfo != null) __obj.updateDynamic("ingestionInfo")(ingestionInfo.asInstanceOf[js.Any])
    if (ingestionType != null) __obj.updateDynamic("ingestionType")(ingestionType.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[CdnSettings]
  }
}

