package typings
package freedomLib.freedomNs.ConsoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Console extends js.Object {
  def debug(source: java.lang.String, message: java.lang.String): js.Promise[scala.Unit]
  def error(source: java.lang.String, message: java.lang.String): js.Promise[scala.Unit]
  def info(source: java.lang.String, message: java.lang.String): js.Promise[scala.Unit]
  def log(source: java.lang.String, message: java.lang.String): js.Promise[scala.Unit]
  def warn(source: java.lang.String, message: java.lang.String): js.Promise[scala.Unit]
}

object Console {
  @scala.inline
  def apply(
    debug: (java.lang.String, java.lang.String) => js.Promise[scala.Unit],
    error: (java.lang.String, java.lang.String) => js.Promise[scala.Unit],
    info: (java.lang.String, java.lang.String) => js.Promise[scala.Unit],
    log: (java.lang.String, java.lang.String) => js.Promise[scala.Unit],
    warn: (java.lang.String, java.lang.String) => js.Promise[scala.Unit]
  ): Console = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), log = js.Any.fromFunction2(log), warn = js.Any.fromFunction2(warn))
  
    __obj.asInstanceOf[Console]
  }
}

