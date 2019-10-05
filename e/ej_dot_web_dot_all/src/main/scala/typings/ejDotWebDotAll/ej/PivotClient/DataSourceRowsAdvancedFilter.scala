package typings.ejDotWebDotAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceRowsAdvancedFilter extends js.Object {
  /** Allows you to set the filtering type while performing the advanced filtering.
    */
  var advancedFilterType: js.UndefOr[String] = js.undefined
  /** Allows you to set the operator to perform the label filtering.
    * @Default {none}
    */
  var labelFilterOperator: js.UndefOr[String] = js.undefined
  /** In value filtering, this property contains the measure name to which the filter is applied.
    */
  var measure: js.UndefOr[String] = js.undefined
  /** Allows you to provide a level unique name to perform the advanced filtering.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Allows you to set the operator to perform the value filtering.
    * @Default {none}
    */
  var valueFilterOperator: js.UndefOr[String] = js.undefined
  /** Allows you to hold the filter operand values in the advanced filtering.
    */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object DataSourceRowsAdvancedFilter {
  @scala.inline
  def apply(
    advancedFilterType: String = null,
    labelFilterOperator: String = null,
    measure: String = null,
    name: String = null,
    valueFilterOperator: String = null,
    values: js.Array[_] = null
  ): DataSourceRowsAdvancedFilter = {
    val __obj = js.Dynamic.literal()
    if (advancedFilterType != null) __obj.updateDynamic("advancedFilterType")(advancedFilterType)
    if (labelFilterOperator != null) __obj.updateDynamic("labelFilterOperator")(labelFilterOperator)
    if (measure != null) __obj.updateDynamic("measure")(measure)
    if (name != null) __obj.updateDynamic("name")(name)
    if (valueFilterOperator != null) __obj.updateDynamic("valueFilterOperator")(valueFilterOperator)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DataSourceRowsAdvancedFilter]
  }
}

