package typings
package atEmberRunloopLib.atEmberRunloopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/runloop", "schedule")
@js.native
object schedule extends js.Object {
  def apply(
    queue: atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues,
    method: js.Function1[/* args */ js.Array[_], _],
    args: js.Any*
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def apply[Target](
    queue: atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues,
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    args: js.Any*
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
}

