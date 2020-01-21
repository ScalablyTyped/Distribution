package typings.fluentFfmpeg.mod

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
    if (!js.isUndefined(fastSeek)) __obj.updateDynamic("fastSeek")(fastSeek.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (timemarks != null) __obj.updateDynamic("timemarks")(timemarks.asInstanceOf[js.Any])
    if (timestamps != null) __obj.updateDynamic("timestamps")(timestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotsConfig]
  }
}

