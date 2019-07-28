package typings.expo.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordingOptions extends js.Object {
  var maxDuration: js.UndefOr[Double] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var quality: js.UndefOr[String | Double] = js.undefined
}

object RecordingOptions {
  @scala.inline
  def apply(
    maxDuration: Int | Double = null,
    maxFileSize: Int | Double = null,
    quality: String | Double = null
  ): RecordingOptions = {
    val __obj = js.Dynamic.literal()
    if (maxDuration != null) __obj.updateDynamic("maxDuration")(maxDuration.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingOptions]
  }
}

