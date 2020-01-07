package typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A time-stamped annotation or message event in the Span.
  */
@js.native
trait Schema$TimeEvent extends js.Object {
  /**
    * Text annotation with a set of attributes.
    */
  var annotation: js.UndefOr[Schema$Annotation] = js.native
  /**
    * An event describing a message sent/received between Spans.
    */
  var messageEvent: js.UndefOr[Schema$MessageEvent] = js.native
  /**
    * The timestamp indicating the time the event occurred.
    */
  var time: js.UndefOr[String] = js.native
}

object Schema$TimeEvent {
  @scala.inline
  def apply(
    annotation: Schema$Annotation = null,
    messageEvent: Schema$MessageEvent = null,
    time: String = null
  ): Schema$TimeEvent = {
    val __obj = js.Dynamic.literal()
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    if (messageEvent != null) __obj.updateDynamic("messageEvent")(messageEvent.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimeEvent]
  }
}

