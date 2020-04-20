package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyNode extends js.Object {
  /** @name dxSankeyNode.label */
  var label: String
  /** @name dxSankeyNode.linksIn */
  var linksIn: js.Array[_]
  /** @name dxSankeyNode.linksOut */
  var linksOut: js.Array[_]
  /** @deprecated */
  /** @name dxSankeyNode.title */
  var title: String
  /** @name dxSankeyNode.hideTooltip() */
  def hideTooltip(): Unit
  /** @name dxSankeyNode.hover(state) */
  def hover(state: Boolean): Unit
  /** @name dxSankeyNode.isHovered() */
  def isHovered(): Boolean
  /** @name dxSankeyNode.showTooltip() */
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

