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
    behavior: js.Function2[java.lang.String, js.Any, scala.Unit],
    decrementSubscriptionCount: js.Function1[java.lang.String, scala.Double],
    emit: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit],
    getSubscriptionCount: js.Function1[java.lang.String, scala.Double],
    hasSubscriptions: js.Function1[java.lang.String, scala.Boolean],
    incrementSubscriptionCount: js.Function1[java.lang.String, scala.Double],
    off: js.Function2[java.lang.String, js.Function, scala.Unit],
    on: js.Function2[java.lang.String, js.Function, js.Any],
    once: js.Function2[java.lang.String, js.Function, js.Any],
    pauseEvents: js.Function1[java.lang.String, scala.Unit],
    resumeEvents: js.Function1[java.lang.String, scala.Unit],
    signal: js.Function1[java.lang.String, scala.Unit]
  ): IEmitter = {
    val __obj = js.Dynamic.literal(behavior = behavior, decrementSubscriptionCount = decrementSubscriptionCount, emit = emit, getSubscriptionCount = getSubscriptionCount, hasSubscriptions = hasSubscriptions, incrementSubscriptionCount = incrementSubscriptionCount, off = off, on = on, once = once, pauseEvents = pauseEvents, resumeEvents = resumeEvents, signal = signal)
  
    __obj.asInstanceOf[IEmitter]
  }
}

