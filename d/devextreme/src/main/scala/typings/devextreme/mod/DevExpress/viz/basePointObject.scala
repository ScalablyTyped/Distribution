package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait basePointObject extends js.Object {
  /** Contains the data object that the series point represents. */
  var data: js.Any
  /** Provides information about the state of the point object. */
  var fullState: Double
  /** Returns the point's argument value that was set in the data source. */
  var originalArgument: String | Double | Date
  /** Returns the point's value that was set in the data source. */
  var originalValue: String | Double | Date
  /** Returns the series object to which the point belongs. */
  var series: js.Any
  /** Returns the tag of the point. */
  var tag: js.Any
  /** Switches the point from the hover state back to normal. */
  def clearHover(): Unit
  /** Deselects the point. */
  def clearSelection(): Unit
  /** Gets the color of a particular point. */
  def getColor(): String
  /** Allows you to obtain the label(s) of the series point. */
  def getLabel(): baseLabelObject with js.Array[baseLabelObject]
  /** Hides the tooltip of the point. */
  def hideTooltip(): Unit
  /** Switches the point into the hover state, the same as when a user places the mouse pointer on it. */
  def hover(): Unit
  /** Provides information about the hover state of a point. */
  def isHovered(): Boolean
  /** Provides information about the selection state of a point. */
  def isSelected(): Boolean
  /** Selects the point. The point is displayed in a 'selected' style until another point is selected or the current point is deselected programmatically. */
  def select(): Unit
  /** Shows the tooltip of the point. */
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

