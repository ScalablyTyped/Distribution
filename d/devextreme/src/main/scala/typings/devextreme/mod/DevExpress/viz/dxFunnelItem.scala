package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFunnelItem extends js.Object {
  /** @name dxFunnelItem.argument */
  var argument: js.UndefOr[String | Date | Double] = js.undefined
  /** @name dxFunnelItem.data */
  var data: js.UndefOr[js.Any] = js.undefined
  /** @name dxFunnelItem.percent */
  var percent: js.UndefOr[Double] = js.undefined
  /** @name dxFunnelItem.value */
  var value: js.UndefOr[Double] = js.undefined
  /** @name dxFunnelItem.getColor() */
  def getColor(): String
  /** @name dxFunnelItem.hover(state) */
  def hover(state: Boolean): Unit
  /** @name dxFunnelItem.isHovered() */
  def isHovered(): Boolean
  /** @name dxFunnelItem.isSelected() */
  def isSelected(): Boolean
  /** @name dxFunnelItem.select(state) */
  def select(state: Boolean): Unit
  /** @name dxFunnelItem.showTooltip() */
  def showTooltip(): Unit
}

object dxFunnelItem {
  @scala.inline
  def apply(
    getColor: () => String,
    hover: Boolean => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    select: Boolean => Unit,
    showTooltip: () => Unit,
    argument: String | Date | Double = null,
    data: js.Any = null,
    percent: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): dxFunnelItem = {
    val __obj = js.Dynamic.literal(getColor = js.Any.fromFunction0(getColor), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), select = js.Any.fromFunction1(select), showTooltip = js.Any.fromFunction0(showTooltip))
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFunnelItem]
  }
}

