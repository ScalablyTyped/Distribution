package typings.dynogels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log_ extends js.Object {
  def info(args: js.Any*): Unit
  def warn(args: js.Any*): Unit
}

object Log_ {
  @scala.inline
  def apply(info: /* repeated */ js.Any => Unit, warn: /* repeated */ js.Any => Unit): Log_ = {
    val __obj = js.Dynamic.literal(info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Log_]
  }
}

