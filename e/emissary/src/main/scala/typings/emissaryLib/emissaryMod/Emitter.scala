package typings
package emissaryLib.emissaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emissary", "Emitter")
@js.native
class Emitter () extends IEmitter {
  /* CompleteClass */
  override def behavior(eventName: java.lang.String, initialValue: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def decrementSubscriptionCount(eventName: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def emit(eventName: java.lang.String, args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  override def getSubscriptionCount(eventName: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def hasSubscriptions(eventName: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def incrementSubscriptionCount(eventName: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def off(eventNames: java.lang.String, handler: js.Function): scala.Unit = js.native
  /* CompleteClass */
  override def on(eventNames: java.lang.String, handler: js.Function): js.Any = js.native
   // return value type are Signal
  /* CompleteClass */
  override def once(eventName: java.lang.String, handler: js.Function): js.Any = js.native
  /* CompleteClass */
  override def pauseEvents(eventNames: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def resumeEvents(eventNames: java.lang.String): scala.Unit = js.native
   // return value type are Signal
  /* CompleteClass */
  override def signal(eventName: java.lang.String): scala.Unit = js.native
}

