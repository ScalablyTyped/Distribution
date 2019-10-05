package typings.atFrctlFractal

import typings.atFrctlFractal.atFrctlFractalMod.Adapter
import typings.atFrctlFractal.atFrctlFractalMod.fractal.core.entities.Entity
import typings.atFrctlFractal.atFrctlFractalMod.fractal.core.entities.EntitySource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App[T /* <: Entity */, TEngine] extends js.Object {
  def register(source: EntitySource[T, _], app: js.Any): Adapter[TEngine]
}

object Anon_App {
  @scala.inline
  def apply[T /* <: Entity */, TEngine](register: (EntitySource[T, _], js.Any) => Adapter[TEngine]): Anon_App[T, TEngine] = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[Anon_App[T, TEngine]]
  }
}

