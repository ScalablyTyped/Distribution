package typings
package domDashMediacaptureDashRecordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRecorderOptions extends js.Object {
  var audioBitsPerSecond: js.UndefOr[scala.Double] = js.undefined
  var bitsPerSecond: js.UndefOr[scala.Double] = js.undefined
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  var videoBitsPerSecond: js.UndefOr[scala.Double] = js.undefined
}

object MediaRecorderOptions {
  @scala.inline
  def apply(
    audioBitsPerSecond: scala.Int | scala.Double = null,
    bitsPerSecond: scala.Int | scala.Double = null,
    mimeType: java.lang.String = null,
    videoBitsPerSecond: scala.Int | scala.Double = null
  ): MediaRecorderOptions = {
    val __obj = js.Dynamic.literal()
    if (audioBitsPerSecond != null) __obj.updateDynamic("audioBitsPerSecond")(audioBitsPerSecond.asInstanceOf[js.Any])
    if (bitsPerSecond != null) __obj.updateDynamic("bitsPerSecond")(bitsPerSecond.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (videoBitsPerSecond != null) __obj.updateDynamic("videoBitsPerSecond")(videoBitsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderOptions]
  }
}

