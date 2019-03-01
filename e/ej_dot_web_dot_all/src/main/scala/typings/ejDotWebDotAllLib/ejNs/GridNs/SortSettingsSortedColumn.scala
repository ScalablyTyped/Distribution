package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortSettingsSortedColumn extends js.Object {
  /** Gets or sets a value that indicates whether to define the direction to sort the column.
    */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to define the field name of the column to be sort
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
}

object SortSettingsSortedColumn {
  @scala.inline
  def apply(direction: java.lang.String = null, field: java.lang.String = null): SortSettingsSortedColumn = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[SortSettingsSortedColumn]
  }
}

