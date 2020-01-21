package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceFilter extends js.Object {
  /** Allows you to set the display name for an item.
    */
  var fieldCaption: js.UndefOr[String] = js.undefined
  /** Allows you to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  /** Applies filter to the field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceFiltersFilterItems] = js.undefined
}

object DataSourceFilter {
  @scala.inline
  def apply(
    fieldCaption: String = null,
    fieldName: String = null,
    filterItems: DataSourceFiltersFilterItems = null
  ): DataSourceFilter = {
    val __obj = js.Dynamic.literal()
    if (fieldCaption != null) __obj.updateDynamic("fieldCaption")(fieldCaption.asInstanceOf[js.Any])
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (filterItems != null) __obj.updateDynamic("filterItems")(filterItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceFilter]
  }
}

