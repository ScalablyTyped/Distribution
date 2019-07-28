package typings.freedom.freedomNs.ConsoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Console extends js.Object {
  def debug(source: String, message: String): js.Promise[Unit]
  def error(source: String, message: String): js.Promise[Unit]
  def info(source: String, message: String): js.Promise[Unit]
  def log(source: String, message: String): js.Promise[Unit]
  def warn(source: String, message: String): js.Promise[Unit]
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
}

