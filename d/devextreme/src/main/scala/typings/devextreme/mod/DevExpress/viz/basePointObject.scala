package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait basePointObject extends js.Object {
  /** @name basePointObject.data */
  var data: js.Any
  /** @name basePointObject.fullState */
  var fullState: Double
  /** @name basePointObject.originalArgument */
  var originalArgument: String | Double | Date
  /** @name basePointObject.originalValue */
  var originalValue: String | Double | Date
  /** @name basePointObject.series */
  var series: js.Any
  /** @name basePointObject.tag */
  var tag: js.Any
  /** @name basePointObject.clearHover() */
  def clearHover(): Unit
  /** @name basePointObject.clearSelection() */
  def clearSelection(): Unit
  /** @name basePointObject.getColor() */
  def getColor(): String
  /** @name basePointObject.getLabel() */
  def getLabel(): baseLabelObject with js.Array[baseLabelObject]
  /** @name basePointObject.hideTooltip() */
  def hideTooltip(): Unit
  /** @name basePointObject.hover() */
  def hover(): Unit
  /** @name basePointObject.isHovered() */
  def isHovered(): Boolean
  /** @name basePointObject.isSelected() */
  def isSelected(): Boolean
  /** @name basePointObject.select() */
  def select(): Unit
  /** @name basePointObject.showTooltip() */
  def showTooltip(): Unit
}

object basePointObject {
  @scala.inline
  def apply(
    clearHover: () => Unit,
    clearSelection: () => Unit,
    data: js.Any,
    fullState: Double,
    getColor: () => String,
    getLabel: () => baseLabelObject with js.Array[baseLabelObject],
    hideTooltip: () => Unit,
    hover: () => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    originalArgument: String | Double | Date,
    originalValue: String | Double | Date,
    select: () => Unit,
    series: js.Any,
    showTooltip: () => Unit,
    tag: js.Any
  ): basePointObject = {
    val __obj = js.Dynamic.literal(clearHover = js.Any.fromFunction0(clearHover), clearSelection = js.Any.fromFunction0(clearSelection), data = data.asInstanceOf[js.Any], fullState = fullState.asInstanceOf[js.Any], getColor = js.Any.fromFunction0(getColor), getLabel = js.Any.fromFunction0(getLabel), hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction0(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), originalArgument = originalArgument.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], select = js.Any.fromFunction0(select), series = series.asInstanceOf[js.Any], showTooltip = js.Any.fromFunction0(showTooltip), tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[basePointObject]
  }
}

