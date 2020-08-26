package typings.es6Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForEachable[T] extends js.Object {
  def forEach(callbackfn: js.Function1[/* value */ T, Unit]): Unit = js.native
}

object ForEachable {
  @scala.inline
  def apply[T](forEach: js.Function1[/* value */ T, Unit] => Unit): ForEachable[T] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[ForEachable[T]]
  }
  @scala.inline
  implicit class ForEachableOps[Self <: ForEachable[_], T] (val x: Self with ForEachable[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForEach(value: js.Function1[/* value */ T, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
  }
  
}

