package typings.atEmberRunloop.atEmberRunloopMod

import typings.atEmberRunloop.dashPrivateTypesMod.RunMethod
import typings.atEmberRunloop.typesMod.EmberRunTimer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/runloop", "once")
@js.native
object once extends js.Object {
  def apply[Target](target: Target, method: RunMethod[Target, _], args: js.Any*): EmberRunTimer = js.native
}

