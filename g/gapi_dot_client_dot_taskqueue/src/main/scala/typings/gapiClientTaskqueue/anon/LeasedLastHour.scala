package typings.gapiClientTaskqueue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeasedLastHour extends js.Object {
  /** Number of tasks leased in the last hour. */
  var leasedLastHour: js.UndefOr[String] = js.native
  /** Number of tasks leased in the last minute. */
  var leasedLastMinute: js.UndefOr[String] = js.native
  /** The timestamp (in seconds since the epoch) of the oldest unfinished task. */
  var oldestTask: js.UndefOr[String] = js.native
  /** Number of tasks in the queue. */
  var totalTasks: js.UndefOr[Double] = js.native
}

object LeasedLastHour {
  @scala.inline
  def apply(): LeasedLastHour = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeasedLastHour]
  }
  @scala.inline
  implicit class LeasedLastHourOps[Self <: LeasedLastHour] (val x: Self) extends AnyVal {
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
    def setLeasedLastHour(value: String): Self = this.set("leasedLastHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeasedLastHour: Self = this.set("leasedLastHour", js.undefined)
    @scala.inline
    def setLeasedLastMinute(value: String): Self = this.set("leasedLastMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeasedLastMinute: Self = this.set("leasedLastMinute", js.undefined)
    @scala.inline
    def setOldestTask(value: String): Self = this.set("oldestTask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldestTask: Self = this.set("oldestTask", js.undefined)
    @scala.inline
    def setTotalTasks(value: Double): Self = this.set("totalTasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalTasks: Self = this.set("totalTasks", js.undefined)
  }
  
}

