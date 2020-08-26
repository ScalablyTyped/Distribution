package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionSettings extends js.Object {
  /** Enables or disables the selection by hierarchy in check box selection
    * @Default {true}
    */
  var enableHierarchySelection: js.UndefOr[Boolean] = js.native
  /** Toggles the visibility of the checkbox in column header, using which all the check boxes can be selected or unselected.
    * @Default {true}
    */
  var enableSelectAll: js.UndefOr[Boolean] = js.native
  /** Specifies the type of selection whether to select row or cell.
    * @Default {ej.TreeGrid.SelectionMode.Row}
    */
  var selectionMode: js.UndefOr[SelectionMode | String] = js.native
  /** Specifies the type of selection whether single, multiple or checkbox.
    * @Default {ej.TreeGrid.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.native
}

object SelectionSettings {
  @scala.inline
  def apply(): SelectionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionSettings]
  }
  @scala.inline
  implicit class SelectionSettingsOps[Self <: SelectionSettings] (val x: Self) extends AnyVal {
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
    def setEnableHierarchySelection(value: Boolean): Self = this.set("enableHierarchySelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHierarchySelection: Self = this.set("enableHierarchySelection", js.undefined)
    @scala.inline
    def setEnableSelectAll(value: Boolean): Self = this.set("enableSelectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSelectAll: Self = this.set("enableSelectAll", js.undefined)
    @scala.inline
    def setSelectionMode(value: SelectionMode | String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setSelectionType(value: SelectionType | String): Self = this.set("selectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionType: Self = this.set("selectionType", js.undefined)
  }
  
}

