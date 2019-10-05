package typings.ejDotWebDotAll.ej.PivotTreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceColumn extends js.Object {
  /** Allows the user to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  /** Applies filter to the field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceColumnsFilterItems] = js.undefined
  /** Allows the user to indicate whether the added item is a named set or not.
    * @Default {false}
    */
  var isNamedSets: js.UndefOr[Boolean] = js.undefined
}

object DataSourceColumn {
  @scala.inline
  def apply(
    fieldName: String = null,
    filterItems: DataSourceColumnsFilterItems = null,
    isNamedSets: js.UndefOr[Boolean] = js.undefined
  ): DataSourceColumn = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (filterItems != null) __obj.updateDynamic("filterItems")(filterItems)
    if (!js.isUndefined(isNamedSets)) __obj.updateDynamic("isNamedSets")(isNamedSets)
    __obj.asInstanceOf[DataSourceColumn]
  }
}

