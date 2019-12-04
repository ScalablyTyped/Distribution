package typings.atFirebaseFirestore.distSrcRemoteConnectionMod

import typings.atFirebaseFirestore.distSrcUtilErrorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream[I, O] extends js.Object {
  def close(): Unit
  def onClose(callback: js.Function1[/* err */ js.UndefOr[FirestoreError], Unit]): Unit
  def onMessage(callback: js.Function1[/* msg */ O, Unit]): Unit
  def onOpen(callback: js.Function0[Unit]): Unit
  def send(msg: I): Unit
}

object Stream {
  @scala.inline
  def apply[I, O](
    close: () => Unit,
    onClose: js.Function1[/* err */ js.UndefOr[FirestoreError], Unit] => Unit,
    onMessage: js.Function1[/* msg */ O, Unit] => Unit,
    onOpen: js.Function0[Unit] => Unit,
    send: I => Unit
  ): Stream[I, O] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), onClose = js.Any.fromFunction1(onClose), onMessage = js.Any.fromFunction1(onMessage), onOpen = js.Any.fromFunction1(onOpen), send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[Stream[I, O]]
  }
}

