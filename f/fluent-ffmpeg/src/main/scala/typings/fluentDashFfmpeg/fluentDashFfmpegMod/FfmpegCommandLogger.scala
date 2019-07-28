package typings.fluentDashFfmpeg.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FfmpegCommandLogger extends js.Object {
  def debug(data: js.Any*): Unit
  def error(data: js.Any*): Unit
  def info(data: js.Any*): Unit
  def warn(data: js.Any*): Unit
}

object FfmpegCommandLogger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    error: /* repeated */ js.Any => Unit,
    info: /* repeated */ js.Any => Unit,
    warn: /* repeated */ js.Any => Unit
  ): FfmpegCommandLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[FfmpegCommandLogger]
  }
}

