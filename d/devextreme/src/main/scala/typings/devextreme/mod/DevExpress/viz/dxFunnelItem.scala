package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFunnelItem extends js.Object {
  /** The item's argument. */
  var argument: String | Date | Double
  /** The item's original data object. */
  var data: js.Any
  /** The item's calculated percentage value. */
  var percent: Double
  /** The item's value. */
  var value: Double
  /** Gets the funnel item's color specified in the data source or palette. */
  def getColor(): String
  /** Changes the funnel item's hover state. */
  def hover(state: Boolean): Unit
  /** Indicates whether the funnel item is in the hover state. */
  def isHovered(): Boolean
  /** Indicates whether the funnel item is selected. */
  def isSelected(): Boolean
  /** Selects or cancels the funnel item's selection. */
  def select(state: Boolean): Unit
  /** Shows the funnel item's tooltip. */
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

