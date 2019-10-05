package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgChartSpec extends js.Object {
  /**
    * The data containing the labels for all the nodes in the chart.  Labels
    * must be unique.
    */
  var labels: js.UndefOr[ChartData] = js.undefined
  /** The color of the org chart nodes. */
  var nodeColor: js.UndefOr[Color] = js.undefined
  /** The size of the org chart nodes. */
  var nodeSize: js.UndefOr[String] = js.undefined
  /**
    * The data containing the label of the parent for the corresponding node.
    * A blank value indicates that the node has no parent and is a top-level
    * node.
    * This field is optional.
    */
  var parentLabels: js.UndefOr[ChartData] = js.undefined
  /** The color of the selected org chart nodes. */
  var selectedNodeColor: js.UndefOr[Color] = js.undefined
  /**
    * The data containing the tooltip for the corresponding node.  A blank value
    * results in no tooltip being displayed for the node.
    * This field is optional.
    */
  var tooltips: js.UndefOr[ChartData] = js.undefined
}

object OrgChartSpec {
  @scala.inline
  def apply(
    labels: ChartData = null,
    nodeColor: Color = null,
    nodeSize: String = null,
    parentLabels: ChartData = null,
    selectedNodeColor: Color = null,
    tooltips: ChartData = null
  ): OrgChartSpec = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (nodeColor != null) __obj.updateDynamic("nodeColor")(nodeColor)
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize)
    if (parentLabels != null) __obj.updateDynamic("parentLabels")(parentLabels)
    if (selectedNodeColor != null) __obj.updateDynamic("selectedNodeColor")(selectedNodeColor)
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips)
    __obj.asInstanceOf[OrgChartSpec]
  }
}

