package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Brief description of the live stream cdn settings.
  */
@js.native
trait Schema$CdnSettings extends js.Object {
  /**
    * The format of the video stream that you are sending to Youtube.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The frame rate of the inbound video data.
    */
  var frameRate: js.UndefOr[String] = js.native
  /**
    * The ingestionInfo object contains information that YouTube provides that
    * you need to transmit your RTMP or HTTP stream to YouTube.
    */
  var ingestionInfo: js.UndefOr[Schema$IngestionInfo] = js.native
  /**
    * The method or protocol used to transmit the video stream.
    */
  var ingestionType: js.UndefOr[String] = js.native
  /**
    * The resolution of the inbound video data.
    */
  var resolution: js.UndefOr[String] = js.native
}

object Schema$CdnSettings {
  @scala.inline
  def apply(
    format: String = null,
    frameRate: String = null,
    ingestionInfo: Schema$IngestionInfo = null,
    ingestionType: String = null,
    resolution: String = null
  ): Schema$CdnSettings = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (ingestionInfo != null) __obj.updateDynamic("ingestionInfo")(ingestionInfo.asInstanceOf[js.Any])
    if (ingestionType != null) __obj.updateDynamic("ingestionType")(ingestionType.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CdnSettings]
  }
}

