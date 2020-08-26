package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgChartSpec extends js.Object {
  var labels: js.UndefOr[ChartData] = js.native
  var nodeColor: js.UndefOr[Color] = js.native
  var nodeSize: js.UndefOr[String] = js.native
  var parentLabels: js.UndefOr[ChartData] = js.native
  var selectedNodeColor: js.UndefOr[Color] = js.native
  var tooltips: js.UndefOr[ChartData] = js.native
}

object OrgChartSpec {
  @scala.inline
  def apply(): OrgChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgChartSpec]
  }
  @scala.inline
  implicit class OrgChartSpecOps[Self <: OrgChartSpec] (val x: Self) extends AnyVal {
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
    def setLabels(value: ChartData): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setNodeColor(value: Color): Self = this.set("nodeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeColor: Self = this.set("nodeColor", js.undefined)
    @scala.inline
    def setNodeSize(value: String): Self = this.set("nodeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeSize: Self = this.set("nodeSize", js.undefined)
    @scala.inline
    def setParentLabels(value: ChartData): Self = this.set("parentLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentLabels: Self = this.set("parentLabels", js.undefined)
    @scala.inline
    def setSelectedNodeColor(value: Color): Self = this.set("selectedNodeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedNodeColor: Self = this.set("selectedNodeColor", js.undefined)
    @scala.inline
    def setTooltips(value: ChartData): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
  }
  
}

