package typings.dexie.dexieMod.Dexie

import typings.std.IDBVersionChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DexieVersionChangeEvent extends js.Object {
  def fire(event: IDBVersionChangeEvent): js.Any
  def subscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit
  def unsubscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit
}

object DexieVersionChangeEvent {
  @scala.inline
  def apply(
    fire: IDBVersionChangeEvent => js.Any,
    subscribe: js.Function1[/* event */ IDBVersionChangeEvent, _] => Unit,
    unsubscribe: js.Function1[/* event */ IDBVersionChangeEvent, _] => Unit
  ): DexieVersionChangeEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
  
    __obj.asInstanceOf[DexieVersionChangeEvent]
  }
}

