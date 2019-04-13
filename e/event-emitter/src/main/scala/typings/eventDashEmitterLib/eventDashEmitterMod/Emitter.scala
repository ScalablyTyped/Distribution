package typings
package eventDashEmitterLib.eventDashEmitterMod

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
  def emit(`type`: java.lang.String, args: js.Any*): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: EventListener): scala.Unit = js.native
  def on(`type`: java.lang.String, listener: EventListener): scala.Unit = js.native
  def once(`type`: java.lang.String, listener: EventListener): scala.Unit = js.native
}

