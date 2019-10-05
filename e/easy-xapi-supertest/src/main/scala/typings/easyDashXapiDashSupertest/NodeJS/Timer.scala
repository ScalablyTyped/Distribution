package typings.easyDashXapiDashSupertest.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  def ref(): Unit
  def unref(): Unit
}

object Timer {
  @scala.inline
  def apply(ref: () => Unit, unref: () => Unit): Timer = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
  
    __obj.asInstanceOf[Timer]
  }
}

