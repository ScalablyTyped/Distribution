package typings
package eventDashLiteLib.eventDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLite extends js.Object {
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean
  def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type
  def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type
  def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type
}

