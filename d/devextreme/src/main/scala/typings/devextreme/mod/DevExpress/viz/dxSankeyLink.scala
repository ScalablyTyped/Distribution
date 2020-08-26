package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSankeyLink extends js.Object {
  /** @name dxSankeyLink.connection */
  var connection: js.UndefOr[dxSankeyConnectionInfoObject] = js.native
  /** @name dxSankeyLink.hideTooltip() */
  def hideTooltip(): Unit = js.native
  /** @name dxSankeyLink.hover(state) */
  def hover(state: Boolean): Unit = js.native
  /** @name dxSankeyLink.isHovered() */
  def isHovered(): Boolean = js.native
  /** @name dxSankeyLink.showTooltip() */
  def showTooltip(): Unit = js.native
}

object dxSankeyLink {
  @scala.inline
  def apply(hideTooltip: () => Unit, hover: Boolean => Unit, isHovered: () => Boolean, showTooltip: () => Unit): dxSankeyLink = {
    val __obj = js.Dynamic.literal(hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), showTooltip = js.Any.fromFunction0(showTooltip))
    __obj.asInstanceOf[dxSankeyLink]
  }
  @scala.inline
  implicit class dxSankeyLinkOps[Self <: dxSankeyLink] (val x: Self) extends AnyVal {
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
    def setHideTooltip(value: () => Unit): Self = this.set("hideTooltip", js.Any.fromFunction0(value))
    @scala.inline
    def setHover(value: Boolean => Unit): Self = this.set("hover", js.Any.fromFunction1(value))
    @scala.inline
    def setIsHovered(value: () => Boolean): Self = this.set("isHovered", js.Any.fromFunction0(value))
    @scala.inline
    def setShowTooltip(value: () => Unit): Self = this.set("showTooltip", js.Any.fromFunction0(value))
    @scala.inline
    def setConnection(value: dxSankeyConnectionInfoObject): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
  }
  
}

