package typings.eventDashEmitter.eventDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

