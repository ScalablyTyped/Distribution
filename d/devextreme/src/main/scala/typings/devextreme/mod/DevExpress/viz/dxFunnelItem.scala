package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFunnelItem extends js.Object {
  /** @name dxFunnelItem.argument */
  var argument: String | Date | Double
  /** @name dxFunnelItem.data */
  var data: js.Any
  /** @name dxFunnelItem.percent */
  var percent: Double
  /** @name dxFunnelItem.value */
  var value: Double
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
    argument: String | Date | Double,
    data: js.Any,
    getColor: () => String,
    hover: Boolean => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    percent: Double,
    select: Boolean => Unit,
    showTooltip: () => Unit,
    value: Double
  ): dxFunnelItem = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getColor = js.Any.fromFunction0(getColor), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), percent = percent.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), showTooltip = js.Any.fromFunction0(showTooltip), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFunnelItem]
  }
}

