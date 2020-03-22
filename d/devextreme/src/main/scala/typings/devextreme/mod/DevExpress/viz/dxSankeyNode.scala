package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyNode extends js.Object {
  /** The node's label. */
  var label: String
  /** The node's incoming links. */
  var linksIn: js.Array[_]
  /** The node's outgoing links. */
  var linksOut: js.Array[_]
  /** @deprecated Use [label](/api-reference/20%20Data%20Visualization%20Widgets/dxSankey/6%20Node/2%20Fields/label.md '/Documentation/ApiReference/Data_Visualization_Widgets/dxSankey/Node/Fields/#label') instead. */
  /** The node's label. */
  var title: String
  /** Hides the sankey node's tooltip. */
  def hideTooltip(): Unit
  /** Changes the sankey node's hover state. */
  def hover(state: Boolean): Unit
  /** Indicates whether the sankey node is in the hover state. */
  def isHovered(): Boolean
  /** Shows the sankey node's tooltip. */
  def showTooltip(): Unit
}

object dxSankeyNode {
  @scala.inline
  def apply(
    hideTooltip: () => Unit,
    hover: Boolean => Unit,
    isHovered: () => Boolean,
    label: String,
    linksIn: js.Array[_],
    linksOut: js.Array[_],
    showTooltip: () => Unit,
    title: String
  ): dxSankeyNode = {
    val __obj = js.Dynamic.literal(hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), label = label.asInstanceOf[js.Any], linksIn = linksIn.asInstanceOf[js.Any], linksOut = linksOut.asInstanceOf[js.Any], showTooltip = js.Any.fromFunction0(showTooltip), title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[dxSankeyNode]
  }
}

