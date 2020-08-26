package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSankeyNode extends js.Object {
  /** @name dxSankeyNode.label */
  var label: js.UndefOr[String] = js.native
  /** @name dxSankeyNode.linksIn */
  var linksIn: js.UndefOr[js.Array[_]] = js.native
  /** @name dxSankeyNode.linksOut */
  var linksOut: js.UndefOr[js.Array[_]] = js.native
  /** @deprecated */
  /** @name dxSankeyNode.title */
  var title: js.UndefOr[String] = js.native
  /** @name dxSankeyNode.hideTooltip() */
  def hideTooltip(): Unit = js.native
  /** @name dxSankeyNode.hover(state) */
  def hover(state: Boolean): Unit = js.native
  /** @name dxSankeyNode.isHovered() */
  def isHovered(): Boolean = js.native
  /** @name dxSankeyNode.showTooltip() */
  def showTooltip(): Unit = js.native
}

object dxSankeyNode {
  @scala.inline
  def apply(hideTooltip: () => Unit, hover: Boolean => Unit, isHovered: () => Boolean, showTooltip: () => Unit): dxSankeyNode = {
    val __obj = js.Dynamic.literal(hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), showTooltip = js.Any.fromFunction0(showTooltip))
    __obj.asInstanceOf[dxSankeyNode]
  }
  @scala.inline
  implicit class dxSankeyNodeOps[Self <: dxSankeyNode] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLinksInVarargs(value: js.Any*): Self = this.set("linksIn", js.Array(value :_*))
    @scala.inline
    def setLinksIn(value: js.Array[_]): Self = this.set("linksIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinksIn: Self = this.set("linksIn", js.undefined)
    @scala.inline
    def setLinksOutVarargs(value: js.Any*): Self = this.set("linksOut", js.Array(value :_*))
    @scala.inline
    def setLinksOut(value: js.Array[_]): Self = this.set("linksOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinksOut: Self = this.set("linksOut", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

