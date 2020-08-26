package typings.freedom.freedom.Console

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Console extends js.Object {
  def debug(source: String, message: String): js.Promise[Unit] = js.native
  def error(source: String, message: String): js.Promise[Unit] = js.native
  def info(source: String, message: String): js.Promise[Unit] = js.native
  def log(source: String, message: String): js.Promise[Unit] = js.native
  def warn(source: String, message: String): js.Promise[Unit] = js.native
}

object Console {
  @scala.inline
  def apply(
    debug: (String, String) => js.Promise[Unit],
    error: (String, String) => js.Promise[Unit],
    info: (String, String) => js.Promise[Unit],
    log: (String, String) => js.Promise[Unit],
    warn: (String, String) => js.Promise[Unit]
  ): Console = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), log = js.Any.fromFunction2(log), warn = js.Any.fromFunction2(warn))
    __obj.asInstanceOf[Console]
  }
  @scala.inline
  implicit class ConsoleOps[Self <: typings.freedom.freedom.Console.Console] (val x: Self) extends AnyVal {
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
    def setDebug(value: (String, String) => js.Promise[Unit]): Self = this.set("debug", js.Any.fromFunction2(value))
    @scala.inline
    def setError(value: (String, String) => js.Promise[Unit]): Self = this.set("error", js.Any.fromFunction2(value))
    @scala.inline
    def setInfo(value: (String, String) => js.Promise[Unit]): Self = this.set("info", js.Any.fromFunction2(value))
    @scala.inline
    def setLog(value: (String, String) => js.Promise[Unit]): Self = this.set("log", js.Any.fromFunction2(value))
    @scala.inline
    def setWarn(value: (String, String) => js.Promise[Unit]): Self = this.set("warn", js.Any.fromFunction2(value))
  }
  
}

