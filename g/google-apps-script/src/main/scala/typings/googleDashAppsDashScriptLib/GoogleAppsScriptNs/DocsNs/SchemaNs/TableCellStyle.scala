package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellStyle extends js.Object {
  var backgroundColor: js.UndefOr[OptionalColor] = js.undefined
  var borderBottom: js.UndefOr[TableCellBorder] = js.undefined
  var borderLeft: js.UndefOr[TableCellBorder] = js.undefined
  var borderRight: js.UndefOr[TableCellBorder] = js.undefined
  var borderTop: js.UndefOr[TableCellBorder] = js.undefined
  var columnSpan: js.UndefOr[scala.Double] = js.undefined
  var contentAlignment: js.UndefOr[java.lang.String] = js.undefined
  var paddingBottom: js.UndefOr[Dimension] = js.undefined
  var paddingLeft: js.UndefOr[Dimension] = js.undefined
  var paddingRight: js.UndefOr[Dimension] = js.undefined
  var paddingTop: js.UndefOr[Dimension] = js.undefined
  var rowSpan: js.UndefOr[scala.Double] = js.undefined
}

object TableCellStyle {
  @scala.inline
  def apply(
    backgroundColor: OptionalColor = null,
    borderBottom: TableCellBorder = null,
    borderLeft: TableCellBorder = null,
    borderRight: TableCellBorder = null,
    borderTop: TableCellBorder = null,
    columnSpan: scala.Int | scala.Double = null,
    contentAlignment: java.lang.String = null,
    paddingBottom: Dimension = null,
    paddingLeft: Dimension = null,
    paddingRight: Dimension = null,
    paddingTop: Dimension = null,
    rowSpan: scala.Int | scala.Double = null
  ): TableCellStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom)
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft)
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight)
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop)
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (contentAlignment != null) __obj.updateDynamic("contentAlignment")(contentAlignment)
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom)
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft)
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight)
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop)
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellStyle]
  }
}

