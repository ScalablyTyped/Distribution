package typings.eventDashEmitter

import typings.eventDashEmitter.eventDashEmitterMod.Emitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-emitter/has-listeners", JSImport.Namespace)
@js.native
object hasDashListenersMod extends js.Object {
  def apply(emitter: Emitter): Boolean = js.native
  def apply(emitter: Emitter, name: String): Boolean = js.native
}

