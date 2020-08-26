package typings.emissary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEmitter extends js.Object {
  def behavior(eventName: String, initialValue: js.Any): Unit = js.native
  def decrementSubscriptionCount(eventName: String): Double = js.native
  def emit(eventName: String, args: js.Any*): Unit = js.native
  def getSubscriptionCount(eventName: String): Double = js.native
  def hasSubscriptions(eventName: String): Boolean = js.native
  def incrementSubscriptionCount(eventName: String): Double = js.native
  def off(eventNames: String, handler: js.Function): Unit = js.native
  def on(eventNames: String, handler: js.Function): js.Any = js.native
   // return value type are Signal
  def once(eventName: String, handler: js.Function): js.Any = js.native
  def pauseEvents(eventNames: String): Unit = js.native
  def resumeEvents(eventNames: String): Unit = js.native
   // return value type are Signal
  def signal(eventName: String): Unit = js.native
}

object IEmitter {
  @scala.inline
  def apply(
    behavior: (String, js.Any) => Unit,
    decrementSubscriptionCount: String => Double,
    emit: (String, /* repeated */ js.Any) => Unit,
    getSubscriptionCount: String => Double,
    hasSubscriptions: String => Boolean,
    incrementSubscriptionCount: String => Double,
    off: (String, js.Function) => Unit,
    on: (String, js.Function) => js.Any,
    once: (String, js.Function) => js.Any,
    pauseEvents: String => Unit,
    resumeEvents: String => Unit,
    signal: String => Unit
  ): IEmitter = {
    val __obj = js.Dynamic.literal(behavior = js.Any.fromFunction2(behavior), decrementSubscriptionCount = js.Any.fromFunction1(decrementSubscriptionCount), emit = js.Any.fromFunction2(emit), getSubscriptionCount = js.Any.fromFunction1(getSubscriptionCount), hasSubscriptions = js.Any.fromFunction1(hasSubscriptions), incrementSubscriptionCount = js.Any.fromFunction1(incrementSubscriptionCount), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), pauseEvents = js.Any.fromFunction1(pauseEvents), resumeEvents = js.Any.fromFunction1(resumeEvents), signal = js.Any.fromFunction1(signal))
    __obj.asInstanceOf[IEmitter]
  }
  @scala.inline
  implicit class IEmitterOps[Self <: IEmitter] (val x: Self) extends AnyVal {
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
    def setBehavior(value: (String, js.Any) => Unit): Self = this.set("behavior", js.Any.fromFunction2(value))
    @scala.inline
    def setDecrementSubscriptionCount(value: String => Double): Self = this.set("decrementSubscriptionCount", js.Any.fromFunction1(value))
    @scala.inline
    def setEmit(value: (String, /* repeated */ js.Any) => Unit): Self = this.set("emit", js.Any.fromFunction2(value))
    @scala.inline
    def setGetSubscriptionCount(value: String => Double): Self = this.set("getSubscriptionCount", js.Any.fromFunction1(value))
    @scala.inline
    def setHasSubscriptions(value: String => Boolean): Self = this.set("hasSubscriptions", js.Any.fromFunction1(value))
    @scala.inline
    def setIncrementSubscriptionCount(value: String => Double): Self = this.set("incrementSubscriptionCount", js.Any.fromFunction1(value))
    @scala.inline
    def setOff(value: (String, js.Function) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    @scala.inline
    def setOn(value: (String, js.Function) => js.Any): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setOnce(value: (String, js.Function) => js.Any): Self = this.set("once", js.Any.fromFunction2(value))
    @scala.inline
    def setPauseEvents(value: String => Unit): Self = this.set("pauseEvents", js.Any.fromFunction1(value))
    @scala.inline
    def setResumeEvents(value: String => Unit): Self = this.set("resumeEvents", js.Any.fromFunction1(value))
    @scala.inline
    def setSignal(value: String => Unit): Self = this.set("signal", js.Any.fromFunction1(value))
  }
  
}

