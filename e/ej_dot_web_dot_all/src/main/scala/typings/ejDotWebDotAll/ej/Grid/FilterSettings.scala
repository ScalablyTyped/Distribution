package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSettings extends js.Object {
  /** Gets or sets a value that indicates to perform the filter operation with case sensitive in excel styled filter menu mode
    * @Default {false}
    */
  var enableCaseSensitivity: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates to define the interDeterminateState of checkbox in excel filter dialog.
    * @Default {true}
    */
  var enableInterDeterminateState: js.UndefOr[Boolean] = js.undefined
  /** This specifies the grid to starts the filter action while typing in the filterBar or after pressing the enter key. based on the filterBarMode. See filterBarMode.
    * @Default {ej.Grid.FilterBarMode.Immediate}
    */
  var filterBarMode: js.UndefOr[FilterBarMode | String] = js.undefined
  /** This specifies the grid to show the filterBar or filterMenu to the grid records. See filterType
    * @Default {ej.Grid.FilterType.FilterBar}
    */
  var filterType: js.UndefOr[FilterType | String] = js.undefined
  /** Gets or sets a value that indicates whether to define the filtered columns details programmatically at initial load
    * @Default {[]}
    */
  var filteredColumns: js.UndefOr[js.Array[FilterSettingsFilteredColumn]] = js.undefined
  /** This specifies the grid to delay the filter action while typing in the filterBar.
    * @Default {1500}
    */
  var immediateModeDelay: js.UndefOr[Double] = js.undefined
  /** Gets or sets a value that indicates the maximum number of filter choices that can be showed in the excel styled filter menu.
    * @Default {1000}
    */
  var maxFilterChoices: js.UndefOr[Double] = js.undefined
  /** This specifies the grid to show the filter text within the grid pager itself.
    * @Default {true}
    */
  var showFilterBarStatus: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the predicate options in the filtering menu
    * @Default {false}
    */
  var showPredicate: js.UndefOr[Boolean] = js.undefined
}

object FilterSettings {
  @scala.inline
  def apply(
    enableCaseSensitivity: js.UndefOr[Boolean] = js.undefined,
    enableInterDeterminateState: js.UndefOr[Boolean] = js.undefined,
    filterBarMode: FilterBarMode | String = null,
    filterType: FilterType | String = null,
    filteredColumns: js.Array[FilterSettingsFilteredColumn] = null,
    immediateModeDelay: Int | Double = null,
    maxFilterChoices: Int | Double = null,
    showFilterBarStatus: js.UndefOr[Boolean] = js.undefined,
    showPredicate: js.UndefOr[Boolean] = js.undefined
  ): FilterSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableCaseSensitivity)) __obj.updateDynamic("enableCaseSensitivity")(enableCaseSensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(enableInterDeterminateState)) __obj.updateDynamic("enableInterDeterminateState")(enableInterDeterminateState.asInstanceOf[js.Any])
    if (filterBarMode != null) __obj.updateDynamic("filterBarMode")(filterBarMode.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (filteredColumns != null) __obj.updateDynamic("filteredColumns")(filteredColumns.asInstanceOf[js.Any])
    if (immediateModeDelay != null) __obj.updateDynamic("immediateModeDelay")(immediateModeDelay.asInstanceOf[js.Any])
    if (maxFilterChoices != null) __obj.updateDynamic("maxFilterChoices")(maxFilterChoices.asInstanceOf[js.Any])
    if (!js.isUndefined(showFilterBarStatus)) __obj.updateDynamic("showFilterBarStatus")(showFilterBarStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(showPredicate)) __obj.updateDynamic("showPredicate")(showPredicate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSettings]
  }
}

