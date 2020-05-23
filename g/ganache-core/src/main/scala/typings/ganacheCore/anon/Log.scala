package typings.ganacheCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  def log(msg: String): Unit
}

object Log {
  @scala.inline
  def apply(log: String => Unit): Log = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[Log]
  }
}

