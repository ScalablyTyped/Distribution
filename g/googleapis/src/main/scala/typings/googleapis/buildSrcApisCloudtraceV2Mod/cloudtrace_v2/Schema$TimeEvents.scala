package typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of `TimeEvent`s. A `TimeEvent` is a time-stamped annotation on
  * the span, consisting of either user-supplied key:value pairs, or details of
  * a message sent/received between Spans.
  */
@js.native
trait Schema$TimeEvents extends js.Object {
  /**
    * The number of dropped annotations in all the included time events. If the
    * value is 0, then no annotations were dropped.
    */
  var droppedAnnotationsCount: js.UndefOr[Double] = js.native
  /**
    * The number of dropped message events in all the included time events. If
    * the value is 0, then no message events were dropped.
    */
  var droppedMessageEventsCount: js.UndefOr[Double] = js.native
  /**
    * A collection of `TimeEvent`s.
    */
  var timeEvent: js.UndefOr[js.Array[Schema$TimeEvent]] = js.native
}

object Schema$TimeEvents {
  @scala.inline
  def apply(
    droppedAnnotationsCount: Int | Double = null,
    droppedMessageEventsCount: Int | Double = null,
    timeEvent: js.Array[Schema$TimeEvent] = null
  ): Schema$TimeEvents = {
    val __obj = js.Dynamic.literal()
    if (droppedAnnotationsCount != null) __obj.updateDynamic("droppedAnnotationsCount")(droppedAnnotationsCount.asInstanceOf[js.Any])
    if (droppedMessageEventsCount != null) __obj.updateDynamic("droppedMessageEventsCount")(droppedMessageEventsCount.asInstanceOf[js.Any])
    if (timeEvent != null) __obj.updateDynamic("timeEvent")(timeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimeEvents]
  }
}

