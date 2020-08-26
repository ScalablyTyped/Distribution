package typings.firebaseFirestoreTypes.anon

import typings.firebaseFirestoreTypes.mod.QuerySnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteError[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* error */ typings.std.Error, Unit]] = js.native
  var next: js.UndefOr[js.Function1[/* snapshot */ QuerySnapshot[T], Unit]] = js.native
}

object CompleteError {
  @scala.inline
  def apply[T](): CompleteError[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteError[T]]
  }
  @scala.inline
  implicit class CompleteErrorOps[Self <: CompleteError[_], T] (val x: Self with CompleteError[T]) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setError(value: /* error */ typings.std.Error => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setNext(value: /* snapshot */ QuerySnapshot[T] => Unit): Self = this.set("next", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

