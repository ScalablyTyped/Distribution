package typings.firebaseFirestore

import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForEach extends js.Object {
  def forEach(cb: js.Function1[/* el */ PersistencePromise[_], Unit]): Unit
}

object AnonForEach {
  @scala.inline
  def apply(forEach: js.Function1[/* el */ PersistencePromise[_], Unit] => Unit): AnonForEach = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
  
    __obj.asInstanceOf[AnonForEach]
  }
}

