package typings.dynogels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log_ extends js.Object {
  def info(args: js.Any*): Unit = js.native
  def warn(args: js.Any*): Unit = js.native
}

object Log_ {
  @scala.inline
  def apply(info: /* repeated */ js.Any => Unit, warn: /* repeated */ js.Any => Unit): Log_ = {
    val __obj = js.Dynamic.literal(info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Log_]
  }
  @scala.inline
  implicit class Log_Ops[Self <: Log_] (val x: Self) extends AnyVal {
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
    def setInfo(value: /* repeated */ js.Any => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
  
}

