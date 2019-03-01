package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FfmpegCommandLogger extends js.Object {
  def debug(data: js.Any*): scala.Unit
  def error(data: js.Any*): scala.Unit
  def info(data: js.Any*): scala.Unit
  def warn(data: js.Any*): scala.Unit
}

object FfmpegCommandLogger {
  @scala.inline
  def apply(
    debug: js.Function1[/* repeated */ js.Any, scala.Unit],
    error: js.Function1[/* repeated */ js.Any, scala.Unit],
    info: js.Function1[/* repeated */ js.Any, scala.Unit],
    warn: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): FfmpegCommandLogger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[FfmpegCommandLogger]
  }
}

