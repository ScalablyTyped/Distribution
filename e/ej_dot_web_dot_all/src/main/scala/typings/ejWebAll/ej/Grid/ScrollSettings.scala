package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSettings extends js.Object {
  /** This specify the grid to to view data that you require without buffering the entire load of a huge database
    * @Default {false}
    */
  var allowVirtualScrolling: js.UndefOr[Boolean] = js.undefined
  /** It accepts the boolean value and shows or hides the scrollbar while focus in or focus out of the Grid.
    * @Default {false}
    */
  var autoHide: js.UndefOr[Boolean] = js.undefined
  /** Specifies the height and width of button in the scrollbar.
    * @Default {18}
    */
  var buttonSize: js.UndefOr[Double] = js.undefined
  /** This specify the grid to enable/disable touch control for scrolling.
    * @Default {true}
    */
  var enableTouchScroll: js.UndefOr[Boolean] = js.undefined
  /** This is used to enable the enhanced virtual scrolling in Grid.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[Boolean] = js.undefined
  /** This specify the grid to freeze particular columns at the time of scrolling.
    * @Default {0}
    */
  var frozenColumns: js.UndefOr[Double] = js.undefined
  /** This specify the grid to freeze particular rows at the time of scrolling.
    * @Default {0}
    */
  var frozenRows: js.UndefOr[Double] = js.undefined
  /** This specify the grid to show the vertical scroll bar, to scroll and view the grid contents.
    * @Default {0}
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** This specify the scroll down pixel of mouse wheel, to scroll mouse wheel and view the grid contents.
    * @Default {57}
    */
  var scrollOneStepBy: js.UndefOr[Double] = js.undefined
  /** It accepts the integer value and sets the width of scrollbar.
    * @Default {18}
    */
  var scrollerSize: js.UndefOr[Double] = js.undefined
  /** This is used to define the mode of virtual scrolling in grid. See virtualScrollMode
    * @Default {ej.Grid.VirtualScrollMode.Normal}
    */
  var virtualScrollMode: js.UndefOr[VirtualScrollMode | String] = js.undefined
  /** This specify the grid to show the horizontal scroll bar, to scroll and view the grid contents
    * @Default {250}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object ScrollSettings {
  @scala.inline
  def apply(
    allowVirtualScrolling: js.UndefOr[Boolean] = js.undefined,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    buttonSize: Int | Double = null,
    enableTouchScroll: js.UndefOr[Boolean] = js.undefined,
    enableVirtualization: js.UndefOr[Boolean] = js.undefined,
    frozenColumns: Int | Double = null,
    frozenRows: Int | Double = null,
    height: String | Double = null,
    scrollOneStepBy: Int | Double = null,
    scrollerSize: Int | Double = null,
    virtualScrollMode: VirtualScrollMode | String = null,
    width: String | Double = null
  ): ScrollSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowVirtualScrolling)) __obj.updateDynamic("allowVirtualScrolling")(allowVirtualScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.asInstanceOf[js.Any])
    if (buttonSize != null) __obj.updateDynamic("buttonSize")(buttonSize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTouchScroll)) __obj.updateDynamic("enableTouchScroll")(enableTouchScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(enableVirtualization)) __obj.updateDynamic("enableVirtualization")(enableVirtualization.asInstanceOf[js.Any])
    if (frozenColumns != null) __obj.updateDynamic("frozenColumns")(frozenColumns.asInstanceOf[js.Any])
    if (frozenRows != null) __obj.updateDynamic("frozenRows")(frozenRows.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (scrollOneStepBy != null) __obj.updateDynamic("scrollOneStepBy")(scrollOneStepBy.asInstanceOf[js.Any])
    if (scrollerSize != null) __obj.updateDynamic("scrollerSize")(scrollerSize.asInstanceOf[js.Any])
    if (virtualScrollMode != null) __obj.updateDynamic("virtualScrollMode")(virtualScrollMode.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSettings]
  }
}

