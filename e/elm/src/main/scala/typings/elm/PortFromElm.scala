package typings.elm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortFromElm[V] extends js.Object {
  def subscribe(handler: js.Function1[/* value */ V, Unit]): Unit
  def unsubscribe(handler: js.Function1[/* value */ V, Unit]): Unit
}

object PortFromElm {
  @scala.inline
  def apply[V](
    subscribe: js.Function1[/* value */ V, Unit] => Unit,
    unsubscribe: js.Function1[/* value */ V, Unit] => Unit
  ): PortFromElm[V] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[PortFromElm[V]]
  }
}

