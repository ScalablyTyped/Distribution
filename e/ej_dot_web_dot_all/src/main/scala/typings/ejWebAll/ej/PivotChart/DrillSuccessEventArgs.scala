package typings.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrillSuccessEventArgs extends js.Object {
  /** returns the current instance of PivotChart.
    */
  var chartObj: js.UndefOr[js.Any] = js.native
  /** returns the drill action of PivotChart.
    */
  var drillAction: js.UndefOr[String] = js.native
  /** contains the name of the member drilled.
    */
  var drilledMember: js.UndefOr[String] = js.native
  /** returns the event object.
    */
  var event: js.UndefOr[js.Any] = js.native
}

object DrillSuccessEventArgs {
  @scala.inline
  def apply(): DrillSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrillSuccessEventArgs]
  }
  @scala.inline
  implicit class DrillSuccessEventArgsOps[Self <: DrillSuccessEventArgs] (val x: Self) extends AnyVal {
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
    def setChartObj(value: js.Any): Self = this.set("chartObj", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartObj: Self = this.set("chartObj", js.undefined)
    @scala.inline
    def setDrillAction(value: String): Self = this.set("drillAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillAction: Self = this.set("drillAction", js.undefined)
    @scala.inline
    def setDrilledMember(value: String): Self = this.set("drilledMember", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrilledMember: Self = this.set("drilledMember", js.undefined)
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
  }
  
}

