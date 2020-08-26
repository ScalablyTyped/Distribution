package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BandedRange extends js.Object {
  var bandedRangeId: js.UndefOr[Double] = js.native
  var columnProperties: js.UndefOr[BandingProperties] = js.native
  var range: js.UndefOr[GridRange] = js.native
  var rowProperties: js.UndefOr[BandingProperties] = js.native
}

object BandedRange {
  @scala.inline
  def apply(): BandedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandedRange]
  }
  @scala.inline
  implicit class BandedRangeOps[Self <: BandedRange] (val x: Self) extends AnyVal {
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
    def setBandedRangeId(value: Double): Self = this.set("bandedRangeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandedRangeId: Self = this.set("bandedRangeId", js.undefined)
    @scala.inline
    def setColumnProperties(value: BandingProperties): Self = this.set("columnProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnProperties: Self = this.set("columnProperties", js.undefined)
    @scala.inline
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRowProperties(value: BandingProperties): Self = this.set("rowProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowProperties: Self = this.set("rowProperties", js.undefined)
  }
  
}

