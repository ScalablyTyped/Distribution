package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listener extends js.Object {
  var emitter: EventEmitter2 = js.native
  var event: typings.eventemitter2.mod.event | eventNS = js.native
  @JSName("listener")
  var listener_Original: ListenerFn = js.native
  def listener(values: js.Any*): Unit = js.native
  def off(): this.type = js.native
}

