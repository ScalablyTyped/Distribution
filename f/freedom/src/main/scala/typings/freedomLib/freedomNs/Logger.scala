package typings
package freedomLib.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def debug(args: js.Any*): scala.Unit
  def error(args: js.Any*): scala.Unit
  def info(args: js.Any*): scala.Unit
  def log(args: js.Any*): scala.Unit
  def warn(args: js.Any*): scala.Unit
}

object Logger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => scala.Unit,
    error: /* repeated */ js.Any => scala.Unit,
    info: /* repeated */ js.Any => scala.Unit,
    log: /* repeated */ js.Any => scala.Unit,
    warn: /* repeated */ js.Any => scala.Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Logger]
  }
}

