package typings.dynogels.dynogelsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  def info(args: js.Any*): Unit
  def warn(args: js.Any*): Unit
}

object Log {
  @scala.inline
  def apply(info: /* repeated */ js.Any => Unit, warn: /* repeated */ js.Any => Unit): Log = {
    val __obj = js.Dynamic.literal(info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Log]
  }
}

@JSImport("dynogels", "log")
@js.native
object log extends TopLevel[Log]

