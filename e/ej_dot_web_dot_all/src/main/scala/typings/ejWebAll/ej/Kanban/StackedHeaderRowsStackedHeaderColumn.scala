package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackedHeaderRowsStackedHeaderColumn extends js.Object {
  /** Gets or sets a value that indicates the column for the particular stacked header column.
    * @Default {null}
    */
  var column: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates the headerText for the particular stacked header column.
    * @Default {null}
    */
  var headerText: js.UndefOr[String] = js.native
}

object StackedHeaderRowsStackedHeaderColumn {
  @scala.inline
  def apply(): StackedHeaderRowsStackedHeaderColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackedHeaderRowsStackedHeaderColumn]
  }
  @scala.inline
  implicit class StackedHeaderRowsStackedHeaderColumnOps[Self <: StackedHeaderRowsStackedHeaderColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
  }
  
}

