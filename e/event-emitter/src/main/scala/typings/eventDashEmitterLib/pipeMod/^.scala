package typings
package eventDashEmitterLib.pipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-emitter/pipe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    source: eventDashEmitterLib.eventDashEmitterMod.Emitter,
    target: eventDashEmitterLib.eventDashEmitterMod.Emitter
  ): EmitterPipe = js.native
  def apply(
    source: eventDashEmitterLib.eventDashEmitterMod.Emitter,
    target: eventDashEmitterLib.eventDashEmitterMod.Emitter,
    emitMethodName: java.lang.String | js.Symbol
  ): EmitterPipe = js.native
}

