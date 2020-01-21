package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceColumnsAdvancedFilter extends js.Object {
  /** Allows you to set the filtering type while performing the advanced filtering.
    */
  var advancedFilterType: js.UndefOr[String] = js.undefined
  /** Allows you to set the operator to perform label filtering.
    * @Default {none}
    */
  var labelFilterOperator: js.UndefOr[String] = js.undefined
  /** In value filtering, this property contains the measure name to which the filter is applied.
    */
  var measure: js.UndefOr[String] = js.undefined
  /** Allows you to provide a level unique name to perform the advanced filtering.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Allows you to set the operator to perform value filtering.
    * @Default {none}
    */
  var valueFilterOperator: js.UndefOr[String] = js.undefined
  /** Allows you to hold the filter operand values in the advanced filtering.
    */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object DataSourceColumnsAdvancedFilter {
  @scala.inline
  def apply(
    advancedFilterType: String = null,
    labelFilterOperator: String = null,
    measure: String = null,
    name: String = null,
    valueFilterOperator: String = null,
    values: js.Array[_] = null
  ): DataSourceColumnsAdvancedFilter = {
    val __obj = js.Dynamic.literal()
    if (advancedFilterType != null) __obj.updateDynamic("advancedFilterType")(advancedFilterType.asInstanceOf[js.Any])
    if (labelFilterOperator != null) __obj.updateDynamic("labelFilterOperator")(labelFilterOperator.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (valueFilterOperator != null) __obj.updateDynamic("valueFilterOperator")(valueFilterOperator.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceColumnsAdvancedFilter]
  }
}

