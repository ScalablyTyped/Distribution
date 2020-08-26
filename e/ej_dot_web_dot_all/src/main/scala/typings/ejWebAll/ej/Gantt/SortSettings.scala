package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortSettings extends js.Object {
  /** Specifies the sorted columns for Gantt
    * @Default {[]}
    */
  var sortedColumns: js.UndefOr[js.Array[SortSettingsSortedColumn]] = js.native
}

object SortSettings {
  @scala.inline
  def apply(): SortSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortSettings]
  }
  @scala.inline
  implicit class SortSettingsOps[Self <: SortSettings] (val x: Self) extends AnyVal {
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
    def setSortedColumnsVarargs(value: SortSettingsSortedColumn*): Self = this.set("sortedColumns", js.Array(value :_*))
    @scala.inline
    def setSortedColumns(value: js.Array[SortSettingsSortedColumn]): Self = this.set("sortedColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortedColumns: Self = this.set("sortedColumns", js.undefined)
  }
  
}

