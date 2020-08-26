package typings.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceFilter extends js.Object {
  /** Allows you to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[String] = js.native
  /** Applies filter to field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceFiltersFilterItems] = js.native
}

object DataSourceFilter {
  @scala.inline
  def apply(): DataSourceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceFilter]
  }
  @scala.inline
  implicit class DataSourceFilterOps[Self <: DataSourceFilter] (val x: Self) extends AnyVal {
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    @scala.inline
    def setFilterItems(value: DataSourceFiltersFilterItems): Self = this.set("filterItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterItems: Self = this.set("filterItems", js.undefined)
  }
  
}

