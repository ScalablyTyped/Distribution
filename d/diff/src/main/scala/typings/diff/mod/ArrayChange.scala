package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayChange[T] extends js.Object {
  var added: js.UndefOr[Boolean] = js.native
  var count: js.UndefOr[Double] = js.native
  var removed: js.UndefOr[Boolean] = js.native
  var value: js.Array[T] = js.native
}

object ArrayChange {
  @scala.inline
  def apply[T](value: js.Array[T]): ArrayChange[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayChange[T]]
  }
  @scala.inline
  implicit class ArrayChangeOps[Self <: ArrayChange[_], T] (val x: Self with ArrayChange[T]) extends AnyVal {
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
    def setValueVarargs(value: T*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[T]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdded(value: Boolean): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdded: Self = this.set("added", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setRemoved(value: Boolean): Self = this.set("removed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
  }
  
}

