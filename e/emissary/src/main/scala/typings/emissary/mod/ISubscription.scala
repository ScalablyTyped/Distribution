package typings.emissary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubscription extends IEmitter {
  
  var cancelled: Boolean = js.native
  
  def off(): js.Any = js.native
}
object ISubscription {
  
  @scala.inline
  def apply(
    behavior: (String, js.Any) => Unit,
    cancelled: Boolean,
    decrementSubscriptionCount: String => Double,
    emit: (String, /* repeated */ js.Any) => Unit,
    getSubscriptionCount: String => Double,
    hasSubscriptions: String => Boolean,
    incrementSubscriptionCount: String => Double,
    off: () => js.Any,
    on: (String, js.Function) => js.Any,
    once: (String, js.Function) => js.Any,
    pauseEvents: String => Unit,
    resumeEvents: String => Unit,
    signal: String => Unit
  ): ISubscription = {
    val __obj = js.Dynamic.literal(behavior = js.Any.fromFunction2(behavior), cancelled = cancelled.asInstanceOf[js.Any], decrementSubscriptionCount = js.Any.fromFunction1(decrementSubscriptionCount), emit = js.Any.fromFunction2(emit), getSubscriptionCount = js.Any.fromFunction1(getSubscriptionCount), hasSubscriptions = js.Any.fromFunction1(hasSubscriptions), incrementSubscriptionCount = js.Any.fromFunction1(incrementSubscriptionCount), off = js.Any.fromFunction0(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), pauseEvents = js.Any.fromFunction1(pauseEvents), resumeEvents = js.Any.fromFunction1(resumeEvents), signal = js.Any.fromFunction1(signal))
    __obj.asInstanceOf[ISubscription]
  }
  
  @scala.inline
  implicit class ISubscriptionOps[Self <: ISubscription] (val x: Self) extends AnyVal {
    
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
    def setCancelled(value: Boolean): Self = this.set("cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOff(value: () => js.Any): Self = this.set("off", js.Any.fromFunction0(value))
  }
}
