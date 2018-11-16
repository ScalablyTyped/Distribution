package typings
package eventDashEmitterLib.pipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-emitter/pipe", JSImport.Namespace)
@js.native
object pipeModMembers extends js.Object {
  def apply(
    source: eventDashEmitterLib.eventDashEmitterMod.eeNs.Emitter,
    target: eventDashEmitterLib.eventDashEmitterMod.eeNs.Emitter
  ): eventDashEmitterLib.pipeMod.pipeNs.EmitterPipe = js.native
  def apply(
    source: eventDashEmitterLib.eventDashEmitterMod.eeNs.Emitter,
    target: eventDashEmitterLib.eventDashEmitterMod.eeNs.Emitter,
    emitMethodName: java.lang.String | js.Symbol
  ): eventDashEmitterLib.pipeMod.pipeNs.EmitterPipe = js.native
}

