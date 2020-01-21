package typings.dexie.mod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DexieErrorEvent extends js.Object {
  def fire(error: js.Any): js.Any
  def subscribe(fn: js.Function1[/* error */ js.Any, _]): Unit
  def unsubscribe(fn: js.Function1[/* error */ js.Any, _]): Unit
}

object DexieErrorEvent {
  @scala.inline
  def apply(
    fire: js.Any => js.Any,
    subscribe: js.Function1[/* error */ js.Any, _] => Unit,
    unsubscribe: js.Function1[/* error */ js.Any, _] => Unit
  ): DexieErrorEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
  
    __obj.asInstanceOf[DexieErrorEvent]
  }
}

