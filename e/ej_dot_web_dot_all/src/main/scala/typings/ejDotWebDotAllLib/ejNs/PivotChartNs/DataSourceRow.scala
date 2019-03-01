package typings
package ejDotWebDotAllLib.ejNs.PivotChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceRow extends js.Object {
  /** Allows you to set the display caption for the item.
    */
  var fieldCaption: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /** Applies filter to field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceRowsFilterItems] = js.undefined
  /** Allows you to indicate whether the added item is a named set or not.
    * @Default {false}
    */
  var isNamedSets: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to set the sorting order of field members.
    * @Default {ej.PivotAnalysis.SortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SortOrder | java.lang.String] = js.undefined
}

object DataSourceRow {
  @scala.inline
  def apply(
    fieldCaption: java.lang.String = null,
    fieldName: java.lang.String = null,
    filterItems: DataSourceRowsFilterItems = null,
    isNamedSets: js.UndefOr[scala.Boolean] = js.undefined,
    sortOrder: ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SortOrder | java.lang.String = null
  ): DataSourceRow = {
    val __obj = js.Dynamic.literal()
    if (fieldCaption != null) __obj.updateDynamic("fieldCaption")(fieldCaption)
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (filterItems != null) __obj.updateDynamic("filterItems")(filterItems)
    if (!js.isUndefined(isNamedSets)) __obj.updateDynamic("isNamedSets")(isNamedSets)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceRow]
  }
}

