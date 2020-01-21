package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable scrolling in Spreadsheet.
    * @Default {true}
    */
  var allowScrolling: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable sheet on demand. By enabling this, it render only the active sheet element while paging remaining sheets are
    * created one by one.
    * @Default {false}
    */
  var allowSheetOnDemand: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable virtual scrolling feature in the Spreadsheet.
    * @Default {true}
    */
  var allowVirtualScrolling: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets the value that indicates to define the height of spreadsheet.
    * @Default {100%}
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /** Gets or sets the value that indicates whether to enable or disable responsive mode in the Spreadsheet.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates to set scroll mode in Spreadsheet. It has two scroll modes, Normal and Infinite.
    * @Default {ej.Spreadsheet.scrollMode.Infinite}
    */
  var scrollMode: js.UndefOr[typings.ejWebAll.ej.Spreadsheet.scrollMode | String] = js.undefined
  /** Gets or sets the value that indicates to define the height of the spreadsheet.
    * @Default {100%}
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object ScrollSettings {
  @scala.inline
  def apply(
    allowScrolling: js.UndefOr[Boolean] = js.undefined,
    allowSheetOnDemand: js.UndefOr[Boolean] = js.undefined,
    allowVirtualScrolling: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    scrollMode: scrollMode | String = null,
    width: Double | String = null
  ): ScrollSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowScrolling)) __obj.updateDynamic("allowScrolling")(allowScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSheetOnDemand)) __obj.updateDynamic("allowSheetOnDemand")(allowSheetOnDemand.asInstanceOf[js.Any])
    if (!js.isUndefined(allowVirtualScrolling)) __obj.updateDynamic("allowVirtualScrolling")(allowVirtualScrolling.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (scrollMode != null) __obj.updateDynamic("scrollMode")(scrollMode.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSettings]
  }
}

