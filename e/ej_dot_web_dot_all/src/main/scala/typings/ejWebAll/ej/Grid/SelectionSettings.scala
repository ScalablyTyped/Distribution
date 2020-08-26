package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionSettings extends js.Object {
  /** Gets or sets a value that indicates whether to select multiple rows or cells by performing dragging in Grid.
    * @Default {false}
    */
  var allowDragSelection: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates the cell selection actions based on the cell selection mode.
    * @Default {ej.Grid.CellSelectionMode.Flow}
    */
  var cellSelectionMode: js.UndefOr[CellSelectionMode | String] = js.native
  /** Gets or sets a value that indicates whether to enable the toggle selection behavior for row, cell and column.
    * @Default {false}
    */
  var enableToggle: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to add the default selection actions as a selection mode.See selectionMode
    * @Default {[row]}
    */
  var selectionMode: js.UndefOr[js.Array[_]] = js.native
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
    def setAllowDragSelection(value: Boolean): Self = this.set("allowDragSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDragSelection: Self = this.set("allowDragSelection", js.undefined)
    @scala.inline
    def setCellSelectionMode(value: CellSelectionMode | String): Self = this.set("cellSelectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellSelectionMode: Self = this.set("cellSelectionMode", js.undefined)
    @scala.inline
    def setEnableToggle(value: Boolean): Self = this.set("enableToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableToggle: Self = this.set("enableToggle", js.undefined)
    @scala.inline
    def setSelectionModeVarargs(value: js.Any*): Self = this.set("selectionMode", js.Array(value :_*))
    @scala.inline
    def setSelectionMode(value: js.Array[_]): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
  
}

