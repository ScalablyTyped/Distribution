package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTimelineSample extends js.Object {
  var activeUnits: js.UndefOr[String] = js.native
  var completedUnits: js.UndefOr[String] = js.native
  var elapsedMs: js.UndefOr[String] = js.native
  var pendingUnits: js.UndefOr[String] = js.native
  var totalSlotMs: js.UndefOr[String] = js.native
}

object QueryTimelineSample {
  @scala.inline
  def apply(): QueryTimelineSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTimelineSample]
  }
  @scala.inline
  implicit class QueryTimelineSampleOps[Self <: QueryTimelineSample] (val x: Self) extends AnyVal {
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
    def setActiveUnits(value: String): Self = this.set("activeUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveUnits: Self = this.set("activeUnits", js.undefined)
    @scala.inline
    def setCompletedUnits(value: String): Self = this.set("completedUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedUnits: Self = this.set("completedUnits", js.undefined)
    @scala.inline
    def setElapsedMs(value: String): Self = this.set("elapsedMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElapsedMs: Self = this.set("elapsedMs", js.undefined)
    @scala.inline
    def setPendingUnits(value: String): Self = this.set("pendingUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingUnits: Self = this.set("pendingUnits", js.undefined)
    @scala.inline
    def setTotalSlotMs(value: String): Self = this.set("totalSlotMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSlotMs: Self = this.set("totalSlotMs", js.undefined)
  }
  
}

