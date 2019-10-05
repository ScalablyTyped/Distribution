package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionSettings extends js.Object {
  /** Enables or disables the selection by hierarchy in check box selection
    * @Default {true}
    */
  var enableHierarchySelection: js.UndefOr[Boolean] = js.undefined
  /** Toggles the visibility of the checkbox in column header, using which all the check boxes can be selected or unselected.
    * @Default {true}
    */
  var enableSelectAll: js.UndefOr[Boolean] = js.undefined
  /** Specifies the type of selection whether to select row or cell.
    * @Default {ej.TreeGrid.SelectionMode.Row}
    */
  var selectionMode: js.UndefOr[SelectionMode | String] = js.undefined
  /** Specifies the type of selection whether single, multiple or checkbox.
    * @Default {ej.TreeGrid.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.undefined
}

object SelectionSettings {
  @scala.inline
  def apply(
    enableHierarchySelection: js.UndefOr[Boolean] = js.undefined,
    enableSelectAll: js.UndefOr[Boolean] = js.undefined,
    selectionMode: SelectionMode | String = null,
    selectionType: SelectionType | String = null
  ): SelectionSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableHierarchySelection)) __obj.updateDynamic("enableHierarchySelection")(enableHierarchySelection)
    if (!js.isUndefined(enableSelectAll)) __obj.updateDynamic("enableSelectAll")(enableSelectAll)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionSettings]
  }
}

