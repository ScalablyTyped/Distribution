package typings.atEmberRunloop.atEmberRunloopMod

import typings.atEmberRunloop.dashPrivateTypesMod.RunMethod
import typings.atEmberRunloop.typesMod.EmberRunTimer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/runloop", "next")
@js.native
object next extends js.Object {
  def apply[Target](target: Target, method: RunMethod[Target, _], args: js.Any*): EmberRunTimer = js.native
}

