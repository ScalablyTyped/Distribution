package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod

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
    debug: /* repeated */ js.Any => scala.Unit,
    error: /* repeated */ js.Any => scala.Unit,
    info: /* repeated */ js.Any => scala.Unit,
    warn: /* repeated */ js.Any => scala.Unit
  ): FfmpegCommandLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[FfmpegCommandLogger]
  }
}

