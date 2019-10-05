package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionSettings extends js.Object {
  /** Gets or sets a value that indicates whether to select multiple rows or cells by performing dragging in Grid.
    * @Default {false}
    */
  var allowDragSelection: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates the cell selection actions based on the cell selection mode.
    * @Default {ej.Grid.CellSelectionMode.Flow}
    */
  var cellSelectionMode: js.UndefOr[CellSelectionMode | String] = js.undefined
  /** Gets or sets a value that indicates whether to enable the toggle selection behavior for row, cell and column.
    * @Default {false}
    */
  var enableToggle: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to add the default selection actions as a selection mode.See selectionMode
    * @Default {[row]}
    */
  var selectionMode: js.UndefOr[js.Array[_]] = js.undefined
}

object SelectionSettings {
  @scala.inline
  def apply(
    allowDragSelection: js.UndefOr[Boolean] = js.undefined,
    cellSelectionMode: CellSelectionMode | String = null,
    enableToggle: js.UndefOr[Boolean] = js.undefined,
    selectionMode: js.Array[_] = null
  ): SelectionSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDragSelection)) __obj.updateDynamic("allowDragSelection")(allowDragSelection)
    if (cellSelectionMode != null) __obj.updateDynamic("cellSelectionMode")(cellSelectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(enableToggle)) __obj.updateDynamic("enableToggle")(enableToggle)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    __obj.asInstanceOf[SelectionSettings]
  }
}

