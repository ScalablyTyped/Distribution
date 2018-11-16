package typings
package framebusLib.framebusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FrameBus extends js.Object {
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean
  def off(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, _]): scala.Boolean
  def on(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, _]): scala.Boolean
  def pub(event: java.lang.String, args: js.Any*): scala.Boolean
  def publish(event: java.lang.String, args: js.Any*): scala.Boolean
  def sub(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, _]): scala.Boolean
  def subscribe(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, _]): scala.Boolean
  def trigger(event: java.lang.String, args: js.Any*): scala.Boolean
  def unsub(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, _]): scala.Boolean
  def unsubscribe(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, _]): scala.Boolean
}

