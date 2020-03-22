package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyLink extends js.Object {
  /** An object that describes the connection. */
  var connection: dxSankeyConnectionInfoObject
  /** Hides the sankey link's tooltip. */
  def hideTooltip(): Unit
  /** Changes the sankey link's hover state. */
  def hover(state: Boolean): Unit
  /** Indicates whether the sankey link is in the hover state. */
  def isHovered(): Boolean
  /** Shows the sankey link's tooltip. */
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

