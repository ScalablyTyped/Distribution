package typings.fluentFfmpeg.mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FfmpegCommandOptions extends js.Object {
  var logger: js.UndefOr[FfmpegCommandLogger] = js.undefined
  var niceness: js.UndefOr[Double] = js.undefined
  var preset: js.UndefOr[String] = js.undefined
  var presets: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[String | Readable] = js.undefined
  var stdoutLines: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object FfmpegCommandOptions {
  @scala.inline
  def apply(
    logger: FfmpegCommandLogger = null,
    niceness: js.UndefOr[Double] = js.undefined,
    preset: String = null,
    presets: String = null,
    priority: js.UndefOr[Double] = js.undefined,
    source: String | Readable = null,
    stdoutLines: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): FfmpegCommandOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(niceness)) __obj.updateDynamic("niceness")(niceness.get.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (presets != null) __obj.updateDynamic("presets")(presets.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(stdoutLines)) __obj.updateDynamic("stdoutLines")(stdoutLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FfmpegCommandOptions]
  }
}

