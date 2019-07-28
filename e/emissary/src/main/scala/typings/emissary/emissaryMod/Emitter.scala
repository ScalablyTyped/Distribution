package typings.emissary.emissaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emissary", "Emitter")
@js.native
class Emitter () extends IEmitter {
  /* CompleteClass */
  override def behavior(eventName: String, initialValue: js.Any): Unit = js.native
  /* CompleteClass */
  override def decrementSubscriptionCount(eventName: String): Double = js.native
  /* CompleteClass */
  override def emit(eventName: String, args: js.Any*): Unit = js.native
  /* CompleteClass */
  override def getSubscriptionCount(eventName: String): Double = js.native
  /* CompleteClass */
  override def hasSubscriptions(eventName: String): Boolean = js.native
  /* CompleteClass */
  override def incrementSubscriptionCount(eventName: String): Double = js.native
  /* CompleteClass */
  override def off(eventNames: String, handler: js.Function): Unit = js.native
  /* CompleteClass */
  override def on(eventNames: String, handler: js.Function): js.Any = js.native
   // return value type are Signal
  /* CompleteClass */
  override def once(eventName: String, handler: js.Function): js.Any = js.native
  /* CompleteClass */
  override def pauseEvents(eventNames: String): Unit = js.native
  /* CompleteClass */
  override def resumeEvents(eventNames: String): Unit = js.native
   // return value type are Signal
  /* CompleteClass */
  override def signal(eventName: String): Unit = js.native
}

