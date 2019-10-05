package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackedHeaderRowsStackedHeaderColumn extends js.Object {
  /** Gets or sets a value that indicates the header text for the particular stacked header column.
    * @Default {null}
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates class to the corresponding stackedHeaderColumn.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates the header text for the particular stacked header column.
    * @Default {null}
    */
  var headerText: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates the text alignment of the corresponding headerText.
    * @Default {ej.TextAlign.Left}
    */
  var textAlign: js.UndefOr[String] = js.undefined
  /** Sets the template for tooltip for the Grid stackedHeaderColumns.
    * @Default {null}
    */
  var tooltip: js.UndefOr[String] = js.undefined
}

object StackedHeaderRowsStackedHeaderColumn {
  @scala.inline
  def apply(
    column: js.Any = null,
    cssClass: String = null,
    headerText: String = null,
    textAlign: String = null,
    tooltip: String = null
  ): StackedHeaderRowsStackedHeaderColumn = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (headerText != null) __obj.updateDynamic("headerText")(headerText)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[StackedHeaderRowsStackedHeaderColumn]
  }
}

