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
    droppedAnnotationsCount: js.UndefOr[Double] = js.undefined,
    droppedNetworkEventsCount: js.UndefOr[Double] = js.undefined,
    timeEvent: js.Array[TimeEvent] = null
  ): TimeEvents = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(droppedAnnotationsCount)) __obj.updateDynamic("droppedAnnotationsCount")(droppedAnnotationsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(droppedNetworkEventsCount)) __obj.updateDynamic("droppedNetworkEventsCount")(droppedNetworkEventsCount.get.asInstanceOf[js.Any])
    if (timeEvent != null) __obj.updateDynamic("timeEvent")(timeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeEvents]
  }
}

