package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackedHeaderRowsStackedHeaderColumn extends js.Object {
  /** Gets or sets a value that indicates the column for the particular stacked header column.
    * @Default {null}
    */
  var column: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates the headerText for the particular stacked header column.
    * @Default {null}
    */
  var headerText: js.UndefOr[java.lang.String] = js.undefined
}

object StackedHeaderRowsStackedHeaderColumn {
  @scala.inline
  def apply(column: java.lang.String = null, headerText: java.lang.String = null): StackedHeaderRowsStackedHeaderColumn = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (headerText != null) __obj.updateDynamic("headerText")(headerText)
    __obj.asInstanceOf[StackedHeaderRowsStackedHeaderColumn]
  }
}

