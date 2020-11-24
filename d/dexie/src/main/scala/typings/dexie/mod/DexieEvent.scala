package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DexieEvent extends js.Object {
  
  def fire(args: js.Any*): js.Any = js.native
  
  def subscribe(fn: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  var subscribers: js.Array[js.Function] = js.native
  
  def unsubscribe(fn: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
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
  
  @scala.inline
  implicit class DexieEventOps[Self <: DexieEvent] (val x: Self) extends AnyVal {
    
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
    def setFire(value: /* repeated */ js.Any => js.Any): Self = this.set("fire", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubscribe(value: js.Function1[/* repeated */ js.Any, _] => Unit): Self = this.set("subscribe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubscribersVarargs(value: js.Function*): Self = this.set("subscribers", js.Array(value :_*))
    
    @scala.inline
    def setSubscribers(value: js.Array[js.Function]): Self = this.set("subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribe(value: js.Function1[/* repeated */ js.Any, _] => Unit): Self = this.set("unsubscribe", js.Any.fromFunction1(value))
  }
}
