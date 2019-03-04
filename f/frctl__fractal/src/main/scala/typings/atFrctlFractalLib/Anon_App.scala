package typings
package atFrctlFractalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App[T /* <: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity */, TEngine] extends js.Object {
  def register(
    source: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.EntitySource[T, _],
    app: js.Any
  ): atFrctlFractalLib.atFrctlFractalMod.Adapter[TEngine]
}

object Anon_App {
  @scala.inline
  def apply[T /* <: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity */, TEngine](
    register: js.Function2[
      atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.EntitySource[T, _], 
      js.Any, 
      atFrctlFractalLib.atFrctlFractalMod.Adapter[TEngine]
    ]
  ): Anon_App[T, TEngine] = {
    val __obj = js.Dynamic.literal(register = register)
  
    __obj.asInstanceOf[Anon_App[T, TEngine]]
  }
}

