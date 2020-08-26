package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable scrolling in Spreadsheet.
    * @Default {true}
    */
  var allowScrolling: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable sheet on demand. By enabling this, it render only the active sheet element while paging remaining sheets are
    * created one by one.
    * @Default {false}
    */
  var allowSheetOnDemand: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable virtual scrolling feature in the Spreadsheet.
    * @Default {true}
    */
  var allowVirtualScrolling: js.UndefOr[Boolean] = js.native
  /** Gets or sets the value that indicates to define the height of spreadsheet.
    * @Default {100%}
    */
  var height: js.UndefOr[Double | String] = js.native
  /** Gets or sets the value that indicates whether to enable or disable responsive mode in the Spreadsheet.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to set scroll mode in Spreadsheet. It has two scroll modes, Normal and Infinite.
    * @Default {ej.Spreadsheet.scrollMode.Infinite}
    */
  var scrollMode: js.UndefOr[typings.ejWebAll.ej.Spreadsheet.scrollMode | String] = js.native
  /** Gets or sets the value that indicates to define the height of the spreadsheet.
    * @Default {100%}
    */
  var width: js.UndefOr[Double | String] = js.native
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
    def setAllowScrolling(value: Boolean): Self = this.set("allowScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowScrolling: Self = this.set("allowScrolling", js.undefined)
    @scala.inline
    def setAllowSheetOnDemand(value: Boolean): Self = this.set("allowSheetOnDemand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSheetOnDemand: Self = this.set("allowSheetOnDemand", js.undefined)
    @scala.inline
    def setAllowVirtualScrolling(value: Boolean): Self = this.set("allowVirtualScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowVirtualScrolling: Self = this.set("allowVirtualScrolling", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setScrollMode(value: scrollMode | String): Self = this.set("scrollMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollMode: Self = this.set("scrollMode", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

