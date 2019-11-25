package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortSettings extends js.Object {
  /** Gets or sets a value that indicates whether to define the direction and field to sort the column.
    */
  var sortedColumns: js.UndefOr[js.Array[SortSettingsSortedColumn]] = js.undefined
}

object SortSettings {
  @scala.inline
  def apply(sortedColumns: js.Array[SortSettingsSortedColumn] = null): SortSettings = {
    val __obj = js.Dynamic.literal()
    if (sortedColumns != null) __obj.updateDynamic("sortedColumns")(sortedColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortSettings]
  }
}

