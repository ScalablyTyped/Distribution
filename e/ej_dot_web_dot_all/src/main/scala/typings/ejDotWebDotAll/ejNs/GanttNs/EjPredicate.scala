package typings.ejDotWebDotAll.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EjPredicate extends js.Object {
  /** Pass the field name of the column.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  /** string/integer/date operator.
    */
  var filterOperator: js.UndefOr[String] = js.undefined
  /** Pass the value to be filtered in a column.
    */
  var filterValue: js.UndefOr[String] = js.undefined
  /** Optional - pass the ignore case value as true/false.
    */
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
}

object EjPredicate {
  @scala.inline
  def apply(
    fieldName: String = null,
    filterOperator: String = null,
    filterValue: String = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined
  ): EjPredicate = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (filterOperator != null) __obj.updateDynamic("filterOperator")(filterOperator)
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue)
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    __obj.asInstanceOf[EjPredicate]
  }
}

