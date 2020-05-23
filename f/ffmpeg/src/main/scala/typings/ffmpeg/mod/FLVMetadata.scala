package typings.ffmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  duration  :number,   filesize  :string,   encoder  :string,   width  :number,   height  :number,   videodatarate  :number,   videocodecid  :string,   audiodatarate  :number,   audiosamplerate  :number,   stereo  :boolean,   audiocodecid  :string}> */
trait FLVMetadata extends js.Object {
  var audiocodecid: js.UndefOr[String] = js.undefined
  var audiodatarate: js.UndefOr[Double] = js.undefined
  var audiosamplerate: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var encoder: js.UndefOr[String] = js.undefined
  var filesize: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var stereo: js.UndefOr[Boolean] = js.undefined
  var videocodecid: js.UndefOr[String] = js.undefined
  var videodatarate: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object FLVMetadata {
  @scala.inline
  def apply(
    audiocodecid: String = null,
    audiodatarate: js.UndefOr[Double] = js.undefined,
    audiosamplerate: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    encoder: String = null,
    filesize: String = null,
    height: js.UndefOr[Double] = js.undefined,
    stereo: js.UndefOr[Boolean] = js.undefined,
    videocodecid: String = null,
    videodatarate: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): FLVMetadata = {
    val __obj = js.Dynamic.literal()
    if (audiocodecid != null) __obj.updateDynamic("audiocodecid")(audiocodecid.asInstanceOf[js.Any])
    if (!js.isUndefined(audiodatarate)) __obj.updateDynamic("audiodatarate")(audiodatarate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(audiosamplerate)) __obj.updateDynamic("audiosamplerate")(audiosamplerate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (encoder != null) __obj.updateDynamic("encoder")(encoder.asInstanceOf[js.Any])
    if (filesize != null) __obj.updateDynamic("filesize")(filesize.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stereo)) __obj.updateDynamic("stereo")(stereo.get.asInstanceOf[js.Any])
    if (videocodecid != null) __obj.updateDynamic("videocodecid")(videocodecid.asInstanceOf[js.Any])
    if (!js.isUndefined(videodatarate)) __obj.updateDynamic("videodatarate")(videodatarate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FLVMetadata]
  }
}

