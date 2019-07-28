package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortSettingsSortedColumn extends js.Object {
  /** Gets or sets a value that indicates whether to define the direction to sort the column.
    */
  var direction: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates whether to define the field name of the column to be sort
    */
  var field: js.UndefOr[String] = js.undefined
}

object SortSettingsSortedColumn {
  @scala.inline
  def apply(direction: String = null, field: String = null): SortSettingsSortedColumn = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[SortSettingsSortedColumn]
  }
}

