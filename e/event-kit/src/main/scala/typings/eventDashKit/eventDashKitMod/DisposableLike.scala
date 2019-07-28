package typings.eventDashKit.eventDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisposableLike extends js.Object {
  def dispose(): Unit
}

object DisposableLike {
  @scala.inline
  def apply(dispose: () => Unit): DisposableLike = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
  
    __obj.asInstanceOf[DisposableLike]
  }
}

