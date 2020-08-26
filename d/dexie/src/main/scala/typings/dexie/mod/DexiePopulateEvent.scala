package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DexiePopulateEvent extends js.Object {
  def fire(trans: Transaction): js.Any = js.native
  def subscribe(fn: js.Function1[/* trans */ Transaction, _]): Unit = js.native
  def unsubscribe(fn: js.Function1[/* trans */ Transaction, _]): Unit = js.native
}

object DexiePopulateEvent {
  @scala.inline
  def apply(
    fire: Transaction => js.Any,
    subscribe: js.Function1[/* trans */ Transaction, _] => Unit,
    unsubscribe: js.Function1[/* trans */ Transaction, _] => Unit
  ): DexiePopulateEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[DexiePopulateEvent]
  }
  @scala.inline
  implicit class DexiePopulateEventOps[Self <: DexiePopulateEvent] (val x: Self) extends AnyVal {
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
    def setFire(value: Transaction => js.Any): Self = this.set("fire", js.Any.fromFunction1(value))
    @scala.inline
    def setSubscribe(value: js.Function1[/* trans */ Transaction, _] => Unit): Self = this.set("subscribe", js.Any.fromFunction1(value))
    @scala.inline
    def setUnsubscribe(value: js.Function1[/* trans */ Transaction, _] => Unit): Self = this.set("unsubscribe", js.Any.fromFunction1(value))
  }
  
}

