package typings.gapiClientDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDurationMillis extends js.Object {
  /** The duration of the video in milliseconds. */
  var durationMillis: js.UndefOr[String] = js.undefined
  /** The height of the video in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  /** The width of the video in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}

object AnonDurationMillis {
  @scala.inline
  def apply(durationMillis: String = null, height: Int | Double = null, width: Int | Double = null): AnonDurationMillis = {
    val __obj = js.Dynamic.literal()
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDurationMillis]
  }
}

