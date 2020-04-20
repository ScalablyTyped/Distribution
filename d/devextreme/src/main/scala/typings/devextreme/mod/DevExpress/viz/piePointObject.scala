package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait piePointObject extends basePointObject {
  /** @name piePointObject.percent */
  var percent: String | Double | Date
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
    data: js.Any,
    fullState: Double,
    getColor: () => String,
    getLabel: () => baseLabelObject with js.Array[baseLabelObject],
    hide: () => Unit,
    hideTooltip: () => Unit,
    hover: () => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    isVisible: () => Boolean,
    originalArgument: String | Double | Date,
    originalValue: String | Double | Date,
    percent: String | Double | Date,
    select: () => Unit,
    series: js.Any,
    show: () => Unit,
    showTooltip: () => Unit,
    tag: js.Any
  ): piePointObject = {
    val __obj = js.Dynamic.literal(clearHover = js.Any.fromFunction0(clearHover), clearSelection = js.Any.fromFunction0(clearSelection), data = data.asInstanceOf[js.Any], fullState = fullState.asInstanceOf[js.Any], getColor = js.Any.fromFunction0(getColor), getLabel = js.Any.fromFunction0(getLabel), hide = js.Any.fromFunction0(hide), hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction0(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), isVisible = js.Any.fromFunction0(isVisible), originalArgument = originalArgument.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], select = js.Any.fromFunction0(select), series = series.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), showTooltip = js.Any.fromFunction0(showTooltip), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[piePointObject]
  }
}

