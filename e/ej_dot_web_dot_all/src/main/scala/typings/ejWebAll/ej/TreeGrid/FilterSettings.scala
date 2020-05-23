package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSettings extends js.Object {
  /** Gets or sets a value that indicates to perform the filter operation with case sensitive in excel styled filter menu mode.
    * @Default {false}
    */
  var enableCaseSensitivity: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ability to filter the columns with empty, null and undefined values.
    * @Default {true}
    */
  var enableComplexBlankFilter: js.UndefOr[Boolean] = js.undefined
  /** Specifies the mode on which column filtering should start
    * @Default {immediate}
    */
  var filterBarMode: js.UndefOr[String] = js.undefined
  /** Specifies the mode of filtering to filter the record with or without hierarchy.
    * @Default {ej.TreeGrid.FilterHierarchyMode.Parent}
    */
  var filterHierarchyMode: js.UndefOr[FilterHierarchyMode | String] = js.undefined
  /** Specifies the type of column filtering.
    * @Default {ej.TreeGrid.FilterType.FilterBar}
    */
  var filterType: js.UndefOr[FilterType | String] = js.undefined
  /** Specifies the column collection for filtering the TreeGrid content on initial load
    * @Default {[]}
    */
  var filteredColumns: js.UndefOr[js.Array[FilterSettingsFilteredColumn]] = js.undefined
  /** Gets or sets a value that indicates the maximum number of filter choices that can be showed in the excel styled filter menu.
    * @Default {1000}
    */
  var maxFilterChoices: js.UndefOr[Double] = js.undefined
}

object FilterSettings {
  @scala.inline
  def apply(
    enableCaseSensitivity: js.UndefOr[Boolean] = js.undefined,
    enableComplexBlankFilter: js.UndefOr[Boolean] = js.undefined,
    filterBarMode: String = null,
    filterHierarchyMode: FilterHierarchyMode | String = null,
    filterType: FilterType | String = null,
    filteredColumns: js.Array[FilterSettingsFilteredColumn] = null,
    maxFilterChoices: js.UndefOr[Double] = js.undefined
  ): FilterSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableCaseSensitivity)) __obj.updateDynamic("enableCaseSensitivity")(enableCaseSensitivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableComplexBlankFilter)) __obj.updateDynamic("enableComplexBlankFilter")(enableComplexBlankFilter.get.asInstanceOf[js.Any])
    if (filterBarMode != null) __obj.updateDynamic("filterBarMode")(filterBarMode.asInstanceOf[js.Any])
    if (filterHierarchyMode != null) __obj.updateDynamic("filterHierarchyMode")(filterHierarchyMode.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (filteredColumns != null) __obj.updateDynamic("filteredColumns")(filteredColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFilterChoices)) __obj.updateDynamic("maxFilterChoices")(maxFilterChoices.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSettings]
  }
}

