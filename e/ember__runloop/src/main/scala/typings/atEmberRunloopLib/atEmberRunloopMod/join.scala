package typings
package atEmberRunloopLib.atEmberRunloopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/runloop", "join")
@js.native
object join extends js.Object {
  def apply[Ret](method: js.Function1[/* repeated */ js.Any, Ret], args: js.Any*): js.UndefOr[Ret] = js.native
  def apply[Target, Ret](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, Ret],
    args: js.Any*
  ): js.UndefOr[Ret] = js.native
}

