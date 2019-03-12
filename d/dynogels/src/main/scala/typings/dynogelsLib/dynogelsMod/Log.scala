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
  def apply(info: /* repeated */ js.Any => scala.Unit, warn: /* repeated */ js.Any => scala.Unit): Log = {
    val __obj = js.Dynamic.literal(info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Log]
  }
}

