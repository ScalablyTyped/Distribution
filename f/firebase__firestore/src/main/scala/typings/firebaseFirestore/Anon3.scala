package typings.firebaseFirestore

import typings.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  def forEach(cb: js.Function1[/* el */ PersistencePromise[_], Unit]): Unit
}

object Anon3 {
  @scala.inline
  def apply(forEach: js.Function1[/* el */ PersistencePromise[_], Unit] => Unit): Anon3 = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
  
    __obj.asInstanceOf[Anon3]
  }
}

