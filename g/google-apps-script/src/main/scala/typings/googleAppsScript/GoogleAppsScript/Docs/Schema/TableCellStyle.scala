package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellStyle extends js.Object {
  var backgroundColor: js.UndefOr[OptionalColor] = js.undefined
  var borderBottom: js.UndefOr[TableCellBorder] = js.undefined
  var borderLeft: js.UndefOr[TableCellBorder] = js.undefined
  var borderRight: js.UndefOr[TableCellBorder] = js.undefined
  var borderTop: js.UndefOr[TableCellBorder] = js.undefined
  var columnSpan: js.UndefOr[Double] = js.undefined
  var contentAlignment: js.UndefOr[String] = js.undefined
  var paddingBottom: js.UndefOr[Dimension] = js.undefined
  var paddingLeft: js.UndefOr[Dimension] = js.undefined
  var paddingRight: js.UndefOr[Dimension] = js.undefined
  var paddingTop: js.UndefOr[Dimension] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
}

object TableCellStyle {
  @scala.inline
  def apply(
    backgroundColor: OptionalColor = null,
    borderBottom: TableCellBorder = null,
    borderLeft: TableCellBorder = null,
    borderRight: TableCellBorder = null,
    borderTop: TableCellBorder = null,
    columnSpan: Int | Double = null,
    contentAlignment: String = null,
    paddingBottom: Dimension = null,
    paddingLeft: Dimension = null,
    paddingRight: Dimension = null,
    paddingTop: Dimension = null,
    rowSpan: Int | Double = null
  ): TableCellStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (contentAlignment != null) __obj.updateDynamic("contentAlignment")(contentAlignment.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellStyle]
  }
}

