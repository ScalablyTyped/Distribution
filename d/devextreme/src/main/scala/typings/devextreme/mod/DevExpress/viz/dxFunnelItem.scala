package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFunnelItem extends js.Object {
  /** @name dxFunnelItem.argument */
  var argument: js.UndefOr[String | Date | Double] = js.native
  /** @name dxFunnelItem.data */
  var data: js.UndefOr[js.Any] = js.native
  /** @name dxFunnelItem.percent */
  var percent: js.UndefOr[Double] = js.native
  /** @name dxFunnelItem.value */
  var value: js.UndefOr[Double] = js.native
  /** @name dxFunnelItem.getColor() */
  def getColor(): String = js.native
  /** @name dxFunnelItem.hover(state) */
  def hover(state: Boolean): Unit = js.native
  /** @name dxFunnelItem.isHovered() */
  def isHovered(): Boolean = js.native
  /** @name dxFunnelItem.isSelected() */
  def isSelected(): Boolean = js.native
  /** @name dxFunnelItem.select(state) */
  def select(state: Boolean): Unit = js.native
  /** @name dxFunnelItem.showTooltip() */
  def showTooltip(): Unit = js.native
}

object dxFunnelItem {
  @scala.inline
  def apply(
    getColor: () => String,
    hover: Boolean => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    select: Boolean => Unit,
    showTooltip: () => Unit
  ): dxFunnelItem = {
    val __obj = js.Dynamic.literal(getColor = js.Any.fromFunction0(getColor), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), select = js.Any.fromFunction1(select), showTooltip = js.Any.fromFunction0(showTooltip))
    __obj.asInstanceOf[dxFunnelItem]
  }
  @scala.inline
  implicit class dxFunnelItemOps[Self <: dxFunnelItem] (val x: Self) extends AnyVal {
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
    def setGetColor(value: () => String): Self = this.set("getColor", js.Any.fromFunction0(value))
    @scala.inline
    def setHover(value: Boolean => Unit): Self = this.set("hover", js.Any.fromFunction1(value))
    @scala.inline
    def setIsHovered(value: () => Boolean): Self = this.set("isHovered", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSelected(value: () => Boolean): Self = this.set("isSelected", js.Any.fromFunction0(value))
    @scala.inline
    def setSelect(value: Boolean => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def setShowTooltip(value: () => Unit): Self = this.set("showTooltip", js.Any.fromFunction0(value))
    @scala.inline
    def setArgument(value: String | Date | Double): Self = this.set("argument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgument: Self = this.set("argument", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

