package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait piePointObject extends basePointObject {
  /** @name piePointObject.percent */
  var percent: js.UndefOr[String | Double | Date] = js.undefined
  /** @name piePointObject.hide() */
  def hide(): Unit
  /** @name piePointObject.isVisible() */
  def isVisible(): Boolean
  /** @name piePointObject.show() */
  def show(): Unit
}

object piePointObject {
  @scala.inline
  def apply(
    clearHover: () => Unit,
    clearSelection: () => Unit,
    getColor: () => String,
    getLabel: () => baseLabelObject with js.Array[baseLabelObject],
    hide: () => Unit,
    hideTooltip: () => Unit,
    hover: () => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    isVisible: () => Boolean,
    select: () => Unit,
    show: () => Unit,
    showTooltip: () => Unit,
    data: js.Any = null,
    fullState: js.UndefOr[Double] = js.undefined,
    originalArgument: String | Double | Date = null,
    originalValue: String | Double | Date = null,
    percent: String | Double | Date = null,
    series: js.Any = null,
    tag: js.Any = null
  ): piePointObject = {
    val __obj = js.Dynamic.literal(clearHover = js.Any.fromFunction0(clearHover), clearSelection = js.Any.fromFunction0(clearSelection), getColor = js.Any.fromFunction0(getColor), getLabel = js.Any.fromFunction0(getLabel), hide = js.Any.fromFunction0(hide), hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction0(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), isVisible = js.Any.fromFunction0(isVisible), select = js.Any.fromFunction0(select), show = js.Any.fromFunction0(show), showTooltip = js.Any.fromFunction0(showTooltip))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(fullState)) __obj.updateDynamic("fullState")(fullState.get.asInstanceOf[js.Any])
    if (originalArgument != null) __obj.updateDynamic("originalArgument")(originalArgument.asInstanceOf[js.Any])
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[piePointObject]
  }
}

