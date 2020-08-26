package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventPeriodRange extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventPeriodRange. */
  var kind: js.UndefOr[String] = js.native
  /** The time when this update period ends, in millis, since 1970 UTC (Unix Epoch). */
  var periodEndMillis: js.UndefOr[String] = js.native
  /** The time when this update period begins, in millis, since 1970 UTC (Unix Epoch). */
  var periodStartMillis: js.UndefOr[String] = js.native
}

object EventPeriodRange {
  @scala.inline
  def apply(): EventPeriodRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventPeriodRange]
  }
  @scala.inline
  implicit class EventPeriodRangeOps[Self <: EventPeriodRange] (val x: Self) extends AnyVal {
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
    def setPeriodEndMillis(value: String): Self = this.set("periodEndMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriodEndMillis: Self = this.set("periodEndMillis", js.undefined)
    @scala.inline
    def setPeriodStartMillis(value: String): Self = this.set("periodStartMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriodStartMillis: Self = this.set("periodStartMillis", js.undefined)
  }
  
}

