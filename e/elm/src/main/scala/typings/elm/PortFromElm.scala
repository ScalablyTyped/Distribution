package typings.elm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortFromElm[V] extends js.Object {
  def subscribe(handler: js.Function1[/* value */ V, Unit]): Unit = js.native
  def unsubscribe(handler: js.Function1[/* value */ V, Unit]): Unit = js.native
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
  @scala.inline
  implicit class PortFromElmOps[Self <: PortFromElm[_], V] (val x: Self with PortFromElm[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSubscribe(value: js.Function1[/* value */ V, Unit] => Unit): Self = this.set("subscribe", js.Any.fromFunction1(value))
    @scala.inline
    def setUnsubscribe(value: js.Function1[/* value */ V, Unit] => Unit): Self = this.set("unsubscribe", js.Any.fromFunction1(value))
  }
  
}

