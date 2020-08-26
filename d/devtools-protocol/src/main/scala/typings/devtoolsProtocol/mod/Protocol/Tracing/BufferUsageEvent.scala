package typings.devtoolsProtocol.mod.Protocol.Tracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferUsageEvent extends js.Object {
  /**
    * An approximate number of events in the trace log.
    */
  var eventCount: js.UndefOr[Double] = js.native
  /**
    * A number in range [0..1] that indicates the used size of event buffer as a fraction of its
    * total size.
    */
  var percentFull: js.UndefOr[Double] = js.native
  /**
    * A number in range [0..1] that indicates the used size of event buffer as a fraction of its
    * total size.
    */
  var value: js.UndefOr[Double] = js.native
}

object BufferUsageEvent {
  @scala.inline
  def apply(): BufferUsageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferUsageEvent]
  }
  @scala.inline
  implicit class BufferUsageEventOps[Self <: BufferUsageEvent] (val x: Self) extends AnyVal {
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
    def setEventCount(value: Double): Self = this.set("eventCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventCount: Self = this.set("eventCount", js.undefined)
    @scala.inline
    def setPercentFull(value: Double): Self = this.set("percentFull", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentFull: Self = this.set("percentFull", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

