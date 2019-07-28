package typings.atEmberRunloop.atEmberRunloopMod

import typings.atEmberRunloop.dashPrivateTypesMod.RunMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/runloop", "join")
@js.native
object join extends js.Object {
  def apply[Ret](method: js.Function1[/* repeated */ js.Any, Ret], args: js.Any*): js.UndefOr[Ret] = js.native
  def apply[Target, Ret](target: Target, method: RunMethod[Target, Ret], args: js.Any*): js.UndefOr[Ret] = js.native
}

