package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgChartSpec extends js.Object {
  /**
    * The data containing the labels for all the nodes in the chart.  Labels
    * must be unique.
    */
  var labels: js.UndefOr[ChartData] = js.native
  /** The color of the org chart nodes. */
  var nodeColor: js.UndefOr[Color] = js.native
  /**
    * The color of the org chart nodes.
    * If node_color is also set, this field takes precedence.
    */
  var nodeColorStyle: js.UndefOr[ColorStyle] = js.native
  /** The size of the org chart nodes. */
  var nodeSize: js.UndefOr[String] = js.native
  /**
    * The data containing the label of the parent for the corresponding node.
    * A blank value indicates that the node has no parent and is a top-level
    * node.
    * This field is optional.
    */
  var parentLabels: js.UndefOr[ChartData] = js.native
  /** The color of the selected org chart nodes. */
  var selectedNodeColor: js.UndefOr[Color] = js.native
  /**
    * The color of the selected org chart nodes.
    * If selected_node_color is also set, this field takes precedence.
    */
  var selectedNodeColorStyle: js.UndefOr[ColorStyle] = js.native
  /**
    * The data containing the tooltip for the corresponding node.  A blank value
    * results in no tooltip being displayed for the node.
    * This field is optional.
    */
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
    def setNodeColorStyle(value: ColorStyle): Self = this.set("nodeColorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeColorStyle: Self = this.set("nodeColorStyle", js.undefined)
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
    def setSelectedNodeColorStyle(value: ColorStyle): Self = this.set("selectedNodeColorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedNodeColorStyle: Self = this.set("selectedNodeColorStyle", js.undefined)
    @scala.inline
    def setTooltips(value: ChartData): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
  }
  
}

