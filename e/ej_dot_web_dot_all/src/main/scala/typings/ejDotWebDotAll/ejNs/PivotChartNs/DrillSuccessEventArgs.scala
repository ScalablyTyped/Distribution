package typings.ejDotWebDotAll.ejNs.PivotChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrillSuccessEventArgs extends js.Object {
  /** returns the current instance of PivotChart.
    */
  var chartObj: js.UndefOr[js.Any] = js.undefined
  /** returns the drill action of PivotChart.
    */
  var drillAction: js.UndefOr[String] = js.undefined
  /** contains the name of the member drilled.
    */
  var drilledMember: js.UndefOr[String] = js.undefined
  /** returns the event object.
    */
  var event: js.UndefOr[js.Any] = js.undefined
}

object DrillSuccessEventArgs {
  @scala.inline
  def apply(
    chartObj: js.Any = null,
    drillAction: String = null,
    drilledMember: String = null,
    event: js.Any = null
  ): DrillSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    if (chartObj != null) __obj.updateDynamic("chartObj")(chartObj)
    if (drillAction != null) __obj.updateDynamic("drillAction")(drillAction)
    if (drilledMember != null) __obj.updateDynamic("drilledMember")(drilledMember)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[DrillSuccessEventArgs]
  }
}

