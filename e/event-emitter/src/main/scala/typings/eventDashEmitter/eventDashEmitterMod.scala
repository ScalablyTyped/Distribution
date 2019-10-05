package typings.eventDashEmitter

import typings.eventDashEmitter.eventDashEmitterMod.Emitter
import typings.eventDashEmitter.eventDashEmitterMod.EmitterMethod
import typings.eventDashEmitter.eventDashEmitterMod.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-emitter", JSImport.Namespace)
@js.native
object eventDashEmitterMod extends js.Object {
  @js.native
  trait Emitter extends js.Object {
    @JSName("off")
    var off_Original: EmitterMethod = js.native
    @JSName("on")
    var on_Original: EmitterMethod = js.native
    @JSName("once")
    var once_Original: EmitterMethod = js.native
    def emit(`type`: String, args: js.Any*): Unit = js.native
    def off(`type`: String, listener: EventListener): Unit = js.native
    def on(`type`: String, listener: EventListener): Unit = js.native
    def once(`type`: String, listener: EventListener): Unit = js.native
  }
  
  def apply(): Emitter = js.native
  def apply(obj: js.Any): Emitter = js.native
  type EmitterMethod = js.Function2[/* type */ String, /* listener */ EventListener, Unit]
  type EventListener = js.Function1[/* repeated */ js.Any, Unit]
}

