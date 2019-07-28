package typings.ganacheDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Log extends js.Object {
  def log(msg: String): Unit
}

object Anon_Log {
  @scala.inline
  def apply(log: String => Unit): Anon_Log = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[Anon_Log]
  }
}

