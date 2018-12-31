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

