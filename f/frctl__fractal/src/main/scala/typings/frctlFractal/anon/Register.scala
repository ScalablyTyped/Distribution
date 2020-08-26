package typings.frctlFractal.anon

import typings.frctlFractal.mod.Adapter
import typings.frctlFractal.mod.fractal.core.entities.Entity
import typings.frctlFractal.mod.fractal.core.entities.EntitySource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Register[T /* <: Entity */, TEngine] extends js.Object {
  def register(source: EntitySource[T, _], app: js.Any): Adapter[TEngine] = js.native
}

object Register {
  @scala.inline
  def apply[/* <: typings.frctlFractal.mod.fractal.core.entities.Entity */ T, TEngine](register: (EntitySource[T, _], js.Any) => Adapter[TEngine]): Register[T, TEngine] = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Register[T, TEngine]]
  }
  @scala.inline
  implicit class RegisterOps[Self <: Register[_, _], /* <: typings.frctlFractal.mod.fractal.core.entities.Entity */ T, TEngine] (val x: Self with (Register[T, TEngine])) extends AnyVal {
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
    def setRegister(value: (EntitySource[T, _], js.Any) => Adapter[TEngine]): Self = this.set("register", js.Any.fromFunction2(value))
  }
  
}

