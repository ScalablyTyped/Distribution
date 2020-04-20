package typings.emissary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscription extends IEmitter {
  var cancelled: Boolean
  def off(): js.Any
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
}

