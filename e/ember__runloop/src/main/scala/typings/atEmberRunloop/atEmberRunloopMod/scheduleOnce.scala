package typings.atEmberRunloop.atEmberRunloopMod

import typings.atEmberRunloop.dashPrivateTypesMod.EmberRunQueues
import typings.atEmberRunloop.dashPrivateTypesMod.RunMethod
import typings.atEmberRunloop.typesMod.EmberRunTimer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/runloop", "scheduleOnce")
@js.native
object scheduleOnce extends js.Object {
  def apply[Target](queue: EmberRunQueues, target: Target, method: RunMethod[Target, _], args: js.Any*): EmberRunTimer = js.native
}

