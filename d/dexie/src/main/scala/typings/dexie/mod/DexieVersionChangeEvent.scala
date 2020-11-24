package typings.dexie.mod

import typings.std.IDBVersionChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DexieVersionChangeEvent extends js.Object {
  
  def fire(event: IDBVersionChangeEvent): js.Any = js.native
  
  def subscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
  
  def unsubscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
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
  
  @scala.inline
  implicit class DexieVersionChangeEventOps[Self <: DexieVersionChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setFire(value: IDBVersionChangeEvent => js.Any): Self = this.set("fire", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubscribe(value: js.Function1[/* event */ IDBVersionChangeEvent, _] => Unit): Self = this.set("subscribe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnsubscribe(value: js.Function1[/* event */ IDBVersionChangeEvent, _] => Unit): Self = this.set("unsubscribe", js.Any.fromFunction1(value))
  }
}
