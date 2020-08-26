package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterSettings extends js.Object {
  /** Gets or sets a value that indicates to perform the filter operation with case sensitive in excel styled filter menu mode.
    * @Default {false}
    */
  var enableCaseSensitivity: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to filter the columns with empty, null and undefined values.
    * @Default {true}
    */
  var enableComplexBlankFilter: js.UndefOr[Boolean] = js.native
  /** Specifies the mode on which column filtering should start
    * @Default {immediate}
    */
  var filterBarMode: js.UndefOr[String] = js.native
  /** Specifies the mode of filtering to filter the record with or without hierarchy.
    * @Default {ej.TreeGrid.FilterHierarchyMode.Parent}
    */
  var filterHierarchyMode: js.UndefOr[FilterHierarchyMode | String] = js.native
  /** Specifies the type of column filtering.
    * @Default {ej.TreeGrid.FilterType.FilterBar}
    */
  var filterType: js.UndefOr[FilterType | String] = js.native
  /** Specifies the column collection for filtering the TreeGrid content on initial load
    * @Default {[]}
    */
  var filteredColumns: js.UndefOr[js.Array[FilterSettingsFilteredColumn]] = js.native
  /** Gets or sets a value that indicates the maximum number of filter choices that can be showed in the excel styled filter menu.
    * @Default {1000}
    */
  var maxFilterChoices: js.UndefOr[Double] = js.native
}

object FilterSettings {
  @scala.inline
  def apply(): FilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSettings]
  }
  @scala.inline
  implicit class FilterSettingsOps[Self <: FilterSettings] (val x: Self) extends AnyVal {
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
    def setEnableCaseSensitivity(value: Boolean): Self = this.set("enableCaseSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCaseSensitivity: Self = this.set("enableCaseSensitivity", js.undefined)
    @scala.inline
    def setEnableComplexBlankFilter(value: Boolean): Self = this.set("enableComplexBlankFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableComplexBlankFilter: Self = this.set("enableComplexBlankFilter", js.undefined)
    @scala.inline
    def setFilterBarMode(value: String): Self = this.set("filterBarMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterBarMode: Self = this.set("filterBarMode", js.undefined)
    @scala.inline
    def setFilterHierarchyMode(value: FilterHierarchyMode | String): Self = this.set("filterHierarchyMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterHierarchyMode: Self = this.set("filterHierarchyMode", js.undefined)
    @scala.inline
    def setFilterType(value: FilterType | String): Self = this.set("filterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    @scala.inline
    def setFilteredColumnsVarargs(value: FilterSettingsFilteredColumn*): Self = this.set("filteredColumns", js.Array(value :_*))
    @scala.inline
    def setFilteredColumns(value: js.Array[FilterSettingsFilteredColumn]): Self = this.set("filteredColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteredColumns: Self = this.set("filteredColumns", js.undefined)
    @scala.inline
    def setMaxFilterChoices(value: Double): Self = this.set("maxFilterChoices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFilterChoices: Self = this.set("maxFilterChoices", js.undefined)
  }
  
}

