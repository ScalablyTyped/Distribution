package typings.ejWebAll.ej.PivotGrid

import typings.ejWebAll.ej.PivotAnalysis.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceRow extends js.Object {
  /** Allows you to filter the report by using the advanced filtering (e.g., Microsoft Excel) option for the OLAP data source in client-mode.
    * @Default {[]}
    */
  var advancedFilter: js.UndefOr[js.Array[DataSourceRowsAdvancedFilter]] = js.native
  /** Allows you to set the custom theme for row headers.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Allows you to set the delimiter for date type format in the formatString. This is applicable for the groupByDate in row/column headers.
    */
  var delimiter: js.UndefOr[String] = js.native
  /** Contains the list of members need to be drilled down by default in the field.
    * @Default {[]}
    */
  var drilledItems: js.UndefOr[js.Array[_]] = js.native
  /** Allows you to set the display caption for the item.
    */
  var fieldCaption: js.UndefOr[String] = js.native
  /** Allows you to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[String] = js.native
  /** Applies the filter to field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceRowsFilterItems] = js.native
  /** Allows you to set the format for row headers.
    */
  var format: js.UndefOr[String] = js.native
  /** This property is set to display the formatted values with format types in the PivotGrid.
    */
  var formatString: js.UndefOr[String] = js.native
  /** Allows you to indicate whether the added item is a named set or not.
    * @Default {false}
    */
  var isNamedSets: js.UndefOr[Boolean] = js.native
  /** Shows/hides the sub-total of the field.
    * @Default {true}
    */
  var showSubTotal: js.UndefOr[Boolean] = js.native
  /** Allows you to set the sorting order of members of the field.
    * @Default {ej.PivotAnalysis.SortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[SortOrder | String] = js.native
}

object DataSourceRow {
  @scala.inline
  def apply(): DataSourceRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRow]
  }
  @scala.inline
  implicit class DataSourceRowOps[Self <: DataSourceRow] (val x: Self) extends AnyVal {
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
    def setAdvancedFilterVarargs(value: DataSourceRowsAdvancedFilter*): Self = this.set("advancedFilter", js.Array(value :_*))
    @scala.inline
    def setAdvancedFilter(value: js.Array[DataSourceRowsAdvancedFilter]): Self = this.set("advancedFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedFilter: Self = this.set("advancedFilter", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setDrilledItemsVarargs(value: js.Any*): Self = this.set("drilledItems", js.Array(value :_*))
    @scala.inline
    def setDrilledItems(value: js.Array[_]): Self = this.set("drilledItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrilledItems: Self = this.set("drilledItems", js.undefined)
    @scala.inline
    def setFieldCaption(value: String): Self = this.set("fieldCaption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldCaption: Self = this.set("fieldCaption", js.undefined)
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    @scala.inline
    def setFilterItems(value: DataSourceRowsFilterItems): Self = this.set("filterItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterItems: Self = this.set("filterItems", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFormatString(value: String): Self = this.set("formatString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatString: Self = this.set("formatString", js.undefined)
    @scala.inline
    def setIsNamedSets(value: Boolean): Self = this.set("isNamedSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNamedSets: Self = this.set("isNamedSets", js.undefined)
    @scala.inline
    def setShowSubTotal(value: Boolean): Self = this.set("showSubTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSubTotal: Self = this.set("showSubTotal", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder | String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
  
}

