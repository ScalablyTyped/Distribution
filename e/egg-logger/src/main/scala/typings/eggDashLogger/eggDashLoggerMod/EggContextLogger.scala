package typings.eggDashLogger.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg-logger", "EggContextLogger")
@js.native
class EggContextLogger protected () extends js.Object {
  def this(ctx: js.Any, logger: Logger[LoggerOptions]) = this()
  val paddingMessage: String = js.native
  def debug(msg: js.Any, args: js.Any*): Unit = js.native
  def error(msg: js.Any, args: js.Any*): Unit = js.native
  def info(msg: js.Any, args: js.Any*): Unit = js.native
  def warn(msg: js.Any, args: js.Any*): Unit = js.native
  def write(msg: String): Unit = js.native
}

