package typings.emissary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmitter extends js.Object {
  def behavior(eventName: String, initialValue: js.Any): Unit
  def decrementSubscriptionCount(eventName: String): Double
  def emit(eventName: String, args: js.Any*): Unit
  def getSubscriptionCount(eventName: String): Double
  def hasSubscriptions(eventName: String): Boolean
  def incrementSubscriptionCount(eventName: String): Double
  def off(eventNames: String, handler: js.Function): Unit
  def on(eventNames: String, handler: js.Function): js.Any
   // return value type are Signal
  def once(eventName: String, handler: js.Function): js.Any
  def pauseEvents(eventNames: String): Unit
  def resumeEvents(eventNames: String): Unit
   // return value type are Signal
  def signal(eventName: String): Unit
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
}

