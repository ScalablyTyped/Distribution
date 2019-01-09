package typings
package atEmberRunloopLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsMethodQueueTarget extends js.Object {
  def apply[Target](
    queue: atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues,
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    args: js.Any*
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
}

