package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The style of a TableCell.  Inherited table cell styles are represented as
  * unset fields in this message. A table cell style can inherit from the
  * table&#39;s style.
  */
@js.native
trait Schema$TableCellStyle extends js.Object {
  /**
    * The background color of the cell.
    */
  var backgroundColor: js.UndefOr[Schema$OptionalColor] = js.native
  /**
    * The bottom border of the cell.
    */
  var borderBottom: js.UndefOr[Schema$TableCellBorder] = js.native
  /**
    * The left border of the cell.
    */
  var borderLeft: js.UndefOr[Schema$TableCellBorder] = js.native
  /**
    * The right border of the cell.
    */
  var borderRight: js.UndefOr[Schema$TableCellBorder] = js.native
  /**
    * The top border of the cell.
    */
  var borderTop: js.UndefOr[Schema$TableCellBorder] = js.native
  /**
    * The column span of the cell. This property is read-only.
    */
  var columnSpan: js.UndefOr[Double] = js.native
  /**
    * The alignment of the content in the table cell. The default alignment
    * matches the alignment for newly created table cells in the Docs editor.
    */
  var contentAlignment: js.UndefOr[String] = js.native
  /**
    * The bottom padding of the cell.
    */
  var paddingBottom: js.UndefOr[Schema$Dimension] = js.native
  /**
    * The left padding of the cell.
    */
  var paddingLeft: js.UndefOr[Schema$Dimension] = js.native
  /**
    * The right padding of the cell.
    */
  var paddingRight: js.UndefOr[Schema$Dimension] = js.native
  /**
    * The top padding of the cell.
    */
  var paddingTop: js.UndefOr[Schema$Dimension] = js.native
  /**
    * The row span of the cell. This property is read-only.
    */
  var rowSpan: js.UndefOr[Double] = js.native
}

object Schema$TableCellStyle {
  @scala.inline
  def apply(
    backgroundColor: Schema$OptionalColor = null,
    borderBottom: Schema$TableCellBorder = null,
    borderLeft: Schema$TableCellBorder = null,
    borderRight: Schema$TableCellBorder = null,
    borderTop: Schema$TableCellBorder = null,
    columnSpan: Int | Double = null,
    contentAlignment: String = null,
    paddingBottom: Schema$Dimension = null,
    paddingLeft: Schema$Dimension = null,
    paddingRight: Schema$Dimension = null,
    paddingTop: Schema$Dimension = null,
    rowSpan: Int | Double = null
  ): Schema$TableCellStyle = {
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
    __obj.asInstanceOf[Schema$TableCellStyle]
  }
}

