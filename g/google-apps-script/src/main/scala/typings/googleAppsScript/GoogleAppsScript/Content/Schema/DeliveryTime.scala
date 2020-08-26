package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryTime extends js.Object {
  var cutoffTime: js.UndefOr[CutoffTime] = js.native
  var holidayCutoffs: js.UndefOr[js.Array[HolidayCutoff]] = js.native
  var maxHandlingTimeInDays: js.UndefOr[Double] = js.native
  var maxTransitTimeInDays: js.UndefOr[Double] = js.native
  var minHandlingTimeInDays: js.UndefOr[Double] = js.native
  var minTransitTimeInDays: js.UndefOr[Double] = js.native
  var transitTimeTable: js.UndefOr[TransitTable] = js.native
}

object DeliveryTime {
  @scala.inline
  def apply(): DeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryTime]
  }
  @scala.inline
  implicit class DeliveryTimeOps[Self <: DeliveryTime] (val x: Self) extends AnyVal {
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
    def setCutoffTime(value: CutoffTime): Self = this.set("cutoffTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCutoffTime: Self = this.set("cutoffTime", js.undefined)
    @scala.inline
    def setHolidayCutoffsVarargs(value: HolidayCutoff*): Self = this.set("holidayCutoffs", js.Array(value :_*))
    @scala.inline
    def setHolidayCutoffs(value: js.Array[HolidayCutoff]): Self = this.set("holidayCutoffs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHolidayCutoffs: Self = this.set("holidayCutoffs", js.undefined)
    @scala.inline
    def setMaxHandlingTimeInDays(value: Double): Self = this.set("maxHandlingTimeInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHandlingTimeInDays: Self = this.set("maxHandlingTimeInDays", js.undefined)
    @scala.inline
    def setMaxTransitTimeInDays(value: Double): Self = this.set("maxTransitTimeInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTransitTimeInDays: Self = this.set("maxTransitTimeInDays", js.undefined)
    @scala.inline
    def setMinHandlingTimeInDays(value: Double): Self = this.set("minHandlingTimeInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHandlingTimeInDays: Self = this.set("minHandlingTimeInDays", js.undefined)
    @scala.inline
    def setMinTransitTimeInDays(value: Double): Self = this.set("minTransitTimeInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTransitTimeInDays: Self = this.set("minTransitTimeInDays", js.undefined)
    @scala.inline
    def setTransitTimeTable(value: TransitTable): Self = this.set("transitTimeTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitTimeTable: Self = this.set("transitTimeTable", js.undefined)
  }
  
}

