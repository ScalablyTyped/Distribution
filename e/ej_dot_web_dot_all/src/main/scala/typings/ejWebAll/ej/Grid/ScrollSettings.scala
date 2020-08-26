package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollSettings extends js.Object {
  /** This specify the grid to to view data that you require without buffering the entire load of a huge database
    * @Default {false}
    */
  var allowVirtualScrolling: js.UndefOr[Boolean] = js.native
  /** It accepts the boolean value and shows or hides the scrollbar while focus in or focus out of the Grid.
    * @Default {false}
    */
  var autoHide: js.UndefOr[Boolean] = js.native
  /** Specifies the height and width of button in the scrollbar.
    * @Default {18}
    */
  var buttonSize: js.UndefOr[Double] = js.native
  /** This specify the grid to enable/disable touch control for scrolling.
    * @Default {true}
    */
  var enableTouchScroll: js.UndefOr[Boolean] = js.native
  /** This is used to enable the enhanced virtual scrolling in Grid.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[Boolean] = js.native
  /** This specify the grid to freeze particular columns at the time of scrolling.
    * @Default {0}
    */
  var frozenColumns: js.UndefOr[Double] = js.native
  /** This specify the grid to freeze particular rows at the time of scrolling.
    * @Default {0}
    */
  var frozenRows: js.UndefOr[Double] = js.native
  /** This specify the grid to show the vertical scroll bar, to scroll and view the grid contents.
    * @Default {0}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** This specify the scroll down pixel of mouse wheel, to scroll mouse wheel and view the grid contents.
    * @Default {57}
    */
  var scrollOneStepBy: js.UndefOr[Double] = js.native
  /** It accepts the integer value and sets the width of scrollbar.
    * @Default {18}
    */
  var scrollerSize: js.UndefOr[Double] = js.native
  /** This is used to define the mode of virtual scrolling in grid. See virtualScrollMode
    * @Default {ej.Grid.VirtualScrollMode.Normal}
    */
  var virtualScrollMode: js.UndefOr[VirtualScrollMode | String] = js.native
  /** This specify the grid to show the horizontal scroll bar, to scroll and view the grid contents
    * @Default {250}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object ScrollSettings {
  @scala.inline
  def apply(): ScrollSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollSettings]
  }
  @scala.inline
  implicit class ScrollSettingsOps[Self <: ScrollSettings] (val x: Self) extends AnyVal {
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
    def setAllowVirtualScrolling(value: Boolean): Self = this.set("allowVirtualScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowVirtualScrolling: Self = this.set("allowVirtualScrolling", js.undefined)
    @scala.inline
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    @scala.inline
    def setButtonSize(value: Double): Self = this.set("buttonSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonSize: Self = this.set("buttonSize", js.undefined)
    @scala.inline
    def setEnableTouchScroll(value: Boolean): Self = this.set("enableTouchScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTouchScroll: Self = this.set("enableTouchScroll", js.undefined)
    @scala.inline
    def setEnableVirtualization(value: Boolean): Self = this.set("enableVirtualization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableVirtualization: Self = this.set("enableVirtualization", js.undefined)
    @scala.inline
    def setFrozenColumns(value: Double): Self = this.set("frozenColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozenColumns: Self = this.set("frozenColumns", js.undefined)
    @scala.inline
    def setFrozenRows(value: Double): Self = this.set("frozenRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozenRows: Self = this.set("frozenRows", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setScrollOneStepBy(value: Double): Self = this.set("scrollOneStepBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOneStepBy: Self = this.set("scrollOneStepBy", js.undefined)
    @scala.inline
    def setScrollerSize(value: Double): Self = this.set("scrollerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollerSize: Self = this.set("scrollerSize", js.undefined)
    @scala.inline
    def setVirtualScrollMode(value: VirtualScrollMode | String): Self = this.set("virtualScrollMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualScrollMode: Self = this.set("virtualScrollMode", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

