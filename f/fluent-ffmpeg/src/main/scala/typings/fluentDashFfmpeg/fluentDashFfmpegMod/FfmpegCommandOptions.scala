package typings.fluentDashFfmpeg.fluentDashFfmpegMod

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
    niceness: Int | Double = null,
    preset: String = null,
    presets: String = null,
    priority: Int | Double = null,
    source: String | Readable = null,
    stdoutLines: Int | Double = null,
    timeout: Int | Double = null
  ): FfmpegCommandOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (niceness != null) __obj.updateDynamic("niceness")(niceness.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (presets != null) __obj.updateDynamic("presets")(presets.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (stdoutLines != null) __obj.updateDynamic("stdoutLines")(stdoutLines.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FfmpegCommandOptions]
  }
}

