package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FfmpegCommandOptions extends js.Object {
  var logger: js.UndefOr[FfmpegCommandLogger] = js.undefined
  var niceness: js.UndefOr[scala.Double] = js.undefined
  var preset: js.UndefOr[java.lang.String] = js.undefined
  var presets: js.UndefOr[java.lang.String] = js.undefined
  var priority: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[java.lang.String | nodeLib.streamMod.Readable] = js.undefined
  var stdoutLines: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object FfmpegCommandOptions {
  @scala.inline
  def apply(
    logger: FfmpegCommandLogger = null,
    niceness: scala.Int | scala.Double = null,
    preset: java.lang.String = null,
    presets: java.lang.String = null,
    priority: scala.Int | scala.Double = null,
    source: java.lang.String | nodeLib.streamMod.Readable = null,
    stdoutLines: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): FfmpegCommandOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (niceness != null) __obj.updateDynamic("niceness")(niceness.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset)
    if (presets != null) __obj.updateDynamic("presets")(presets)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (stdoutLines != null) __obj.updateDynamic("stdoutLines")(stdoutLines.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FfmpegCommandOptions]
  }
}

