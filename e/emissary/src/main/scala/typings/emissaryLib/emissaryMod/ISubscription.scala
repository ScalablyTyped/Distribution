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
    behavior: js.Function2[java.lang.String, js.Any, scala.Unit],
    cancelled: scala.Boolean,
    decrementSubscriptionCount: js.Function1[java.lang.String, scala.Double],
    emit: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit],
    getSubscriptionCount: js.Function1[java.lang.String, scala.Double],
    hasSubscriptions: js.Function1[java.lang.String, scala.Boolean],
    incrementSubscriptionCount: js.Function1[java.lang.String, scala.Double],
    off: js.Function0[js.Any],
    on: js.Function2[java.lang.String, js.Function, js.Any],
    once: js.Function2[java.lang.String, js.Function, js.Any],
    pauseEvents: js.Function1[java.lang.String, scala.Unit],
    resumeEvents: js.Function1[java.lang.String, scala.Unit],
    signal: js.Function1[java.lang.String, scala.Unit]
  ): ISubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("behavior")(behavior)
    __obj.updateDynamic("cancelled")(cancelled)
    __obj.updateDynamic("decrementSubscriptionCount")(decrementSubscriptionCount)
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("getSubscriptionCount")(getSubscriptionCount)
    __obj.updateDynamic("hasSubscriptions")(hasSubscriptions)
    __obj.updateDynamic("incrementSubscriptionCount")(incrementSubscriptionCount)
    __obj.updateDynamic("off")(off)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("once")(once)
    __obj.updateDynamic("pauseEvents")(pauseEvents)
    __obj.updateDynamic("resumeEvents")(resumeEvents)
    __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[ISubscription]
  }
}

