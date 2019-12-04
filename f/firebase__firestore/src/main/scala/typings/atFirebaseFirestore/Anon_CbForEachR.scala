package typings.atFirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CbForEachR[R] extends js.Object {
  def forEach(cb: js.Function1[/* r */ R, Unit]): Unit
}

object Anon_CbForEachR {
  @scala.inline
  def apply[R](forEach: js.Function1[/* r */ R, Unit] => Unit): Anon_CbForEachR[R] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
  
    __obj.asInstanceOf[Anon_CbForEachR[R]]
  }
}

