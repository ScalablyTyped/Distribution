package typings.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1`[R] extends js.Object {
  def forEach(cb: js.Function1[/* r */ R, Unit]): Unit
}

object `1` {
  @scala.inline
  def apply[R](forEach: js.Function1[/* r */ R, Unit] => Unit): `1`[R] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[`1`[R]]
  }
}

