package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortSettingsSortedColumn extends js.Object {
  /** Specifies the sort direction in Gantt
    */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the field to be sorted in Gantt
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

