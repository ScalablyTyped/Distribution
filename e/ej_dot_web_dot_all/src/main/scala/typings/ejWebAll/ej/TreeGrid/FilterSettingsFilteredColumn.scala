package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSettingsFilteredColumn extends js.Object {
  /** Specifies the field where filtering has to be performed.
    */
  var field: js.UndefOr[String] = js.undefined
  /** Specifies the filter condition to filtered column. See operator
    */
  var operator: js.UndefOr[String] = js.undefined
  /** Specifies the predicate(and/or) value to perform filtering.
    */
  var predicate: js.UndefOr[String] = js.undefined
  /** Specifies the value to be filtered in TreeGrid.
    */
  var value: js.UndefOr[String] = js.undefined
}

object FilterSettingsFilteredColumn {
  @scala.inline
  def apply(field: String = null, operator: String = null, predicate: String = null, value: String = null): FilterSettingsFilteredColumn = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(predicate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSettingsFilteredColumn]
  }
}

