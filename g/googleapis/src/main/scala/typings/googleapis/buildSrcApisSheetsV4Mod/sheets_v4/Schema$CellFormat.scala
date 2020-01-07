package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The format of a cell.
  */
@js.native
trait Schema$CellFormat extends js.Object {
  /**
    * The background color of the cell.
    */
  var backgroundColor: js.UndefOr[Schema$Color] = js.native
  /**
    * The borders of the cell.
    */
  var borders: js.UndefOr[Schema$Borders] = js.native
  /**
    * The horizontal alignment of the value in the cell.
    */
  var horizontalAlignment: js.UndefOr[String] = js.native
  /**
    * How a hyperlink, if it exists, should be displayed in the cell.
    */
  var hyperlinkDisplayType: js.UndefOr[String] = js.native
  /**
    * A format describing how number values should be represented to the user.
    */
  var numberFormat: js.UndefOr[Schema$NumberFormat] = js.native
  /**
    * The padding of the cell.
    */
  var padding: js.UndefOr[Schema$Padding] = js.native
  /**
    * The direction of the text in the cell.
    */
  var textDirection: js.UndefOr[String] = js.native
  /**
    * The format of the text in the cell (unless overridden by a format run).
    */
  var textFormat: js.UndefOr[Schema$TextFormat] = js.native
  /**
    * The rotation applied to text in a cell
    */
  var textRotation: js.UndefOr[Schema$TextRotation] = js.native
  /**
    * The vertical alignment of the value in the cell.
    */
  var verticalAlignment: js.UndefOr[String] = js.native
  /**
    * The wrap strategy for the value in the cell.
    */
  var wrapStrategy: js.UndefOr[String] = js.native
}

object Schema$CellFormat {
  @scala.inline
  def apply(
    backgroundColor: Schema$Color = null,
    borders: Schema$Borders = null,
    horizontalAlignment: String = null,
    hyperlinkDisplayType: String = null,
    numberFormat: Schema$NumberFormat = null,
    padding: Schema$Padding = null,
    textDirection: String = null,
    textFormat: Schema$TextFormat = null,
    textRotation: Schema$TextRotation = null,
    verticalAlignment: String = null,
    wrapStrategy: String = null
  ): Schema$CellFormat = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (hyperlinkDisplayType != null) __obj.updateDynamic("hyperlinkDisplayType")(hyperlinkDisplayType.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (textDirection != null) __obj.updateDynamic("textDirection")(textDirection.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    if (textRotation != null) __obj.updateDynamic("textRotation")(textRotation.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (wrapStrategy != null) __obj.updateDynamic("wrapStrategy")(wrapStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CellFormat]
  }
}

