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
    debug: js.Function1[/* repeated */ js.Any, scala.Unit],
    error: js.Function1[/* repeated */ js.Any, scala.Unit],
    info: js.Function1[/* repeated */ js.Any, scala.Unit],
    warn: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(debug = debug, error = error, info = info, warn = warn)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

