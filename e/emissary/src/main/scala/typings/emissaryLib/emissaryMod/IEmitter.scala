package typings
package emissaryLib.emissaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmitter extends js.Object {
  def behavior(eventName: java.lang.String, initialValue: js.Any): scala.Unit
  def decrementSubscriptionCount(eventName: java.lang.String): scala.Double
  def emit(eventName: java.lang.String, args: js.Any*): scala.Unit
  def getSubscriptionCount(eventName: java.lang.String): scala.Double
  def hasSubscriptions(eventName: java.lang.String): scala.Boolean
  def incrementSubscriptionCount(eventName: java.lang.String): scala.Double
  def off(eventNames: java.lang.String, handler: js.Function): scala.Unit
  def on(eventNames: java.lang.String, handler: js.Function): js.Any
   // return value type are Signal
  def once(eventName: java.lang.String, handler: js.Function): js.Any
  def pauseEvents(eventNames: java.lang.String): scala.Unit
  def resumeEvents(eventNames: java.lang.String): scala.Unit
   // return value type are Signal
  def signal(eventName: java.lang.String): scala.Unit
}

object IEmitter {
  @scala.inline
  def apply(
    behavior: (java.lang.String, js.Any) => scala.Unit,
    decrementSubscriptionCount: java.lang.String => scala.Double,
    emit: (java.lang.String, /* repeated */ js.Any) => scala.Unit,
    getSubscriptionCount: java.lang.String => scala.Double,
    hasSubscriptions: java.lang.String => scala.Boolean,
    incrementSubscriptionCount: java.lang.String => scala.Double,
    off: (java.lang.String, js.Function) => scala.Unit,
    on: (java.lang.String, js.Function) => js.Any,
    once: (java.lang.String, js.Function) => js.Any,
    pauseEvents: java.lang.String => scala.Unit,
    resumeEvents: java.lang.String => scala.Unit,
    signal: java.lang.String => scala.Unit
  ): IEmitter = {
    val __obj = js.Dynamic.literal(behavior = js.Any.fromFunction2(behavior), decrementSubscriptionCount = js.Any.fromFunction1(decrementSubscriptionCount), emit = js.Any.fromFunction2(emit), getSubscriptionCount = js.Any.fromFunction1(getSubscriptionCount), hasSubscriptions = js.Any.fromFunction1(hasSubscriptions), incrementSubscriptionCount = js.Any.fromFunction1(incrementSubscriptionCount), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), pauseEvents = js.Any.fromFunction1(pauseEvents), resumeEvents = js.Any.fromFunction1(resumeEvents), signal = js.Any.fromFunction1(signal))
  
    __obj.asInstanceOf[IEmitter]
  }
}

