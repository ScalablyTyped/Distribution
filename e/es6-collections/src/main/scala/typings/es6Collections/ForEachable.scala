package typings.es6Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForEachable[T] extends js.Object {
  def forEach(callbackfn: js.Function1[/* value */ T, Unit]): Unit
}

object ForEachable {
  @scala.inline
  def apply[T](forEach: js.Function1[/* value */ T, Unit] => Unit): ForEachable[T] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[ForEachable[T]]
  }
}

