package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseFn[I] extends js.Object {
  def closeFn(): Unit
  def sendFn(msg: I): Unit
}

object AnonCloseFn {
  @scala.inline
  def apply[I](closeFn: () => Unit, sendFn: I => Unit): AnonCloseFn[I] = {
    val __obj = js.Dynamic.literal(closeFn = js.Any.fromFunction0(closeFn), sendFn = js.Any.fromFunction1(sendFn))
  
    __obj.asInstanceOf[AnonCloseFn[I]]
  }
}

