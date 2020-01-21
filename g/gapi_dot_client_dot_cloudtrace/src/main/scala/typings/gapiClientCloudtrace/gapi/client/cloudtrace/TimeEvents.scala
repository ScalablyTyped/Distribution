package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeEvents extends js.Object {
  /**
    * The number of dropped annotations in all the included time events.
    * If the value is 0, then no annotations were dropped.
    */
  var droppedAnnotationsCount: js.UndefOr[Double] = js.undefined
  /**
    * The number of dropped network events in all the included time events.
    * If the value is 0, then no network events were dropped.
    */
  var droppedNetworkEventsCount: js.UndefOr[Double] = js.undefined
  /** A collection of `TimeEvent`s. */
  var timeEvent: js.UndefOr[js.Array[TimeEvent]] = js.undefined
}

object TimeEvents {
  @scala.inline
  def apply(
    droppedAnnotationsCount: Int | Double = null,
    droppedNetworkEventsCount: Int | Double = null,
    timeEvent: js.Array[TimeEvent] = null
  ): TimeEvents = {
    val __obj = js.Dynamic.literal()
    if (droppedAnnotationsCount != null) __obj.updateDynamic("droppedAnnotationsCount")(droppedAnnotationsCount.asInstanceOf[js.Any])
    if (droppedNetworkEventsCount != null) __obj.updateDynamic("droppedNetworkEventsCount")(droppedNetworkEventsCount.asInstanceOf[js.Any])
    if (timeEvent != null) __obj.updateDynamic("timeEvent")(timeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeEvents]
  }
}

