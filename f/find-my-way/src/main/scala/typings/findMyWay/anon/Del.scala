package typings.findMyWay.anon

import typings.findMyWay.mod.HTTPVersion
import typings.findMyWay.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Del[V /* <: HTTPVersion */] extends js.Object {
  def del(version: String): Unit = js.native
  def empty(): Unit = js.native
  def get(version: String): Handler[V] | Null = js.native
  def set(version: String, store: Handler[V]): Unit = js.native
}

object Del {
  @scala.inline
  def apply[/* <: typings.findMyWay.mod.HTTPVersion */ V](
    del: String => Unit,
    empty: () => Unit,
    get: String => Handler[V] | Null,
    set: (String, Handler[V]) => Unit
  ): Del[V] = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), empty = js.Any.fromFunction0(empty), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Del[V]]
  }
  @scala.inline
  implicit class DelOps[Self <: Del[_], /* <: typings.findMyWay.mod.HTTPVersion */ V] (val x: Self with Del[V]) extends AnyVal {
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
    def setDel(value: String => Unit): Self = this.set("del", js.Any.fromFunction1(value))
    @scala.inline
    def setEmpty(value: () => Unit): Self = this.set("empty", js.Any.fromFunction0(value))
    @scala.inline
    def setGet(value: String => Handler[V] | Null): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (String, Handler[V]) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

