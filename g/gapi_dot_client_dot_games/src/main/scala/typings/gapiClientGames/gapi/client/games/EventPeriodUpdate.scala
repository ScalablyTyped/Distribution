package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventPeriodUpdate extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventPeriodUpdate. */
  var kind: js.UndefOr[String] = js.native
  /** The time period being covered by this update. */
  var timePeriod: js.UndefOr[EventPeriodRange] = js.native
  /** The updates being made for this time period. */
  var updates: js.UndefOr[js.Array[EventUpdateRequest]] = js.native
}

object EventPeriodUpdate {
  @scala.inline
  def apply(): EventPeriodUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventPeriodUpdate]
  }
  @scala.inline
  implicit class EventPeriodUpdateOps[Self <: EventPeriodUpdate] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setTimePeriod(value: EventPeriodRange): Self = this.set("timePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePeriod: Self = this.set("timePeriod", js.undefined)
    @scala.inline
    def setUpdatesVarargs(value: EventUpdateRequest*): Self = this.set("updates", js.Array(value :_*))
    @scala.inline
    def setUpdates(value: js.Array[EventUpdateRequest]): Self = this.set("updates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdates: Self = this.set("updates", js.undefined)
  }
  
}

