package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable scrolling in Spreadsheet.
    * @Default {true}
    */
  var allowScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable sheet on demand. By enabling this, it render only the active sheet element while paging remaining sheets are
    * created one by one.
    * @Default {false}
    */
  var allowSheetOnDemand: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable virtual scrolling feature in the Spreadsheet.
    * @Default {true}
    */
  var allowVirtualScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets the value that indicates to define the height of spreadsheet.
    * @Default {100%}
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Gets or sets the value that indicates whether to enable or disable responsive mode in the Spreadsheet.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to set scroll mode in Spreadsheet. It has two scroll modes, Normal and Infinite.
    * @Default {ej.Spreadsheet.scrollMode.Infinite}
    */
  var scrollMode: js.UndefOr[scrollMode | java.lang.String] = js.undefined
  /** Gets or sets the value that indicates to define the height of the spreadsheet.
    * @Default {100%}
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object ScrollSettings {
  @scala.inline
  def apply(
    allowScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    allowSheetOnDemand: js.UndefOr[scala.Boolean] = js.undefined,
    allowVirtualScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    scrollMode: scrollMode | java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): ScrollSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowScrolling)) __obj.updateDynamic("allowScrolling")(allowScrolling)
    if (!js.isUndefined(allowSheetOnDemand)) __obj.updateDynamic("allowSheetOnDemand")(allowSheetOnDemand)
    if (!js.isUndefined(allowVirtualScrolling)) __obj.updateDynamic("allowVirtualScrolling")(allowVirtualScrolling)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (scrollMode != null) __obj.updateDynamic("scrollMode")(scrollMode.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSettings]
  }
}

