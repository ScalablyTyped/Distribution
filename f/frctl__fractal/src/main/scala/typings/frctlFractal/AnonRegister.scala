package typings.frctlFractal

import typings.frctlFractal.mod.Adapter
import typings.frctlFractal.mod.fractal.core.entities.Entity
import typings.frctlFractal.mod.fractal.core.entities.EntitySource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegister[T /* <: Entity */, TEngine] extends js.Object {
  def register(source: EntitySource[T, _], app: js.Any): Adapter[TEngine]
}

object AnonRegister {
  @scala.inline
  def apply[T /* <: Entity */, TEngine](register: (EntitySource[T, _], js.Any) => Adapter[TEngine]): AnonRegister[T, TEngine] = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[AnonRegister[T, TEngine]]
  }
}

