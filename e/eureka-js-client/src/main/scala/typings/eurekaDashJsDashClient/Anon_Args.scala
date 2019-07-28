package typings.eurekaDashJsDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  def debug(args: js.Any*): Unit
  def error(args: js.Any*): Unit
  def info(args: js.Any*): Unit
  def warn(args: js.Any*): Unit
}

object Anon_Args {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    error: /* repeated */ js.Any => Unit,
    info: /* repeated */ js.Any => Unit,
    warn: /* repeated */ js.Any => Unit
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Anon_Args]
  }
}

