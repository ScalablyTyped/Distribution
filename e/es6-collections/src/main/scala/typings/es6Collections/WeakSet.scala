package typings.es6Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeakSet[T] extends js.Object {
  def add(value: T): WeakSet[T] = js.native
  def clear(): Unit = js.native
  def delete(value: T): Boolean = js.native
  def has(value: T): Boolean = js.native
}

object WeakSet {
  @scala.inline
  def apply[T](add: T => WeakSet[T], clear: () => Unit, delete: T => Boolean, has: T => Boolean): WeakSet[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[WeakSet[T]]
  }
  @scala.inline
  implicit class WeakSetOps[Self <: WeakSet[_], T] (val x: Self with WeakSet[T]) extends AnyVal {
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
    def setAdd(value: T => WeakSet[T]): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setDelete(value: T => Boolean): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: T => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
  }
  
}

