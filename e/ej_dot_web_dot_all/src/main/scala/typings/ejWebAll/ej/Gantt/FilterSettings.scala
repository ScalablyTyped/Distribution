package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterSettings extends js.Object {
  /** Specifies the column collection for filtering the Gantt content on initial load
    * @Default {[]}
    */
  var filteredColumns: js.UndefOr[js.Array[FilterSettingsFilteredColumn]] = js.native
}

object FilterSettings {
  @scala.inline
  def apply(): FilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSettings]
  }
  @scala.inline
  implicit class FilterSettingsOps[Self <: FilterSettings] (val x: Self) extends AnyVal {
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
    def setFilteredColumnsVarargs(value: FilterSettingsFilteredColumn*): Self = this.set("filteredColumns", js.Array(value :_*))
    @scala.inline
    def setFilteredColumns(value: js.Array[FilterSettingsFilteredColumn]): Self = this.set("filteredColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteredColumns: Self = this.set("filteredColumns", js.undefined)
  }
  
}

