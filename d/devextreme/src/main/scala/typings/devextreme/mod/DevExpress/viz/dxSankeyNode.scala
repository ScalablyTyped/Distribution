package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyNode extends js.Object {
  /** @name dxSankeyNode.label */
  var label: js.UndefOr[String] = js.undefined
  /** @name dxSankeyNode.linksIn */
  var linksIn: js.UndefOr[js.Array[_]] = js.undefined
  /** @name dxSankeyNode.linksOut */
  var linksOut: js.UndefOr[js.Array[_]] = js.undefined
  /** @deprecated */
  /** @name dxSankeyNode.title */
  var title: js.UndefOr[String] = js.undefined
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
    showTooltip: () => Unit,
    label: String = null,
    linksIn: js.Array[_] = null,
    linksOut: js.Array[_] = null,
    title: String = null
  ): dxSankeyNode = {
    val __obj = js.Dynamic.literal(hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), showTooltip = js.Any.fromFunction0(showTooltip))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (linksIn != null) __obj.updateDynamic("linksIn")(linksIn.asInstanceOf[js.Any])
    if (linksOut != null) __obj.updateDynamic("linksOut")(linksOut.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSankeyNode]
  }
}

