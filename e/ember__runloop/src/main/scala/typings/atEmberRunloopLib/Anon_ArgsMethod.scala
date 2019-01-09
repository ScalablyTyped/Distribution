package typings
package atEmberRunloopLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsMethod extends js.Object {
  def apply[Ret](method: js.Function1[/* repeated */ js.Any, Ret], args: js.Any*): js.UndefOr[Ret] = js.native
  def apply[Target, Ret](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, Ret],
    args: js.Any*
  ): js.UndefOr[Ret] = js.native
}

