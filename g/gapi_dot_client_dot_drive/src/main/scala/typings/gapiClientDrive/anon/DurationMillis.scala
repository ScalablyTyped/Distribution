package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationMillis extends js.Object {
  /** The duration of the video in milliseconds. */
  var durationMillis: js.UndefOr[String] = js.undefined
  /** The height of the video in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  /** The width of the video in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}

object DurationMillis {
  @scala.inline
  def apply(
    durationMillis: String = null,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): DurationMillis = {
    val __obj = js.Dynamic.literal()
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationMillis]
  }
}

