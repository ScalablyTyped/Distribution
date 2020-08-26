package typings.ejWebAll.ej.Grid

import typings.ejWebAll.ej.FilterOperators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterSettingsFilteredColumn extends js.Object {
  /** Gets or sets a value that indicates whether to define the field name of the column to be filter.
    */
  var field: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to define the matchCase of given value to be filter.
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to define the filter condition to filtered column. See operator
    */
  var operator: js.UndefOr[FilterOperators | String] = js.native
  /** Gets or sets a value that indicates whether to define the predicate as and/or.
    */
  var predicate: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to define the value to be filtered in a column.
    */
  var value: js.UndefOr[String | Double] = js.native
}

object FilterSettingsFilteredColumn {
  @scala.inline
  def apply(): FilterSettingsFilteredColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSettingsFilteredColumn]
  }
  @scala.inline
  implicit class FilterSettingsFilteredColumnOps[Self <: FilterSettingsFilteredColumn] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setMatchCase(value: Boolean): Self = this.set("matchCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchCase: Self = this.set("matchCase", js.undefined)
    @scala.inline
    def setOperator(value: FilterOperators | String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setPredicate(value: String): Self = this.set("predicate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredicate: Self = this.set("predicate", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

