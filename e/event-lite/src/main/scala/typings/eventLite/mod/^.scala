package typings.eventLite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-lite", JSImport.Namespace)
@js.native
class ^ () extends EventLite {
  /* CompleteClass */
  override def emit(event: String, args: js.Any*): Boolean = js.native
  /* CompleteClass */
  override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* CompleteClass */
  override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* CompleteClass */
  override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
}

@JSImport("event-lite", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def mixin(proto: js.Any): js.Any = js.native
}

