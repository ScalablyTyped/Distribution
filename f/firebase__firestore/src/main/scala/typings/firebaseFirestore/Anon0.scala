package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[R, S] extends js.Object {
  def forEach(cb: js.Function2[/* r */ R, /* s */ S, Unit]): Unit
}

object Anon0 {
  @scala.inline
  def apply[R, S](forEach: js.Function2[/* r */ R, /* s */ S, Unit] => Unit): Anon0[R, S] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
  
    __obj.asInstanceOf[Anon0[R, S]]
  }
}

