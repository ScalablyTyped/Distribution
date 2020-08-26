package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.CellColor
import typings.googleVisualization.anon.Colors
import typings.googleVisualization.anon.IsHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarOptions extends js.Object {
  var calendar: CellColor = js.native
  var colorAxis: js.UndefOr[Colors] = js.native
  var forceIFrame: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var noDataPattern: js.UndefOr[js.Object] = js.native
  var tooltip: IsHtml = js.native
  var width: js.UndefOr[Double] = js.native
}

object CalendarOptions {
  @scala.inline
  def apply(calendar: CellColor, tooltip: IsHtml): CalendarOptions = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarOptions]
  }
  @scala.inline
  implicit class CalendarOptionsOps[Self <: CalendarOptions] (val x: Self) extends AnyVal {
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
    def setCalendar(value: CellColor): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: IsHtml): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorAxis(value: Colors): Self = this.set("colorAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorAxis: Self = this.set("colorAxis", js.undefined)
    @scala.inline
    def setForceIFrame(value: Boolean): Self = this.set("forceIFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIFrame: Self = this.set("forceIFrame", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setNoDataPattern(value: js.Object): Self = this.set("noDataPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDataPattern: Self = this.set("noDataPattern", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

