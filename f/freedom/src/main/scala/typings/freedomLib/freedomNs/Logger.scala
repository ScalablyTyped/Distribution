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
    debug: js.Function1[/* repeated */ js.Any, scala.Unit],
    error: js.Function1[/* repeated */ js.Any, scala.Unit],
    info: js.Function1[/* repeated */ js.Any, scala.Unit],
    log: js.Function1[/* repeated */ js.Any, scala.Unit],
    warn: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Logger]
  }
}

