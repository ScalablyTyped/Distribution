package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordingOptions extends js.Object {
  var maxDuration: js.UndefOr[scala.Double] = js.undefined
  var maxFileSize: js.UndefOr[scala.Double] = js.undefined
  var quality: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object RecordingOptions {
  @scala.inline
  def apply(
    maxDuration: scala.Int | scala.Double = null,
    maxFileSize: scala.Int | scala.Double = null,
    quality: java.lang.String | scala.Double = null
  ): RecordingOptions = {
    val __obj = js.Dynamic.literal()
    if (maxDuration != null) __obj.updateDynamic("maxDuration")(maxDuration.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingOptions]
  }
}

