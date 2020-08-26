package typings.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridSettings extends js.Object {
  /** Allows to Resize the width of the columns by simply click and move the particular column header line.
    * @Default {true}
    */
  var allowResizing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the dynamic sorting behavior on grid data. Sorting can be done through clicking on particular column header.
    * @Default {true}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Gets or sets an object that indicates to render the grid with specified columns. You can use this property same as the column property in Grid control.
    * @Default {[{ field: name, headerText: Name, width: 30% }, { field: dateModified, headerText: Date Modified, width: 30% }, { field: type, headerText: Type, width: 15% }, { field:
    * size, headerText: Size, width: 12%, textAlign: right, headerTextAlign: left }]}
    */
  var columns: js.UndefOr[js.Array[_]] = js.native
}

object GridSettings {
  @scala.inline
  def apply(): GridSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridSettings]
  }
  @scala.inline
  implicit class GridSettingsOps[Self <: GridSettings] (val x: Self) extends AnyVal {
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
    def setAllowResizing(value: Boolean): Self = this.set("allowResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowResizing: Self = this.set("allowResizing", js.undefined)
    @scala.inline
    def setAllowSorting(value: Boolean): Self = this.set("allowSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSorting: Self = this.set("allowSorting", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: js.Any*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[_]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
  }
  
}

