package typings.atEmberRunloop.atEmberRunloopMod

import typings.atEmberRunloop.typesMod.EmberRunTimer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/runloop", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val begin: js.Function0[Unit] = js.native
  val cancel: js.Function1[/* timer */ EmberRunTimer, Boolean] = js.native
  val end: js.Function0[Unit] = js.native
  val run: RunNamespace = js.native
}

