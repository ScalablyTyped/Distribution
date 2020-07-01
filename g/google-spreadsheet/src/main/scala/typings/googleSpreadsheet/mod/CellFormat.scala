package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFormat extends js.Object {
  /**
    * @description
    * background color of the cell
    */
  var backgroundColor: Color
  /**
    * @description
    * border settings of the cell
    */
  var borders: Borders
  /**
    * @description
    * horizontal alignment of the cell's value
    */
  var horizontalAlignment: HorizontalAlign
  /**
    * @description
    * how a hyperlink (if any) should be displayed
    */
  var hyperlinkDisplayType: HyperlinkDisplayType
  /**
    * @description
    * format describing how number values should be represented to the user
    */
  var numberFormat: NumberFormat
  /**
    * @description
    * padding in the cell
    * - spacing between inner text and cell boundaries
    */
  var padding: Padding
  /**
    * @description
    * display direction of cell value text
    */
  var textDirection: TextDirection
  /**
    * @description
    * format of the text in the cell
    * - font, size etc.
    */
  var textFormat: TextFormat
  /**
    * @description
    * rotation applied to text in a cell
    */
  var textRotation: TextRotation
  /**
    * @description
    * vertical alignment of the cell's value
    */
  var verticalAlignment: VerticalAlign
  /**
    * @description
    * text-wrapping strategy of the cell's value
    */
  var wrapStrategy: WrapStrategy
}

object CellFormat {
  @scala.inline
  def apply(
    backgroundColor: Color,
    borders: Borders,
    horizontalAlignment: HorizontalAlign,
    hyperlinkDisplayType: HyperlinkDisplayType,
    numberFormat: NumberFormat,
    padding: Padding,
    textDirection: TextDirection,
    textFormat: TextFormat,
    textRotation: TextRotation,
    verticalAlignment: VerticalAlign,
    wrapStrategy: WrapStrategy
  ): CellFormat = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borders = borders.asInstanceOf[js.Any], horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], hyperlinkDisplayType = hyperlinkDisplayType.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], textDirection = textDirection.asInstanceOf[js.Any], textFormat = textFormat.asInstanceOf[js.Any], textRotation = textRotation.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any], wrapStrategy = wrapStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFormat]
  }
}

