package typings.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseFn[I] extends js.Object {
  def closeFn(): Unit
  def sendFn(msg: I): Unit
}

object CloseFn {
  @scala.inline
  def apply[I](closeFn: () => Unit, sendFn: I => Unit): CloseFn[I] = {
    val __obj = js.Dynamic.literal(closeFn = js.Any.fromFunction0(closeFn), sendFn = js.Any.fromFunction1(sendFn))
    __obj.asInstanceOf[CloseFn[I]]
  }
}

