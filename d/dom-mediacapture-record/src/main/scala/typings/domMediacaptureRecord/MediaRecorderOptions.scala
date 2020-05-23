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
    audioBitsPerSecond: js.UndefOr[Double] = js.undefined,
    bitsPerSecond: js.UndefOr[Double] = js.undefined,
    mimeType: String = null,
    videoBitsPerSecond: js.UndefOr[Double] = js.undefined
  ): MediaRecorderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audioBitsPerSecond)) __obj.updateDynamic("audioBitsPerSecond")(audioBitsPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bitsPerSecond)) __obj.updateDynamic("bitsPerSecond")(bitsPerSecond.get.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(videoBitsPerSecond)) __obj.updateDynamic("videoBitsPerSecond")(videoBitsPerSecond.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderOptions]
  }
}

