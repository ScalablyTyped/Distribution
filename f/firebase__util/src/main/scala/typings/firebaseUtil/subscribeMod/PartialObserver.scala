package typings.firebaseUtil.subscribeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@firebase/util.@firebase/util/dist/src/subscribe.Observer<T>> */
@js.native
trait PartialObserver[T] extends js.Object {
  var complete: js.UndefOr[CompleteFn] = js.native
  var error: js.UndefOr[ErrorFn] = js.native
  var next: js.UndefOr[NextFn[T]] = js.native
}

object PartialObserver {
  @scala.inline
  def apply[T](): PartialObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialObserver[T]]
  }
  @scala.inline
  implicit class PartialObserverOps[Self <: PartialObserver[_], T] (val x: Self with PartialObserver[T]) extends AnyVal {
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
    def setError(value: /* error */ Error => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setNext(value: T => Unit): Self = this.set("next", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

