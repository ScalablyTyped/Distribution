package typings
package emissaryLib.emissaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscription extends IEmitter {
  var cancelled: scala.Boolean
  def off(): js.Any
}

object ISubscription {
  @scala.inline
  def apply(
    behavior: (java.lang.String, js.Any) => scala.Unit,
    cancelled: scala.Boolean,
    decrementSubscriptionCount: java.lang.String => scala.Double,
    emit: (java.lang.String, /* repeated */ js.Any) => scala.Unit,
    getSubscriptionCount: java.lang.String => scala.Double,
    hasSubscriptions: java.lang.String => scala.Boolean,
    incrementSubscriptionCount: java.lang.String => scala.Double,
    off: () => js.Any,
    on: (java.lang.String, js.Function) => js.Any,
    once: (java.lang.String, js.Function) => js.Any,
    pauseEvents: java.lang.String => scala.Unit,
    resumeEvents: java.lang.String => scala.Unit,
    signal: java.lang.String => scala.Unit
  ): ISubscription = {
    val __obj = js.Dynamic.literal(behavior = js.Any.fromFunction2(behavior), cancelled = cancelled, decrementSubscriptionCount = js.Any.fromFunction1(decrementSubscriptionCount), emit = js.Any.fromFunction2(emit), getSubscriptionCount = js.Any.fromFunction1(getSubscriptionCount), hasSubscriptions = js.Any.fromFunction1(hasSubscriptions), incrementSubscriptionCount = js.Any.fromFunction1(incrementSubscriptionCount), off = js.Any.fromFunction0(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), pauseEvents = js.Any.fromFunction1(pauseEvents), resumeEvents = js.Any.fromFunction1(resumeEvents), signal = js.Any.fromFunction1(signal))
  
    __obj.asInstanceOf[ISubscription]
  }
}

