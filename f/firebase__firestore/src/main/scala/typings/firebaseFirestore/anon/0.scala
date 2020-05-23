package typings.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[R, S] extends js.Object {
  def forEach(cb: js.Function2[/* r */ R, /* s */ S, Unit]): Unit
}

object `0` {
  @scala.inline
  def apply[R, S](forEach: js.Function2[/* r */ R, /* s */ S, Unit] => Unit): `0`[R, S] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[`0`[R, S]]
  }
}

