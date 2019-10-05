package typings.ejDotWebDotAll.ej.Grid

import typings.ejDotWebDotAll.ej.FilterOperators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSettingsFilteredColumn extends js.Object {
  /** Gets or sets a value that indicates whether to define the field name of the column to be filter.
    */
  var field: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates whether to define the matchCase of given value to be filter.
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to define the filter condition to filtered column. See operator
    */
  var operator: js.UndefOr[FilterOperators | String] = js.undefined
  /** Gets or sets a value that indicates whether to define the predicate as and/or.
    */
  var predicate: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates whether to define the value to be filtered in a column.
    */
  var value: js.UndefOr[String | Double] = js.undefined
}

object FilterSettingsFilteredColumn {
  @scala.inline
  def apply(
    field: String = null,
    matchCase: js.UndefOr[Boolean] = js.undefined,
    operator: FilterOperators | String = null,
    predicate: String = null,
    value: String | Double = null
  ): FilterSettingsFilteredColumn = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(predicate)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSettingsFilteredColumn]
  }
}

