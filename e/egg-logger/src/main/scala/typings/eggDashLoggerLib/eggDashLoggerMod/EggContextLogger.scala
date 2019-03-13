package typings
package eggDashLoggerLib.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg-logger", "EggContextLogger")
@js.native
class EggContextLogger protected () extends js.Object {
  def this(ctx: js.Any, logger: Logger[LoggerOptions]) = this()
  val paddingMessage: java.lang.String = js.native
  def debug(msg: js.Any, args: js.Any*): scala.Unit = js.native
  def error(msg: js.Any, args: js.Any*): scala.Unit = js.native
  def info(msg: js.Any, args: js.Any*): scala.Unit = js.native
  def warn(msg: js.Any, args: js.Any*): scala.Unit = js.native
  def write(msg: java.lang.String): scala.Unit = js.native
}

