package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionSettings extends js.Object {
  /** Gets or sets a value that indicates whether to select multiple rows or cells by performing dragging in Grid.
    * @Default {false}
    */
  var allowDragSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates the cell selection actions based on the cell selection mode.
    * @Default {ej.Grid.CellSelectionMode.Flow}
    */
  var cellSelectionMode: js.UndefOr[CellSelectionMode | java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to enable the toggle selection behavior for row, cell and column.
    * @Default {false}
    */
  var enableToggle: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to add the default selection actions as a selection mode.See selectionMode
    * @Default {[row]}
    */
  var selectionMode: js.UndefOr[js.Array[_]] = js.undefined
}

