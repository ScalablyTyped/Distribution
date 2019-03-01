package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceFilter extends js.Object {
  /** Allows you to set the display name for an item.
    */
  var fieldCaption: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /** Applies filter to the field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceFiltersFilterItems] = js.undefined
}

object DataSourceFilter {
  @scala.inline
  def apply(
    fieldCaption: java.lang.String = null,
    fieldName: java.lang.String = null,
    filterItems: DataSourceFiltersFilterItems = null
  ): DataSourceFilter = {
    val __obj = js.Dynamic.literal()
    if (fieldCaption != null) __obj.updateDynamic("fieldCaption")(fieldCaption)
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (filterItems != null) __obj.updateDynamic("filterItems")(filterItems)
    __obj.asInstanceOf[DataSourceFilter]
  }
}

