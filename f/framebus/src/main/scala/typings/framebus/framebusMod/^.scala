package typings.framebus.framebusMod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("framebus", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def emit(event: String, args: js.Any*): Boolean = js.native
  def include(popup: Window): Boolean = js.native
  def off(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  def on(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  def pub(event: String, args: js.Any*): Boolean = js.native
  def publish(event: String, args: js.Any*): Boolean = js.native
  def sub(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  def subscribe(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  def target(origin: String): FrameBus = js.native
  def trigger(event: String, args: js.Any*): Boolean = js.native
  def unsub(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  def unsubscribe(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
}

