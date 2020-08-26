package typings.ejWebAll.ej.PivotGrid

import typings.ejWebAll.ej.PivotAnalysis.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueSortSettings extends js.Object {
  /** Allows you to set the string for separating column headers provided in the headerText property.
    */
  var headerDelimiters: js.UndefOr[String] = js.native
  /** Contains the header of the specific column to which value sorting is applied.
    */
  var headerText: js.UndefOr[String] = js.native
  /** Allows you to set the sorting order of values of the field.
    * @Default {ej.PivotAnalysis.SortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[SortOrder | String] = js.native
}

object ValueSortSettings {
  @scala.inline
  def apply(): ValueSortSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueSortSettings]
  }
  @scala.inline
  implicit class ValueSortSettingsOps[Self <: ValueSortSettings] (val x: Self) extends AnyVal {
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
    def setHeaderDelimiters(value: String): Self = this.set("headerDelimiters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderDelimiters: Self = this.set("headerDelimiters", js.undefined)
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder | String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
  
}

