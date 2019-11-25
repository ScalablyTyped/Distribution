package typings.ejDotWebDotAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortSettings extends js.Object {
  /** Specifies the sorted columns for Gantt
    * @Default {[]}
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

