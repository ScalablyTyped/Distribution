package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCbForEachR[R] extends js.Object {
  def forEach(cb: js.Function1[/* r */ R, Unit]): Unit
}

object AnonCbForEachR {
  @scala.inline
  def apply[R](forEach: js.Function1[/* r */ R, Unit] => Unit): AnonCbForEachR[R] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
  
    __obj.asInstanceOf[AnonCbForEachR[R]]
  }
}

