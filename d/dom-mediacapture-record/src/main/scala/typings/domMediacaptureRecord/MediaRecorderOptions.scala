package typings.domMediacaptureRecord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRecorderOptions extends js.Object {
  var audioBitsPerSecond: js.UndefOr[Double] = js.undefined
  var bitsPerSecond: js.UndefOr[Double] = js.undefined
  var mimeType: js.UndefOr[String] = js.undefined
  var videoBitsPerSecond: js.UndefOr[Double] = js.undefined
}

object MediaRecorderOptions {
  @scala.inline
  def apply(
    audioBitsPerSecond: Int | Double = null,
    bitsPerSecond: Int | Double = null,
    mimeType: String = null,
    videoBitsPerSecond: Int | Double = null
  ): MediaRecorderOptions = {
    val __obj = js.Dynamic.literal()
    if (audioBitsPerSecond != null) __obj.updateDynamic("audioBitsPerSecond")(audioBitsPerSecond.asInstanceOf[js.Any])
    if (bitsPerSecond != null) __obj.updateDynamic("bitsPerSecond")(bitsPerSecond.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (videoBitsPerSecond != null) __obj.updateDynamic("videoBitsPerSecond")(videoBitsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderOptions]
  }
}

