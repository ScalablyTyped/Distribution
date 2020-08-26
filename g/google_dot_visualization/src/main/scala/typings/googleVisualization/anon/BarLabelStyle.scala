package typings.googleVisualization.anon

import typings.googleVisualization.google.visualization.LabelStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarLabelStyle extends js.Object {
  var barLabelStyle: js.UndefOr[LabelStyle] = js.native
  var colorByRowLabel: js.UndefOr[Boolean] = js.native
  var groupByRowLabel: js.UndefOr[Boolean] = js.native
  var rowLabelStyle: js.UndefOr[LabelStyle] = js.native
  var showRowLabels: js.UndefOr[Boolean] = js.native
  var singleColor: js.UndefOr[String] = js.native
}

object BarLabelStyle {
  @scala.inline
  def apply(): BarLabelStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarLabelStyle]
  }
  @scala.inline
  implicit class BarLabelStyleOps[Self <: BarLabelStyle] (val x: Self) extends AnyVal {
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
    def setBarLabelStyle(value: LabelStyle): Self = this.set("barLabelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarLabelStyle: Self = this.set("barLabelStyle", js.undefined)
    @scala.inline
    def setColorByRowLabel(value: Boolean): Self = this.set("colorByRowLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorByRowLabel: Self = this.set("colorByRowLabel", js.undefined)
    @scala.inline
    def setGroupByRowLabel(value: Boolean): Self = this.set("groupByRowLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupByRowLabel: Self = this.set("groupByRowLabel", js.undefined)
    @scala.inline
    def setRowLabelStyle(value: LabelStyle): Self = this.set("rowLabelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowLabelStyle: Self = this.set("rowLabelStyle", js.undefined)
    @scala.inline
    def setShowRowLabels(value: Boolean): Self = this.set("showRowLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRowLabels: Self = this.set("showRowLabels", js.undefined)
    @scala.inline
    def setSingleColor(value: String): Self = this.set("singleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleColor: Self = this.set("singleColor", js.undefined)
  }
  
}

