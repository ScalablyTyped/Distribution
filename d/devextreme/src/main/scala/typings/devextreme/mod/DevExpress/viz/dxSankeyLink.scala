package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyLink extends js.Object {
  /** @name dxSankeyLink.connection */
  var connection: js.UndefOr[dxSankeyConnectionInfoObject] = js.undefined
  /** @name dxSankeyLink.hideTooltip() */
  def hideTooltip(): Unit
  /** @name dxSankeyLink.hover(state) */
  def hover(state: Boolean): Unit
  /** @name dxSankeyLink.isHovered() */
  def isHovered(): Boolean
  /** @name dxSankeyLink.showTooltip() */
  def showTooltip(): Unit
}

object dxSankeyLink {
  @scala.inline
  def apply(
    hideTooltip: () => Unit,
    hover: Boolean => Unit,
    isHovered: () => Boolean,
    showTooltip: () => Unit,
    connection: dxSankeyConnectionInfoObject = null
  ): dxSankeyLink = {
    val __obj = js.Dynamic.literal(hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), showTooltip = js.Any.fromFunction0(showTooltip))
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSankeyLink]
  }
}

