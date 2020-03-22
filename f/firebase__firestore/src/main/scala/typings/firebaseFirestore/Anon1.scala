package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1[R] extends js.Object {
  def forEach(cb: js.Function1[/* r */ R, Unit]): Unit
}

object Anon1 {
  @scala.inline
  def apply[R](forEach: js.Function1[/* r */ R, Unit] => Unit): Anon1[R] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
  
    __obj.asInstanceOf[Anon1[R]]
  }
}

