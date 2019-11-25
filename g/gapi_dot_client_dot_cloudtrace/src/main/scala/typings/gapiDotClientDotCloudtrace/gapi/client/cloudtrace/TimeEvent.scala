package typings.gapiDotClientDotCloudtrace.gapi.client.cloudtrace

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
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    if (networkEvent != null) __obj.updateDynamic("networkEvent")(networkEvent.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeEvent]
  }
}

