package typings
package ejDotWebDotAllLib.ejNs.GridNs

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
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates the header text for the particular stacked header column.
    * @Default {null}
    */
  var headerText: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates the text alignment of the corresponding headerText.
    * @Default {ej.TextAlign.Left}
    */
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the template for tooltip for the Grid stackedHeaderColumns.
    * @Default {null}
    */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object StackedHeaderRowsStackedHeaderColumn {
  @scala.inline
  def apply(
    column: js.Any = null,
    cssClass: java.lang.String = null,
    headerText: java.lang.String = null,
    textAlign: java.lang.String = null,
    tooltip: java.lang.String = null
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

