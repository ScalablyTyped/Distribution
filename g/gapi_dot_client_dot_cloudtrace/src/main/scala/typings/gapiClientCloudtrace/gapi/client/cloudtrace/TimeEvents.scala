package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeEvents extends js.Object {
  /**
    * The number of dropped annotations in all the included time events.
    * If the value is 0, then no annotations were dropped.
    */
  var droppedAnnotationsCount: js.UndefOr[Double] = js.native
  /**
    * The number of dropped network events in all the included time events.
    * If the value is 0, then no network events were dropped.
    */
  var droppedNetworkEventsCount: js.UndefOr[Double] = js.native
  /** A collection of `TimeEvent`s. */
  var timeEvent: js.UndefOr[js.Array[TimeEvent]] = js.native
}

object TimeEvents {
  @scala.inline
  def apply(): TimeEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeEvents]
  }
  @scala.inline
  implicit class TimeEventsOps[Self <: TimeEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDroppedAnnotationsCount(value: Double): Self = this.set("droppedAnnotationsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDroppedAnnotationsCount: Self = this.set("droppedAnnotationsCount", js.undefined)
    @scala.inline
    def setDroppedNetworkEventsCount(value: Double): Self = this.set("droppedNetworkEventsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDroppedNetworkEventsCount: Self = this.set("droppedNetworkEventsCount", js.undefined)
    @scala.inline
    def setTimeEventVarargs(value: TimeEvent*): Self = this.set("timeEvent", js.Array(value :_*))
    @scala.inline
    def setTimeEvent(value: js.Array[TimeEvent]): Self = this.set("timeEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeEvent: Self = this.set("timeEvent", js.undefined)
  }
  
}

