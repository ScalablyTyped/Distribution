package typings.atFirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseFn[I] extends js.Object {
  def closeFn(): Unit
  def sendFn(msg: I): Unit
}

object Anon_CloseFn {
  @scala.inline
  def apply[I](closeFn: () => Unit, sendFn: I => Unit): Anon_CloseFn[I] = {
    val __obj = js.Dynamic.literal(closeFn = js.Any.fromFunction0(closeFn), sendFn = js.Any.fromFunction1(sendFn))
  
    __obj.asInstanceOf[Anon_CloseFn[I]]
  }
}

