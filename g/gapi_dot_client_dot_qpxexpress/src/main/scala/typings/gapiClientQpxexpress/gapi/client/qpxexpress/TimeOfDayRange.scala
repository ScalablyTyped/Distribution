package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeOfDayRange extends js.Object {
  /** The earliest time of day in HH:MM format. */
  var earliestTime: js.UndefOr[String] = js.native
  /**
    * Identifies this as a time of day range object, representing two times in a single day defining a time range. Value: the fixed string
    * qpxexpress#timeOfDayRange.
    */
  var kind: js.UndefOr[String] = js.native
  /** The latest time of day in HH:MM format. */
  var latestTime: js.UndefOr[String] = js.native
}

object TimeOfDayRange {
  @scala.inline
  def apply(): TimeOfDayRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOfDayRange]
  }
  @scala.inline
  implicit class TimeOfDayRangeOps[Self <: TimeOfDayRange] (val x: Self) extends AnyVal {
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
    def setEarliestTime(value: String): Self = this.set("earliestTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEarliestTime: Self = this.set("earliestTime", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLatestTime(value: String): Self = this.set("latestTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestTime: Self = this.set("latestTime", js.undefined)
  }
  
}

