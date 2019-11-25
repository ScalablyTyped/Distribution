package typings.dexie.dexieMod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DexieEvent extends js.Object {
  var subscribers: js.Array[js.Function]
  def fire(args: js.Any*): js.Any
  def subscribe(fn: js.Function1[/* repeated */ js.Any, _]): Unit
  def unsubscribe(fn: js.Function1[/* repeated */ js.Any, _]): Unit
}

object DexieEvent {
  @scala.inline
  def apply(
    fire: /* repeated */ js.Any => js.Any,
    subscribe: js.Function1[/* repeated */ js.Any, _] => Unit,
    subscribers: js.Array[js.Function],
    unsubscribe: js.Function1[/* repeated */ js.Any, _] => Unit
  ): DexieEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1(subscribe), subscribers = subscribers.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction1(unsubscribe))
  
    __obj.asInstanceOf[DexieEvent]
  }
}

