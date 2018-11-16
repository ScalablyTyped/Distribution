package typings
package framebusLib.framebusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("framebus", JSImport.Namespace)
@js.native
object framebusModMembers extends js.Object {
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def include(popup: stdLib.Window): scala.Boolean = js.native
  def off(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, _]): scala.Boolean = js.native
  def on(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, _]): scala.Boolean = js.native
  def pub(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def publish(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def sub(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, _]): scala.Boolean = js.native
  def subscribe(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, _]): scala.Boolean = js.native
  def target(origin: java.lang.String): FrameBus = js.native
  def trigger(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def unsub(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, _]): scala.Boolean = js.native
  def unsubscribe(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, _]): scala.Boolean = js.native
}

