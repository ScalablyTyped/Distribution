package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortSettingsSortedColumn extends js.Object {
  /** Specifies the sort direction in TreeGrid
    */
  var direction: js.UndefOr[String] = js.undefined
  /** Specifies the field to be sorted in TreeGrid
    */
  var field: js.UndefOr[String] = js.undefined
}

object SortSettingsSortedColumn {
  @scala.inline
  def apply(direction: String = null, field: String = null): SortSettingsSortedColumn = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortSettingsSortedColumn]
  }
}

