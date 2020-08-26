package typings.genericPool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Factory[T] extends js.Object {
  var validate: js.UndefOr[js.Function1[/* client */ T, js.Thenable[Boolean]]] = js.native
  def create(): js.Thenable[T] = js.native
  def destroy(client: T): js.Thenable[Unit] = js.native
}

object Factory {
  @scala.inline
  def apply[T](create: () => js.Thenable[T], destroy: T => js.Thenable[Unit]): Factory[T] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction1(destroy))
    __obj.asInstanceOf[Factory[T]]
  }
  @scala.inline
  implicit class FactoryOps[Self <: Factory[_], T] (val x: Self with Factory[T]) extends AnyVal {
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
    def setCreate(value: () => js.Thenable[T]): Self = this.set("create", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: T => js.Thenable[Unit]): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def setValidate(value: /* client */ T => js.Thenable[Boolean]): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

