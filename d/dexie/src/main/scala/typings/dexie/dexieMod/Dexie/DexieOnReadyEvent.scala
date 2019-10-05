package typings.dexie.dexieMod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DexieOnReadyEvent extends js.Object {
  def fire(): js.Any
  def subscribe(fn: js.Function0[_], bSticky: Boolean): Unit
  def unsubscribe(fn: js.Function0[_]): Unit
}

object DexieOnReadyEvent {
  @scala.inline
  def apply(
    fire: () => js.Any,
    subscribe: (js.Function0[_], Boolean) => Unit,
    unsubscribe: js.Function0[_] => Unit
  ): DexieOnReadyEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction0(fire), subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
  
    __obj.asInstanceOf[DexieOnReadyEvent]
  }
}

