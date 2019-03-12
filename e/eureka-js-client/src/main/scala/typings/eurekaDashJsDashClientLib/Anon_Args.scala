package typings
package eurekaDashJsDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  def debug(args: js.Any*): scala.Unit
  def error(args: js.Any*): scala.Unit
  def info(args: js.Any*): scala.Unit
  def warn(args: js.Any*): scala.Unit
}

object Anon_Args {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => scala.Unit,
    error: /* repeated */ js.Any => scala.Unit,
    info: /* repeated */ js.Any => scala.Unit,
    warn: /* repeated */ js.Any => scala.Unit
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Anon_Args]
  }
}

