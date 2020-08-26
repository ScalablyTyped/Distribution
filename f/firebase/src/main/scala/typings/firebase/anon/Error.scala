package typings.firebase.anon

import typings.firebase.mod.firestore.DocumentSnapshot
import typings.firebase.mod.firestore.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.native
  var next: js.UndefOr[js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]] = js.native
}

object Error {
  @scala.inline
  def apply[T](): Error[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error[T]]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error[_], T] (val x: Self with Error[T]) extends AnyVal {
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
    def setError(value: /* error */ FirestoreError => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setNext(value: /* snapshot */ DocumentSnapshot[T] => Unit): Self = this.set("next", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

