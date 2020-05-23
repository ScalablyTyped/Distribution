package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait basePointObject extends js.Object {
  /** @name basePointObject.data */
  var data: js.UndefOr[js.Any] = js.undefined
  /** @name basePointObject.fullState */
  var fullState: js.UndefOr[Double] = js.undefined
  /** @name basePointObject.originalArgument */
  var originalArgument: js.UndefOr[String | Double | Date] = js.undefined
  /** @name basePointObject.originalValue */
  var originalValue: js.UndefOr[String | Double | Date] = js.undefined
  /** @name basePointObject.series */
  var series: js.UndefOr[js.Any] = js.undefined
  /** @name basePointObject.tag */
  var tag: js.UndefOr[js.Any] = js.undefined
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
    getColor: () => String,
    getLabel: () => baseLabelObject with js.Array[baseLabelObject],
    hideTooltip: () => Unit,
    hover: () => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    select: () => Unit,
    showTooltip: () => Unit,
    data: js.Any = null,
    fullState: js.UndefOr[Double] = js.undefined,
    originalArgument: String | Double | Date = null,
    originalValue: String | Double | Date = null,
    series: js.Any = null,
    tag: js.Any = null
  ): basePointObject = {
    val __obj = js.Dynamic.literal(clearHover = js.Any.fromFunction0(clearHover), clearSelection = js.Any.fromFunction0(clearSelection), getColor = js.Any.fromFunction0(getColor), getLabel = js.Any.fromFunction0(getLabel), hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction0(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), select = js.Any.fromFunction0(select), showTooltip = js.Any.fromFunction0(showTooltip))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(fullState)) __obj.updateDynamic("fullState")(fullState.get.asInstanceOf[js.Any])
    if (originalArgument != null) __obj.updateDynamic("originalArgument")(originalArgument.asInstanceOf[js.Any])
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[basePointObject]
  }
}

