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
    audiodatarate: Int | Double = null,
    audiosamplerate: Int | Double = null,
    duration: Int | Double = null,
    encoder: String = null,
    filesize: String = null,
    height: Int | Double = null,
    stereo: js.UndefOr[Boolean] = js.undefined,
    videocodecid: String = null,
    videodatarate: Int | Double = null,
    width: Int | Double = null
  ): FLVMetadata = {
    val __obj = js.Dynamic.literal()
    if (audiocodecid != null) __obj.updateDynamic("audiocodecid")(audiocodecid.asInstanceOf[js.Any])
    if (audiodatarate != null) __obj.updateDynamic("audiodatarate")(audiodatarate.asInstanceOf[js.Any])
    if (audiosamplerate != null) __obj.updateDynamic("audiosamplerate")(audiosamplerate.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (encoder != null) __obj.updateDynamic("encoder")(encoder.asInstanceOf[js.Any])
    if (filesize != null) __obj.updateDynamic("filesize")(filesize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(stereo)) __obj.updateDynamic("stereo")(stereo.asInstanceOf[js.Any])
    if (videocodecid != null) __obj.updateDynamic("videocodecid")(videocodecid.asInstanceOf[js.Any])
    if (videodatarate != null) __obj.updateDynamic("videodatarate")(videodatarate.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FLVMetadata]
  }
}

