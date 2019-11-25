package typings.ejDotWebDotAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackedHeaderRowsStackedHeaderColumn extends js.Object {
  /** Gets or sets a value that indicates the column for the particular stacked header column.
    * @Default {null}
    */
  var column: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates the headerText for the particular stacked header column.
    * @Default {null}
    */
  var headerText: js.UndefOr[String] = js.undefined
}

object StackedHeaderRowsStackedHeaderColumn {
  @scala.inline
  def apply(column: String = null, headerText: String = null): StackedHeaderRowsStackedHeaderColumn = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedHeaderRowsStackedHeaderColumn]
  }
}

