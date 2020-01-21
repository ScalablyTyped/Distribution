package typings.ganacheCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLog extends js.Object {
  def log(msg: String): Unit
}

object AnonLog {
  @scala.inline
  def apply(log: String => Unit): AnonLog = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[AnonLog]
  }
}

