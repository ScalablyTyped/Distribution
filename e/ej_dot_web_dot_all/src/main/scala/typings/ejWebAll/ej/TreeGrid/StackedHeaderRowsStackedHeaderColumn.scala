package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackedHeaderRowsStackedHeaderColumn extends js.Object {
  /** Gets or sets a value that indicates the header text for the particular stacked header column.
    * @Default {null}
    */
  var column: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates class to the corresponding stackedHeaderColumn.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates the header text for the particular stacked header column.
    * @Default {null}
    */
  var headerText: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates the text alignment of the corresponding headerText.
    * @Default {ej.TextAlign.Left}
    */
  var textAlign: js.UndefOr[String] = js.native
  /** Sets the template for tooltip for the Grid stackedHeaderColumns.
    * @Default {null}
    */
  var tooltip: js.UndefOr[String] = js.native
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
    def setColumn(value: js.Any): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

