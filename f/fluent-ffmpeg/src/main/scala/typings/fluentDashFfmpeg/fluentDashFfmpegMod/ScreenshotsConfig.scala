package typings.fluentDashFfmpeg.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenshotsConfig extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var fastSeek: js.UndefOr[Boolean] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var folder: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var timemarks: js.UndefOr[js.Array[Double | String]] = js.undefined
  var timestamps: js.UndefOr[js.Array[Double | String]] = js.undefined
}

object ScreenshotsConfig {
  @scala.inline
  def apply(
    count: Int | Double = null,
    fastSeek: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    folder: String = null,
    size: String = null,
    timemarks: js.Array[Double | String] = null,
    timestamps: js.Array[Double | String] = null
  ): ScreenshotsConfig = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(fastSeek)) __obj.updateDynamic("fastSeek")(fastSeek)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (folder != null) __obj.updateDynamic("folder")(folder)
    if (size != null) __obj.updateDynamic("size")(size)
    if (timemarks != null) __obj.updateDynamic("timemarks")(timemarks)
    if (timestamps != null) __obj.updateDynamic("timestamps")(timestamps)
    __obj.asInstanceOf[ScreenshotsConfig]
  }
}

