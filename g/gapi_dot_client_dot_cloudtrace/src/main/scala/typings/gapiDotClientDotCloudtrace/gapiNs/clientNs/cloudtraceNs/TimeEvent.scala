package typings.gapiDotClientDotCloudtrace.gapiNs.clientNs.cloudtraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeEvent extends js.Object {
  /** Text annotation with a set of attributes. */
  var annotation: js.UndefOr[Annotation] = js.undefined
  /** An event describing an RPC message sent/received on the network. */
  var networkEvent: js.UndefOr[NetworkEvent] = js.undefined
  /** The timestamp indicating the time the event occurred. */
  var time: js.UndefOr[String] = js.undefined
}

object TimeEvent {
  @scala.inline
  def apply(annotation: Annotation = null, networkEvent: NetworkEvent = null, time: String = null): TimeEvent = {
    val __obj = js.Dynamic.literal()
    if (annotation != null) __obj.updateDynamic("annotation")(annotation)
    if (networkEvent != null) __obj.updateDynamic("networkEvent")(networkEvent)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[TimeEvent]
  }
}

