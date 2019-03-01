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
    debug: js.Function2[java.lang.String, java.lang.String, js.Promise[scala.Unit]],
    error: js.Function2[java.lang.String, java.lang.String, js.Promise[scala.Unit]],
    info: js.Function2[java.lang.String, java.lang.String, js.Promise[scala.Unit]],
    log: js.Function2[java.lang.String, java.lang.String, js.Promise[scala.Unit]],
    warn: js.Function2[java.lang.String, java.lang.String, js.Promise[scala.Unit]]
  ): Console = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Console]
  }
}

