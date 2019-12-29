package typings.ejDotWebDotAll.ej.PivotClient

import typings.ejDotWebDotAll.ej.PivotAnalysis.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceRow extends js.Object {
  /** Allows you to filter the report by using the advanced filtering (e.g., Microsoft Excel) option for the OLAP data source in the client-mode.
    * @Default {[]}
    */
  var advancedFilter: js.UndefOr[js.Array[DataSourceRowsAdvancedFilter]] = js.undefined
  /** Allows to set the custom theme for row headers.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Contains the list of members need to be drilled down by default in the field.
    * @Default {[]}
    */
  var drilledItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Allows you to set the display caption for an item.
    */
  var fieldCaption: js.UndefOr[String] = js.undefined
  /** Allows you to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  /** Applies the filter to the field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceRowsFilterItems] = js.undefined
  /** Allows to set the format for row headers.
    */
  var format: js.UndefOr[String] = js.undefined
  /** This property is set to display the formatted values with format types in the pivot grid.
    */
  var formatString: js.UndefOr[String] = js.undefined
  /** Allows you to indicate whether the added item is a named set or not.
    * @Default {false}
    */
  var isNamedSets: js.UndefOr[Boolean] = js.undefined
  /** Shows/hides the sub-total of the field.
    * @Default {true}
    */
  var showSubTotal: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the sorting order for the field members.
    * @Default {ej.PivotAnalysis.SortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[SortOrder | String] = js.undefined
}

object DataSourceRow {
  @scala.inline
  def apply(
    advancedFilter: js.Array[DataSourceRowsAdvancedFilter] = null,
    cssClass: String = null,
    drilledItems: js.Array[_] = null,
    fieldCaption: String = null,
    fieldName: String = null,
    filterItems: DataSourceRowsFilterItems = null,
    format: String = null,
    formatString: String = null,
    isNamedSets: js.UndefOr[Boolean] = js.undefined,
    showSubTotal: js.UndefOr[Boolean] = js.undefined,
    sortOrder: SortOrder | String = null
  ): DataSourceRow = {
    val __obj = js.Dynamic.literal()
    if (advancedFilter != null) __obj.updateDynamic("advancedFilter")(advancedFilter.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (drilledItems != null) __obj.updateDynamic("drilledItems")(drilledItems.asInstanceOf[js.Any])
    if (fieldCaption != null) __obj.updateDynamic("fieldCaption")(fieldCaption.asInstanceOf[js.Any])
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (filterItems != null) __obj.updateDynamic("filterItems")(filterItems.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatString != null) __obj.updateDynamic("formatString")(formatString.asInstanceOf[js.Any])
    if (!js.isUndefined(isNamedSets)) __obj.updateDynamic("isNamedSets")(isNamedSets.asInstanceOf[js.Any])
    if (!js.isUndefined(showSubTotal)) __obj.updateDynamic("showSubTotal")(showSubTotal.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceRow]
  }
}

