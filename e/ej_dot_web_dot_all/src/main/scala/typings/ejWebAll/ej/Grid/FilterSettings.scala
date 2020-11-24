package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterSettings extends js.Object {
  
  /** Gets or sets a value that indicates to perform the filter operation with case sensitive in excel styled filter menu mode
    * @Default {false}
    */
  var enableCaseSensitivity: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates to define the interDeterminateState of checkbox in excel filter dialog.
    * @Default {true}
    */
  var enableInterDeterminateState: js.UndefOr[Boolean] = js.native
  
  /** This specifies the grid to starts the filter action while typing in the filterBar or after pressing the enter key. based on the filterBarMode. See filterBarMode.
    * @Default {ej.Grid.FilterBarMode.Immediate}
    */
  var filterBarMode: js.UndefOr[FilterBarMode | String] = js.native
  
  /** This specifies the grid to show the filterBar or filterMenu to the grid records. See filterType
    * @Default {ej.Grid.FilterType.FilterBar}
    */
  var filterType: js.UndefOr[FilterType | String] = js.native
  
  /** Gets or sets a value that indicates whether to define the filtered columns details programmatically at initial load
    * @Default {[]}
    */
  var filteredColumns: js.UndefOr[js.Array[FilterSettingsFilteredColumn]] = js.native
  
  /** This specifies the grid to delay the filter action while typing in the filterBar.
    * @Default {1500}
    */
  var immediateModeDelay: js.UndefOr[Double] = js.native
  
  /** Gets or sets a value that indicates the maximum number of filter choices that can be showed in the excel styled filter menu.
    * @Default {1000}
    */
  var maxFilterChoices: js.UndefOr[Double] = js.native
  
  /** This specifies the grid to show the filter text within the grid pager itself.
    * @Default {true}
    */
  var showFilterBarStatus: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable the predicate options in the filtering menu
    * @Default {false}
    */
  var showPredicate: js.UndefOr[Boolean] = js.native
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
    def setEnableInterDeterminateState(value: Boolean): Self = this.set("enableInterDeterminateState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableInterDeterminateState: Self = this.set("enableInterDeterminateState", js.undefined)
    
    @scala.inline
    def setFilterBarMode(value: FilterBarMode | String): Self = this.set("filterBarMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterBarMode: Self = this.set("filterBarMode", js.undefined)
    
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
    def setImmediateModeDelay(value: Double): Self = this.set("immediateModeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmediateModeDelay: Self = this.set("immediateModeDelay", js.undefined)
    
    @scala.inline
    def setMaxFilterChoices(value: Double): Self = this.set("maxFilterChoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFilterChoices: Self = this.set("maxFilterChoices", js.undefined)
    
    @scala.inline
    def setShowFilterBarStatus(value: Boolean): Self = this.set("showFilterBarStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFilterBarStatus: Self = this.set("showFilterBarStatus", js.undefined)
    
    @scala.inline
    def setShowPredicate(value: Boolean): Self = this.set("showPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPredicate: Self = this.set("showPredicate", js.undefined)
  }
}
