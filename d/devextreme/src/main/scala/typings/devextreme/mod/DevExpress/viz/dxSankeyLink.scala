package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyLink extends js.Object {
  /** @name dxSankeyLink.connection */
  var connection: dxSankeyConnectionInfoObject
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
    connection: dxSankeyConnectionInfoObject,
    hideTooltip: () => Unit,
    hover: Boolean => Unit,
    isHovered: () => Boolean,
    showTooltip: () => Unit
  ): dxSankeyLink = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), showTooltip = js.Any.fromFunction0(showTooltip))
    __obj.asInstanceOf[dxSankeyLink]
  }
}

