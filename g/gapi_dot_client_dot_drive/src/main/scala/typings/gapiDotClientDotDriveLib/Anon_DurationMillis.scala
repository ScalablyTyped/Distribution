package typings
package gapiDotClientDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DurationMillis extends js.Object {
  /** The duration of the video in milliseconds. */
  var durationMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The height of the video in pixels. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The width of the video in pixels. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DurationMillis {
  @scala.inline
  def apply(
    durationMillis: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_DurationMillis = {
    val __obj = js.Dynamic.literal()
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DurationMillis]
  }
}

