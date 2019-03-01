package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  def info(args: js.Any*): scala.Unit
  def warn(args: js.Any*): scala.Unit
}

object Log {
  @scala.inline
  def apply(
    info: js.Function1[/* repeated */ js.Any, scala.Unit],
    warn: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): Log = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Log]
  }
}

