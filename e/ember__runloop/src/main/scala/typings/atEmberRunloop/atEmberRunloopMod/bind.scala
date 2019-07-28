package typings.atEmberRunloop.atEmberRunloopMod

import typings.atEmberRunloop.dashPrivateTypesMod.RunMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/runloop", "bind")
@js.native
object bind extends js.Object {
  def apply[Target, Ret](target: Target, method: RunMethod[Target, Ret], args: js.Any*): js.Function1[/* repeated */ js.Any, Ret] = js.native
}

