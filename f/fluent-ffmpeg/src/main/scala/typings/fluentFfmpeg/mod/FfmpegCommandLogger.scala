package typings.fluentFfmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FfmpegCommandLogger extends js.Object {
  def debug(data: js.Any*): Unit = js.native
  def error(data: js.Any*): Unit = js.native
  def info(data: js.Any*): Unit = js.native
  def warn(data: js.Any*): Unit = js.native
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
  @scala.inline
  implicit class FfmpegCommandLoggerOps[Self <: FfmpegCommandLogger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDebug(value: /* repeated */ js.Any => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
  
}

