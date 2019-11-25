package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackedHeaderRow extends js.Object {
  /** Gets or sets a value that indicates whether to add stacked header columns into the stacked header rows
    * @Default {[]}
    */
  var stackedHeaderColumns: js.UndefOr[js.Array[StackedHeaderRowsStackedHeaderColumn]] = js.undefined
}

object StackedHeaderRow {
  @scala.inline
  def apply(stackedHeaderColumns: js.Array[StackedHeaderRowsStackedHeaderColumn] = null): StackedHeaderRow = {
    val __obj = js.Dynamic.literal()
    if (stackedHeaderColumns != null) __obj.updateDynamic("stackedHeaderColumns")(stackedHeaderColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedHeaderRow]
  }
}

