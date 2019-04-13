package typings
package eventDashLiteLib.eventDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-lite", JSImport.Namespace)
@js.native
class ^ () extends EventLite {
  /* CompleteClass */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* CompleteClass */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* CompleteClass */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* CompleteClass */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
}

@JSImport("event-lite", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def mixin(proto: js.Any): js.Any = js.native
}

