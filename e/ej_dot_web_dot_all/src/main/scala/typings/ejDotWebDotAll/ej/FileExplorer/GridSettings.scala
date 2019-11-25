package typings.ejDotWebDotAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSettings extends js.Object {
  /** Allows to Resize the width of the columns by simply click and move the particular column header line.
    * @Default {true}
    */
  var allowResizing: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the dynamic sorting behavior on grid data. Sorting can be done through clicking on particular column header.
    * @Default {true}
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets an object that indicates to render the grid with specified columns. You can use this property same as the column property in Grid control.
    * @Default {[{ field: name, headerText: Name, width: 30% }, { field: dateModified, headerText: Date Modified, width: 30% }, { field: type, headerText: Type, width: 15% }, { field:
    * size, headerText: Size, width: 12%, textAlign: right, headerTextAlign: left }]}
    */
  var columns: js.UndefOr[js.Array[_]] = js.undefined
}

object GridSettings {
  @scala.inline
  def apply(
    allowResizing: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    columns: js.Array[_] = null
  ): GridSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridSettings]
  }
}

